@file:Suppress("unused")

package io.github.kakaocup.kakao.scroll

import android.view.View
import android.widget.HorizontalScrollView
import android.widget.ScrollView
import androidx.core.widget.NestedScrollView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom
import io.github.kakaocup.kakao.common.actions.ScrollableActions
import io.github.kakaocup.kakao.common.actions.SwipeableActions
import org.hamcrest.Matchers
import org.hamcrest.Matchers.anyOf

/**
 * Provides ScrollableActions implementation for ScrollView
 *
 * @see ScrollableActions
 * @see SwipeableActions
 * @see ScrollView
 */
interface ScrollViewActions : ScrollableActions, SwipeableActions {
    override fun scrollToStart() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to start"

            override fun getConstraints() =
                Matchers.allOf(
                    anyOf(
                        isAssignableFrom(ScrollView::class.java),
                        isAssignableFrom(NestedScrollView::class.java),
                        isAssignableFrom(HorizontalScrollView::class.java),
                    ),
                    ViewMatchers.isDisplayed()
                )

            override fun perform(uiController: UiController?, view: View?) {
                when (view) {
                    is ScrollView -> view.fullScroll(View.FOCUS_UP)
                    is NestedScrollView -> view.fullScroll(View.FOCUS_UP)
                    is HorizontalScrollView -> view.fullScroll(View.FOCUS_LEFT)
                }
            }
        })
    }

    override fun scrollToEnd() {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to end"

            override fun getConstraints() =
                Matchers.allOf(
                    anyOf(
                        isAssignableFrom(ScrollView::class.java),
                        isAssignableFrom(NestedScrollView::class.java),
                        isAssignableFrom(HorizontalScrollView::class.java),
                    ),
                    ViewMatchers.isDisplayed()
                )

            override fun perform(uiController: UiController?, view: View?) {
                when (view) {
                    is ScrollView -> view.fullScroll(View.FOCUS_DOWN)
                    is NestedScrollView -> view.fullScroll(View.FOCUS_DOWN)
                    is HorizontalScrollView -> view.fullScroll(View.FOCUS_RIGHT)
                }
            }
        })
    }

    override fun scrollTo(position: Int) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Scroll ScrollView to $position Y position"

            override fun getConstraints() =
                Matchers.allOf(
                    anyOf(
                        isAssignableFrom(ScrollView::class.java),
                        isAssignableFrom(NestedScrollView::class.java),
                        isAssignableFrom(HorizontalScrollView::class.java),
                    ),
                    ViewMatchers.isDisplayed()
                )

            override fun perform(uiController: UiController?, view: View?) {
                when (view) {
                    is ScrollView -> view.scrollTo(0, position)
                    is NestedScrollView -> view.scrollTo(0, position)
                    is HorizontalScrollView -> view.scrollTo(position, 0)
                }
            }
        })
    }
}
