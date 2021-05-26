@file:Suppress("unused")

package io.github.kakaocup.kakao.swiperefresh

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.matchers.SwipeRefreshLayoutMatcher

/**
 * Provides assertion for SwipeRefreshLayout
 */
interface SwipeRefreshLayoutAssertions : BaseAssertions {
    /**
     * Checks if the SwipeRefreshLayout is refreshing
     */
    fun isRefreshing() {
        view.check(ViewAssertions.matches(SwipeRefreshLayoutMatcher(true)))
    }

    /**
     * Checks if the SwipeRefreshLayout is not refreshing
     */
    fun isNotRefreshing() {
        view.check(ViewAssertions.matches(SwipeRefreshLayoutMatcher(false)))
    }
}
