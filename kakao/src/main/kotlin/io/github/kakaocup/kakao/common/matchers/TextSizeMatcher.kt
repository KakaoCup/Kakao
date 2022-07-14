package io.github.kakaocup.kakao.common.matchers

import android.content.Context
import android.util.TypedValue
import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import kotlin.math.roundToInt
import org.hamcrest.Description

class TextSizeMatcher(private val textSizeInSp: Int) : BoundedMatcher<View, TextView>(TextView::class.java) {
    override fun describeTo(description: Description) {
        description.appendText("Text size doesn't match")
    }

    override fun matchesSafely(textView: TextView): Boolean =
        textView.textSize.roundToInt() == spToPx(textView.context, textSizeInSp)

    private fun spToPx(context: Context, sp: Int): Int =
        TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp.toFloat(), context.resources.displayMetrics)
            .roundToInt()
}
