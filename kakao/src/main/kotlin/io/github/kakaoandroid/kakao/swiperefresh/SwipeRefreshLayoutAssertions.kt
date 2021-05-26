@file:Suppress("unused")

package io.github.kakaoandroid.kakao.swiperefresh

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaoandroid.kakao.common.assertions.BaseAssertions
import io.github.kakaoandroid.kakao.common.matchers.SwipeRefreshLayoutMatcher

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
