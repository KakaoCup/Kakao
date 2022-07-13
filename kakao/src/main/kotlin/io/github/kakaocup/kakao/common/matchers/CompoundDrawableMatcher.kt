@file:Suppress("unused")

package io.github.kakaocup.kakao.common.matchers

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.test.espresso.matcher.BoundedMatcher
import io.github.kakaocup.kakao.common.extentions.toBitmap
import io.github.kakaocup.kakao.common.utilities.getResourceDrawable
import org.hamcrest.Description

/**
 * Matcher of compound drawables for TextView
 *
 * @param leftDrawableResId - id res of left compound drawable
 * @param topDrawableResId - id res of top compound drawable
 * @param rightDrawableResId - id res of right compound drawable
 * @param bottomDrawableResId - id res of bottom compound drawable
 */
@Suppress("MagicNumber")
class CompoundDrawableMatcher(
    @DrawableRes private val leftDrawableResId: Int? = null,
    @DrawableRes private val topDrawableResId: Int? = null,
    @DrawableRes private val rightDrawableResId: Int? = null,
    @DrawableRes private val bottomDrawableResId: Int? = null
) : BoundedMatcher<View, TextView>(TextView::class.java) {

    override fun matchesSafely(view: TextView?) = view?.let {
        val leftActual: Drawable? = it.compoundDrawables[0]
        val topActual: Drawable? = it.compoundDrawables[1]
        val rightActual: Drawable? = it.compoundDrawables[2]
        val bottomActual: Drawable? = it.compoundDrawables[3]

        compare(leftDrawableResId, leftActual)
                && compare(topDrawableResId, topActual)
                && compare(rightDrawableResId, rightActual)
                && compare(bottomDrawableResId, bottomActual)

    } ?: false

    override fun describeTo(description: Description) {
        description.appendText("Compound drawables doesn't match")
    }

    private fun compare(@DrawableRes expectedResId: Int? = null, actualDrawable: Drawable?): Boolean {
        if (expectedResId == null && actualDrawable == null) return true
        if (expectedResId != null && actualDrawable == null) return false
        if (expectedResId == null && actualDrawable != null) return false

        val expectedBitmap = getResourceDrawable(expectedResId!!)?.mutate()?.toBitmap()
        val actualBitmap = actualDrawable?.toBitmap()

        if (expectedBitmap != null && actualBitmap != null) {
            return expectedBitmap.sameAs(actualBitmap)
        }

        return false
    }
}
