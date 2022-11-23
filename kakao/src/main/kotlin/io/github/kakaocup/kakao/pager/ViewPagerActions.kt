package io.github.kakaocup.kakao.pager

import androidx.test.espresso.action.ViewActions
import io.github.kakaocup.kakao.common.actions.BaseActions
import io.github.kakaocup.kakao.common.actions.SwipeableActions
import androidx.test.espresso.contrib.ViewPagerActions as EspressoViewPagerActions

interface ViewPagerActions : BaseActions {

    /**
     * Swipes left on the view
     */
    @Deprecated(
        "Use scrollRight()",
        replaceWith = ReplaceWith("scrollRight()")
    )
    fun swipeLeft() {
        view.perform(EspressoViewPagerActions.scrollRight(true))
    }

    /**
     * Swipes right on the view
     */
    @Deprecated(
        "Use scrollLeft()",
        replaceWith = ReplaceWith("scrollLeft()")
    )
    fun swipeRight() {
        view.perform(EspressoViewPagerActions.scrollLeft(true))
    }

    /**
     * Swipes up on the view
     */
    @Deprecated("ViewPager doesn't support swipeUp action")
    fun swipeUp() {
        view.perform(ViewActions.swipeUp())
    }

    /**
     * Swipes down on the view
     */
    @Deprecated("ViewPager doesn't support swipeDown action")
    fun swipeDown() {
        view.perform(ViewActions.swipeDown())
    }

    /** Moves <code>ViewPager</code> to the left be one page. */
    fun scrollLeft() {
        view.perform(EspressoViewPagerActions.scrollLeft())
    }

    /** Moves <code>ViewPager</code> to the right be one page. */
    fun scrollRight() {
        view.perform(EspressoViewPagerActions.scrollRight())
    }

    /** Moves <code>ViewPager</code> to the first page. */
    fun scrollToFirst() {
        view.perform(EspressoViewPagerActions.scrollToFirst())
    }

    /** Moves <code>ViewPager</code> to the last page. */
    fun scrollToLast() {
        view.perform(EspressoViewPagerActions.scrollToLast())
    }

    /** Moves <code>ViewPager</code> to a specific page. */
    fun scrollToPage(page: Int) {
        view.perform(EspressoViewPagerActions.scrollToPage(page))
    }
}
