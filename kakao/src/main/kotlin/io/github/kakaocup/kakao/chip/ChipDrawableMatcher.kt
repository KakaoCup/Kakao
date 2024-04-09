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
        val expectedDrawable: Drawable? = when {
            drawable != null -> drawable
            resId >= 0 -> getResourceDrawable(resId)?.mutate()
            else -> return (view as? Chip)?.chipDrawable == null
        }

        // Apply backward compatibility wrap and tints if necessary
        val finalDrawable = expectedDrawable.processDrawableForDueToSdk() ?: return false

        // Compare actual vs expected drawables
        return (view as? Chip)?.getChipActualDrawable(chipIconType)?.mutate()?.let { actualDrawable ->
            val actualBitmap = toBitmap?.invoke(actualDrawable) ?: actualDrawable.toBitmap()
            val expectedBitmap = toBitmap?.invoke(finalDrawable) ?: finalDrawable.toBitmap()
            actualBitmap.sameAs(expectedBitmap)
        } ?: false
    }

    private fun Drawable?.processDrawableForDueToSdk() = when {
        Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP && this != null -> DrawableCompat.wrap(
            this
        )
            .mutate()

        Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP && tintColorId != null -> this?.apply {
            val tintColor = getResourceColor(tintColorId)
            setTintList(ColorStateList.valueOf(tintColor))
            setTintMode(PorterDuff.Mode.SRC_IN)
        }

        else -> this
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
