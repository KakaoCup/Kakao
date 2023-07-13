@file:Suppress("unused")

package io.github.kakaocup.kakao.bottomnav

import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import com.google.android.material.bottomnavigation.BottomNavigationView

/**
 * Provides assertion for BottomNavigationview
 */
interface BottomNavigationViewAssertions : BaseAssertions {
    /**
     * Checks if the view's selected item id matches given one
     *
     * @param id Menu item id to be checked
     */
    fun hasSelectedItem(id: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is BottomNavigationView) {
                if (view.selectedItemId != id) {
                    throw AssertionError(
                        "Expected selected item id is $id," +
                            " but actual is ${view.selectedItemId}"
                    )
                }
            } else {
                throw AssertionError("Expected BottomNavigationView, but got $view")
            }
        }
    }
}
