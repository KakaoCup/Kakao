package io.github.kakaocup.kakao.chip

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.test.espresso.assertion.ViewAssertions
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

interface ChipAssertions : BaseAssertions {

    /**
     * Check if Chip has correct icon for [ChipIconType.CHECKED] icon type.
     *
     * @param resId Drawable resource to be matched (default is -1)
     * @param drawable Drawable instance to be matched (default is null)
     * @param tintColorId Tint color resource id (default is null)
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasCheckedIcon(
        @DrawableRes resId: Int = -1,
        drawable: Drawable? = null,
        @ColorRes tintColorId: Int? = null,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null,
    ) = view.check(ViewAssertions.matches(ChipDrawableMatcher(resId, drawable, ChipIconType.CHECKED, tintColorId, toBitmap)))


    /**
     * Check if Chip has correct icon for [ChipIconType.CHIP] icon type.
     *
     * @param resId Drawable resource to be matched (default is -1)
     * @param drawable Drawable instance to be matched (default is null)
     * @param tintColorId Tint color resource id (default is null)
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasChipIcon(
        @DrawableRes resId: Int = -1,
        drawable: Drawable? = null,
        @ColorRes tintColorId: Int? = null,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null,
    ) = view.check(ViewAssertions.matches(ChipDrawableMatcher(resId, drawable, ChipIconType.CHIP, tintColorId, toBitmap)))

    /**
     * Check if Chip has correct icon for [ChipIconType.CLOSE] icon type.
     *
     * @param resId Drawable resource to be matched (default is -1)
     * @param drawable Drawable instance to be matched (default is null)
     * @param tintColorId Tint color resource id (default is null)
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasCloseIcon(
        @DrawableRes resId: Int = -1,
        drawable: Drawable? = null,
        @ColorRes tintColorId: Int? = null,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null,
    ) = view.check(ViewAssertions.matches(ChipDrawableMatcher(resId, drawable, ChipIconType.CLOSE, tintColorId, toBitmap)))

    /**
     * Verify all icons are hidden
     */
    fun hasNoIconVisible() = view.check(ViewAssertions.matches(object : TypeSafeMatcher<View>(View::class.java) {
        override fun describeTo(desc: Description) {
            desc.appendText("without any icons visible")
        }

        override fun matchesSafely(view: View): Boolean {
            val viewAsChip = view as? Chip ?: return false
            return (viewAsChip.chipDrawable as? ChipDrawable)?.verifyNoIconVisible() ?: run {
                println("Drawable should be ChipDrawable unless implementation has changed")
                false
            }
        }
    }))

    fun ChipDrawable.verifyNoIconVisible(): Boolean {
        return !isCheckedIconVisible && !isChipIconVisible && !isCloseIconVisible
    }
}
