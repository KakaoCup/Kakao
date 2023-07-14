@file:Suppress("unused")

package io.github.kakaocup.kakao.tabs

import androidx.annotation.StringRes
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import com.google.android.material.tabs.TabLayout

/**
 * Provides assertions for TabLayout
 */
interface TabLayoutAssertions : BaseAssertions {
    /**
     * Checks if TabLayout have selected tab with given index
     *
     * @param index tab index to be checked
     */
    fun isTabSelected(index: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                if (view.selectedTabPosition != index) {
                    throw AssertionError(
                        "Expected selected item index is $index," +
                            " but actual is ${view.selectedTabPosition}"
                    )
                }
            } else {
                throw AssertionError("Expected TabLayout, but got $view")
            }
        }
    }

    /**
     * Checks if TabLayout have selected tab with given text
     *
     * @param text tab title to be checked
     */

    fun hasSelectedText(text: String) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                checkSelectedText(view, view.selectedTabPosition, text)
            } else {
                throw AssertionError("Expected TabLayout, but got $view")
            }
        }
    }

    /**
     * Checks if TabLayout have selected tab with given text
     *
     * @param resId reference to string id resource
     */

    fun hasSelectedText(@StringRes resId: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                checkSelectedText(view, view.selectedTabPosition, view.resources.getText(resId))
            } else {
                throw AssertionError("Expected TabLayout, but got $view")
            }
        }
    }

    /**
     * Checks if TabLayout have selected tab with given text
     *
     * @param text tab title to be checked
     * @param position tab position, starts from 0
     */

    fun hasText(text: String, position: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                checkSelectedText(view, position, text)
            } else {
                throw AssertionError("Expected TabLayout, but got $view")
            }
        }
    }

    /**
     * Checks if TabLayout have selected tab with given text
     *
     * @param resId reference to string id resource
     * @param position tab position, starts from 0
     */

    fun hasText(@StringRes resId: Int, position: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                checkSelectedText(view, position, view.resources.getText(resId))
            } else {
                throw AssertionError("Expected TabLayout, but got $view")
            }
        }
    }

    @Suppress("ThrowsCount")
    private fun checkSelectedText(tabLayout: TabLayout, tabPosition: Int, text: CharSequence) {
        val tab = tabLayout.getTabAt(tabPosition) ?: throw AssertionError(
            "Expected selected item text is $text, but tab not selected"
        )

        if (tab.text != text) {
            throw AssertionError(
                "Expected selected item text is $text," +
                    " but actual is ${tab.text ?: ""}"
            )
        }
    }

    /**
     * Checks the number of tabs currently registered with the action bar
     *
     * @param count tabs
     */
    fun hasTabCount(count: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                if (view.tabCount != count) {
                    throw AssertionError(
                        "Expected tabs currently registered with the action bar $count," +
                            " but actual is ${view.tabCount}"
                    )
                }
            } else {
                throw AssertionError("Expected TabLayout, but got $view")
            }
        }
    }
}
