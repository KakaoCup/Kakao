package io.github.kakaocup.kakao.common.matchers

import android.graphics.Typeface
import android.view.View
import android.widget.TextView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class TypefaceMatcher(private val typeface: Typeface) : BoundedMatcher<View, TextView>(TextView::class.java) {
    override fun describeTo(description: Description) {
        description.appendText("Typeface doesn't match")
    }

    override fun matchesSafely(item: TextView): Boolean =
        item.typeface.equals(this.typeface)
}
