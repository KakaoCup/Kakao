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

class SpanDrawableMatcher(
    @DrawableRes private val resId: Int = -1,
    private val drawable: Drawable? = null,
    @ColorRes private val tintColorId: Int? = null,
    private val toBitmap: ((drawable: Drawable) -> Bitmap)? = null,
    private val queryStart: Int = 0,
    private var queryEnd: Int? = null,
    private val spanIndex: Int = 0
) : TypeSafeMatcher<View>(View::class.java) {

    override fun describeTo(desc: Description) {
        desc.appendText("with drawable id $resId")
    }

    override fun matchesSafely(view: View?): Boolean {

        if (view !is TextView && drawable == null) {
            return false
        }

        if (queryEnd == null) {
            queryEnd = (view as TextView).text.length
        }

        if (resId < 0 && drawable == null) {
            val spannedString = (view as TextView).text as SpannedString
            return spannedString.getSpans(queryStart, queryEnd!!, ImageSpan::class.java)[spanIndex].drawable == null
        }

        return view?.let { textView ->
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

            val spannedString = (textView as TextView).text as SpannedString
            val spans = spannedString.getSpans(queryStart, queryEnd!!, ImageSpan::class.java)

            val convertDrawable = spans[spanIndex].drawable.mutate()
            val bitmap = toBitmap?.invoke(convertDrawable) ?: convertDrawable.toBitmap()

            val otherBitmap = toBitmap?.invoke(expectedDrawable) ?: expectedDrawable.toBitmap()

            return bitmap.sameAs(otherBitmap)
        } ?: false
    }
}
