package io.github.kakaocup.kakao.common.matchers

import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class BoldStyleMatcher : BoundedMatcher<View, TextView>(TextView::class.java) {
    override fun describeTo(description: Description) {
        description.appendText("Bold text style doesn't match.")
    }

    override fun matchesSafely(textView: TextView): Boolean = textView.typeface.isBold
}
