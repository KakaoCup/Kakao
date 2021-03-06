@file:Suppress("unused")

package io.github.kakaocup.kakao.screen

import androidx.test.espresso.action.EspressoKey
import androidx.test.espresso.action.ViewActions
import io.github.kakaocup.kakao.delegate.ViewInteractionDelegate

/**
 * Interface with common actions for all screens
 *
 * Provides basic actions that can be performed on each and every screen
 *
 * @property view ViewInteractionDelegate on which all actions are performed (root view by default)
 */
interface ScreenActions {
    val view: ViewInteractionDelegate

    /**
     * Performs click on device's back button
     */
    fun pressBack() {
        view.perform(ViewActions.pressBack())
    }

    /**
     * Closes soft keyboard, if opened
     */
    fun closeSoftKeyboard() {
        view.perform(ViewActions.closeSoftKeyboard())
    }

    /**
     * Presses a key with corresponding KeyCode
     */
    fun pressKey(keyCode: Int) {
        view.perform(ViewActions.pressKey(keyCode))
    }

    /**
     * Presses a key with correspondingKeyCode and modifiers
     */
    fun pressKey(key: EspressoKey) {
        view.perform(ViewActions.pressKey(key))
    }

    /**
     * Presses the hardware menu key
     */
    fun pressMenuKey() {
        view.perform(ViewActions.pressMenuKey())
    }
}
