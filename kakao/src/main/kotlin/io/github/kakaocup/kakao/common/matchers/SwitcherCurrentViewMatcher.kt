@file:Suppress("unused")

package io.github.kakaocup.kakao.common.matchers

import android.view.View
import android.widget.ViewSwitcher
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

/**
 * Matches current view in View Switcher
 */
class SwitcherCurrentViewMatcher : BoundedMatcher<View, View>(View::class.java) {
    override fun matchesSafely(view: View?) = view?.let {
        (it.parent as ViewSwitcher).currentView.equals(it)
    } ?: false

    override fun describeTo(description: Description) {
        description.appendText("Can't match current view for Switcher")
    }
}
