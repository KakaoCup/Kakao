@file:Suppress("unused")

package io.github.kakaocup.kakao.check

import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import io.github.kakaocup.kakao.common.assertions.BaseAssertions

/**
 * Provides checkable based assertions for views
 */
interface CheckableAssertions : BaseAssertions {
    /**
     * Checks if the view is checked
     */
    fun isChecked() {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.isChecked()
            )
        )
    }

    /**
     * Checks if the view is not checked
     */
    fun isNotChecked() {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.isNotChecked()
            )
        )
    }
}
