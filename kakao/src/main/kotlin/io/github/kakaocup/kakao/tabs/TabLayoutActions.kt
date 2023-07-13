@file:Suppress("unused")

package io.github.kakaocup.kakao.tabs

import android.view.View
import androidx.test.espresso.PerformException
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.util.HumanReadables
import io.github.kakaocup.kakao.common.actions.BaseActions
import com.google.android.material.tabs.TabLayout

/**
 * Provides action for TabLayout
 */
interface TabLayoutActions : BaseActions {
    /**
     * Selects tab at given index
     *
     * @param index tab index to be selected
     */
    fun selectTab(index: Int) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Selects the tab at index: $index"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(TabLayout::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is TabLayout) {
                    view.getTabAt(index)!!.select()
                }
            }
        })
    }

    /**
     * Selects tab at given text
     *
     * @param text to be selected
     */
    fun selectTab(text: String) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Selects the tab with text: $text"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(TabLayout::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is TabLayout) {
                    for (i in 0 until view.tabCount) {
                        view.getTabAt(i)?.let { tab ->
                            if (tab.text == text) {
                                tab.select()
                                return
                            }
                        }
                    }

                    throw PerformException.Builder()
                        .withActionDescription(description)
                        .withViewDescription(HumanReadables.describe(view))
                        .withCause(
                            RuntimeException("Tab with text $text not found")
                        )
                        .build()
                }
            }
        })
    }

    /**
     * Returns the currently selected tab position
     *
     * @return selected tab position
     */
    fun getSelectedItem(): Int {
        var position = 0

        view.perform(object : ViewAction {
            override fun getDescription() = "Gets selected tab position"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(TabLayout::class.java)

            override fun perform(uiController: UiController, view: View) {
                if (view is TabLayout) {
                    position = view.selectedTabPosition
                }
            }
        })

        return position
    }
}
