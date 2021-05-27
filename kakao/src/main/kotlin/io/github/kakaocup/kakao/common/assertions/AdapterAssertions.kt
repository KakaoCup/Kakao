@file:Suppress("unused")

package io.github.kakaocup.kakao.common.assertions

import io.github.kakaocup.kakao.delegate.ViewInteractionDelegate

/**
 * Provides assertions for view with adapters
 *
 * @see io.github.kakaocup.kakao.recycler.RecyclerAdapterAssertions
 * @see io.github.kakaocup.kakao.list.AbsListViewAdapterAssertions
 */
interface AdapterAssertions {
    val view: ViewInteractionDelegate
}
