@file:Suppress("unused")

package io.github.kakaoandroid.kakao.navigation

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaoandroid.kakao.common.assertions.BaseAssertions
import io.github.kakaoandroid.kakao.common.matchers.NavigationItemMatcher

/**
 * Provides assertions for NavigationView
 */
interface NavigationViewAssertions : BaseAssertions {
    /**
     * Checks if NavigationView has checked given item id
     *
     * @param id menu item expected to be checked
     */
    fun isItemChecked(id: Int) {
        view.check(ViewAssertions.matches(NavigationItemMatcher(id)))
    }
}
