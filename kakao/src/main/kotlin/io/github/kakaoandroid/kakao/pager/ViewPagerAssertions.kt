@file:Suppress("unused")

package io.github.kakaoandroid.kakao.pager

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaoandroid.kakao.common.assertions.BaseAssertions
import io.github.kakaoandroid.kakao.common.matchers.PageMatcher

/**
 * Provides assertions for view pagers
 */
interface ViewPagerAssertions : BaseAssertions {
    /**
     * Checks if the view is currently at given page
     *
     * @param index Page index to be matched
     */
    fun isAtPage(index: Int) {
        view.check(ViewAssertions.matches(PageMatcher(index)))
    }
}
