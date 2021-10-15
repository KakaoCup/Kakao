@file:Suppress("unused")

package io.github.kakaocup.kakao.common.matchers

import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

/**
 * Matcher for hint value in TextView
 *
 * @param hint that matched the view which can be casted to TextView
 */
class HintMatcher(private val hint: String) : BoundedMatcher<View, TextView>(TextView::class.java) {
    override fun matchesSafely(view: TextView?) = view?.let { it.hint == hint } ?: false

    override fun describeTo(description: Description) {
        description.appendText("Hint value is: $hint")
    }
}
