package io.github.kakaocup.kakao.common.matchers

import android.content.res.ColorStateList
import android.graphics.Bitmap
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import android.text.SpannedString
import android.text.style.ImageSpan
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.graphics.drawable.DrawableCompat
import io.github.kakaocup.kakao.common.extentions.toBitmap
import io.github.kakaocup.kakao.common.utilities.getResourceColor
import io.github.kakaocup.kakao.common.utilities.getResourceDrawable
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

/**
 * Matches given drawable with specified span
 *
 * @param resId Drawable resource to be matched (default is -1)
 * @param drawable Drawable instance to be matched (default is null)
 * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
 * @param queryStart Index of the character that is the beginning of the range of text to which span is attached (default is 0)
 * @param queryEnd Index of the character that is the end of the range of text to which span is attached (default is null)
 * @param spanIndex Index of span in string's spans array (default is 0)
 */
@Suppress("LongParameterList")
class SpanDrawableMatcher(
    @DrawableRes private val resId: Int = -1,
    private val drawable: Drawable? = null,
    @ColorRes private val tintColorId: Int? = null,
    private val toBitmap: ((drawable: Drawable) -> Bitmap)? = null,
    private val queryStart: Int = 0,
    private val queryEnd: Int? = null,
    private val spanIndex: Int = 0
) : TypeSafeMatcher<View>(View::class.java) {

    override fun describeTo(desc: Description) {
        desc.appendText("with span drawable id $resId or provided instance")
    }

    override fun matchesSafely(view: View?): Boolean {
        if (view !is TextView?) {
            return false
        }

        if (resId < 0 && drawable == null) {
            return getActualDrawable(view) == null
        }

        return view?.let {
            val expectedDrawable = getExpectedDrawable() ?: return false
            val actualDrawable = getActualDrawable(view) ?: return false

            val actualBitmap = toBitmap?.invoke(actualDrawable) ?: actualDrawable.toBitmap()
            val expectedBitmap = toBitmap?.invoke(expectedDrawable) ?: expectedDrawable.toBitmap()

            return actualBitmap.sameAs(expectedBitmap)
        } ?: false
    }

    private fun getExpectedDrawable(): Drawable? {
        var expectedDrawable: Drawable? = (drawable ?: getResourceDrawable(resId))?.mutate()

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

        return expectedDrawable
    }

    private fun getActualDrawable(textView: View?): Drawable? {
        textView as TextView
        val spanEnd = queryEnd ?: textView.text.length
        val spannedString = textView.text as SpannedString
        val spans = spannedString.getSpans(queryStart, spanEnd, ImageSpan::class.java)
        return spans[spanIndex].drawable?.mutate()
    }
}
