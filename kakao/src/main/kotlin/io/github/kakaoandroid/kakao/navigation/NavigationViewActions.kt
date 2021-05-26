@file:Suppress("unused")

package io.github.kakaoandroid.kakao.navigation

import androidx.test.espresso.contrib.NavigationViewActions
import io.github.kakaoandroid.kakao.common.actions.BaseActions

/**
 * Provides actions for navigation view
 */
interface NavigationViewActions : BaseActions {
    /**
     * Clicks on the navigation view menu item with given id
     *
     * @param id Menu id to be navigated to
     */
    fun navigateTo(id: Int) {
        view.perform(NavigationViewActions.navigateTo(id))
    }
}
