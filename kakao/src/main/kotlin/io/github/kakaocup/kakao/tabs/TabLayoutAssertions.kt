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

    fun selectedTabText(text: String) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                checkSelectedText(view, text)
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

    fun selectedTabText(@StringRes resId: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TabLayout) {
                checkSelectedText(view, view.resources.getText(resId))
            } else {
                throw AssertionError("Expected TabLayout, but got $view")
            }
        }
    }

    @Suppress("ThrowsCount")
    private fun checkSelectedText(tabLayout: TabLayout, text: CharSequence) {
        val tab = tabLayout.getTabAt(tabLayout.selectedTabPosition) ?: throw AssertionError(
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
    fun tabCount(count: Int) {
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
