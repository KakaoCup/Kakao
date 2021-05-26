@file:Suppress("unused")

package io.github.kakaocup.kakao.list

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaocup.kakao.common.assertions.AdapterAssertions
import io.github.kakaocup.kakao.common.matchers.AbsListViewAdapterSizeMatcher

/**
 * Provides assertions for AbsListView adapter
 */
interface AbsListViewAdapterAssertions : AdapterAssertions {
    /**
     * Check size of AbsListView
     *
     * @param size expected child count size in AbsListView
     */
    fun hasSize(size: Int) {
        view.check(ViewAssertions.matches(AbsListViewAdapterSizeMatcher(size)))
    }
}
