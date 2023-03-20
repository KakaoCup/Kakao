package io.github.kakaocup.kakao.pager

import io.github.kakaocup.kakao.common.actions.BaseActions
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

    /** Moves <code>ViewPager</code> to the left be one page. */
    fun scrollLeft(smoothScroll: Boolean = false) {
        view.perform(EspressoViewPagerActions.scrollLeft(smoothScroll))
    }

    /** Moves <code>ViewPager</code> to the right be one page. */
    fun scrollRight(smoothScroll: Boolean = false) {
        view.perform(EspressoViewPagerActions.scrollRight(smoothScroll))
    }

    /** Moves <code>ViewPager</code> to the first page. */
    fun scrollToFirst(smoothScroll: Boolean = false) {
        view.perform(EspressoViewPagerActions.scrollToFirst(smoothScroll))
    }

    /** Moves <code>ViewPager</code> to the last page. */
    fun scrollToLast(smoothScroll: Boolean = false) {
        view.perform(EspressoViewPagerActions.scrollToLast(smoothScroll))
    }

    /** Moves <code>ViewPager</code> to a specific page. */
    fun scrollToPage(page: Int, smoothScroll: Boolean = false) {
        view.perform(EspressoViewPagerActions.scrollToPage(page, smoothScroll))
    }

    /** Clicks between two titles in a <code>ViewPager</code> title strip */
    fun clickBetweenTwoTitles(title1: String, title2: String) {
        view.perform(EspressoViewPagerActions.clickBetweenTwoTitles(title1, title2))
    }
}
