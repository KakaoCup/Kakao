@file:Suppress("unused")

package io.github.kakaoandroid.kakao.common.assertions

import io.github.kakaoandroid.kakao.delegate.ViewInteractionDelegate

/**
 * Provides assertions for view with adapters
 *
 * @see com.agoda.kakao.recycler.RecyclerAdapterAssertions
 * @see com.agoda.kakao.list.AbsListViewAdapterAssertions
 */
interface AdapterAssertions {
    val view: ViewInteractionDelegate
}
