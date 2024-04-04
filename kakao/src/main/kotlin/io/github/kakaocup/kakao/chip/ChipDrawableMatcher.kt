package io.github.kakaocup.kakao.chip

import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.graphics.drawable.DrawableCompat
import com.google.android.material.chip.Chip
import io.github.kakaocup.kakao.common.extentions.toBitmap
import io.github.kakaocup.kakao.common.utilities.getResourceColor
import io.github.kakaocup.kakao.common.utilities.getResourceDrawable
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

/**
 * Matches given drawable with current one for the [chipIconType] drawable type.
 *
 * @param resId Drawable resource to be matched (default is -1)
 * @param drawable Drawable instance to be matched (default is null)
 * @param chipIconType drawable type to verify against
 * @param tintColorId Tint color resource id (default is null)
 * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
 */
class ChipDrawableMatcher(
    @DrawableRes private val resId: Int = -1,
    private val drawable: Drawable? = null,
    private val chipIconType: ChipIconType,
    @ColorRes private val tintColorId: Int? = null,
    private val toBitmap: ((drawable: Drawable) -> Bitmap)? = null,
) : TypeSafeMatcher<View>(View::class.java) {

    override fun describeTo(desc: Description) {
        desc.appendText("with drawable id $resId or provided instance for the $chipIconType icon")
    }

    override fun matchesSafely(view: View?): Boolean {
        val viewAsChip = view as? Chip ?: return false

        if (resId < 0 && drawable == null) {
            return viewAsChip.chipDrawable == null
        }

        var expectedDrawable: Drawable? = drawable ?: getResourceDrawable(resId)?.mutate()

        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP && expectedDrawable != null) {
            expectedDrawable = DrawableCompat.wrap(expectedDrawable).mutate()
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tintColorId?.let { tintColorId ->
                val tintColor = getResourceColor(tintColorId)
                expectedDrawable?.apply {
                    setTintList(ColorStateList.valueOf(tintColor))
                    setTintMode(PorterDuff.Mode.SRC_IN)
                }
            }
        }

        if (expectedDrawable == null) {
            return false
        }

        return viewAsChip.getChipActualDrawable(chipIconType)?.mutate()?.let {
            val bitmap = toBitmap?.invoke(it) ?: it.toBitmap()

            val otherBitmap = toBitmap?.invoke(expectedDrawable) ?: expectedDrawable.toBitmap()
            bitmap.sameAs(otherBitmap)
        } ?: false
    }

    private fun Chip.getChipActualDrawable(chipIconType: ChipIconType): Drawable? = when (chipIconType) {
        ChipIconType.CHECKED -> checkedIcon?.takeIf { isCheckedIconVisible }
        ChipIconType.CHIP -> chipIcon?.takeIf { isChipIconVisible }
        ChipIconType.CLOSE -> closeIcon?.takeIf { isCloseIconVisible }
    }
}

enum class ChipIconType {
    CHECKED,
    CHIP,
    CLOSE,
}
