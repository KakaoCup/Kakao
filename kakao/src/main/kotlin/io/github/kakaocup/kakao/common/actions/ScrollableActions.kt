@file:Suppress("unused")

package io.github.kakaocup.kakao.common.actions

/**
 * Provides scrolling actions for view
 *
 * Important: does not hold any implementation
 *
 * @see io.github.kakaocup.kakao.recycler.RecyclerActions
 * @see io.github.kakaocup.kakao.scroll.ScrollViewActions
 */
interface ScrollableActions : BaseActions {
    /**
     * Scrolls to the starting position of the view
     */
    fun scrollToStart()

    /**
     * Scrolls to the last position of the view
     */
    fun scrollToEnd()

    /**
     * Scrolls to the specific position of the view
     *
     * @param position Scrolling destination
     */
    fun scrollTo(position: Int)
}
