package io.github.kakaocup.kakao.common.matchers

import android.view.Gravity
import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class TextViewGravityMatcher(
    private val horizontalGravity: Int?,
    private val verticalGravity: Int?,
) : BoundedMatcher<View, TextView>(TextView::class.java) {

    override fun describeTo(description: Description) {
        description.appendText("Gravity doesn't match")
    }

    override fun matchesSafely(textView: TextView): Boolean {
        var compareResult = true
        if (horizontalGravity != null) {
            compareResult = compareResult && textView.gravity and Gravity.RELATIVE_HORIZONTAL_GRAVITY_MASK == horizontalGravity
        }
        if (verticalGravity != null) {
            compareResult = compareResult && textView.gravity and Gravity.VERTICAL_GRAVITY_MASK == verticalGravity
        }
        return compareResult
    }
}
