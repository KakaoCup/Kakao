@file:Suppress("unused")

package io.github.kakaocup.kakao.common.matchers

import android.content.res.ColorStateList
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.test.espresso.matcher.BoundedMatcher
import io.github.kakaocup.kakao.common.extentions.toBitmap
import io.github.kakaocup.kakao.common.utilities.getResourceColor
import io.github.kakaocup.kakao.common.utilities.getResourceDrawable
import org.hamcrest.Description

/**
 * Matcher of compound drawables for TextView
 *
 * @param leftDrawableResId - id res of left compound drawable
 * @param topDrawableResId - id res of top compound drawable
 * @param rightDrawableResId - id res of right compound drawable
 * @param bottomDrawableResId - id res of bottom compound drawable
 * @param tintColorId - id res of compound drawable tint
 */
@Suppress("MagicNumber")
class CompoundDrawableMatcher(
    @DrawableRes private val leftDrawableResId: Int? = null,
    @DrawableRes private val topDrawableResId: Int? = null,
    @DrawableRes private val rightDrawableResId: Int? = null,
    @DrawableRes private val bottomDrawableResId: Int? = null,
    @ColorRes private val tintColorId: Int? = null,
) : BoundedMatcher<View, TextView>(TextView::class.java) {

    override fun matchesSafely(view: TextView?) = view?.let {
        val leftActual: Drawable? = it.compoundDrawables[0]
        val topActual: Drawable? = it.compoundDrawables[1]
        val rightActual: Drawable? = it.compoundDrawables[2]
        val bottomActual: Drawable? = it.compoundDrawables[3]

        compare(leftDrawableResId, tintColorId, leftActual)
                && compare(topDrawableResId, tintColorId, topActual)
                && compare(rightDrawableResId, tintColorId, rightActual)
                && compare(bottomDrawableResId, tintColorId, bottomActual)

    } ?: false

    override fun describeTo(description: Description) {
        description.appendText("Compound drawables doesn't match")
    }

    private fun compare(
        @DrawableRes expectedResId: Int? = null,
        @ColorRes tintColorId: Int? = null,
        actualDrawable: Drawable?
    ): Boolean {
        if (expectedResId == null && actualDrawable == null) return true
        if (expectedResId != null && actualDrawable == null) return false
        if (expectedResId == null && actualDrawable != null) return false

        val expectedDrawable = getResourceDrawable(expectedResId!!)?.mutate()

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            tintColorId?.let {
                val tintColor = getResourceColor(it)
                expectedDrawable?.apply {
                    setTintList(ColorStateList.valueOf(tintColor))
                    setTintMode(PorterDuff.Mode.SRC_IN)
                }
            }
        }
        val expectedBitmap = expectedDrawable?.toBitmap()
        val actualBitmap = actualDrawable?.toBitmap()

        if (expectedBitmap != null && actualBitmap != null) {
            return expectedBitmap.sameAs(actualBitmap)
        }

        return false
    }
}
