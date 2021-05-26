@file:Suppress("unused")

package io.github.kakaoandroid.kakao.recycler

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaoandroid.kakao.common.assertions.AdapterAssertions
import io.github.kakaoandroid.kakao.common.matchers.RecyclerViewAdapterSizeMatcher

/**
 * Provides assertions for recyclerView adapter
 */
interface RecyclerAdapterAssertions : AdapterAssertions {
    /**
     * Check size of recycler view
     *
     * @param size expected child count size in recycler view
     */
    fun hasSize(size: Int) {
        view.check(ViewAssertions.matches(RecyclerViewAdapterSizeMatcher(size)))
    }
}
