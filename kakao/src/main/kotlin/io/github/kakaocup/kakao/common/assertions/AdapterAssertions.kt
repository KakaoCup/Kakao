@file:Suppress("unused")

package io.github.kakaocup.kakao.common.assertions

import io.github.kakaocup.kakao.delegate.ViewInteractionDelegate

/**
 * Provides assertions for view with adapters
 *
 * @see com.agoda.kakao.recycler.RecyclerAdapterAssertions
 * @see com.agoda.kakao.list.AbsListViewAdapterAssertions
 */
interface AdapterAssertions {
    val view: ViewInteractionDelegate
}
