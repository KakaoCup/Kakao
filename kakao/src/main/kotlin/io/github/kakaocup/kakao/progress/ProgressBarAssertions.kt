@file:Suppress("unused")

package io.github.kakaocup.kakao.progress

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.matchers.ProgressMatcher

/**
 * Provides assertions for progress bar
 */
interface ProgressBarAssertions : BaseAssertions {
    /**
     *  Checks if view has number of progress as expected
     *
     *  @param number progress as expected
     */
    fun hasProgress(number: Int) {
        view.check(ViewAssertions.matches(ProgressMatcher(number)))
    }
}
