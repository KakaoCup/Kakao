@file:Suppress("unused")

package io.github.kakaocup.kakao.recycler

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaocup.kakao.common.assertions.AdapterAssertions
import io.github.kakaocup.kakao.common.matchers.RecyclerViewAdapterSizeMatcher

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
