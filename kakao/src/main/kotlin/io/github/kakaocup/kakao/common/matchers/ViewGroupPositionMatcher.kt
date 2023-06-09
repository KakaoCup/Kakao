@file:Suppress("unused")

package io.github.kakaocup.kakao.common.matchers

import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

/**
 * Matches Group descendant at given position
 *
 * @param position Position of item in group view
 */
class ViewGroupPositionMatcher(private val position: Int) : BoundedMatcher<View, View>(View::class.java) {
    override fun matchesSafely(view: View?) = view?.let {
        (it.parent as ViewGroup).getChildAt(position).equals(it)
    } ?: false

    override fun describeTo(description: Description) {
        description.appendText("Can't match view on $position position")
    }
}
