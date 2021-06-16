@file:Suppress("unused")

package io.github.kakaocup.kakao.edit

import androidx.annotation.StringRes
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.matchers.TextInputLayoutCounterEnabledMatcher
import io.github.kakaocup.kakao.common.matchers.TextInputLayoutErrorEnabledMatcher
import io.github.kakaocup.kakao.common.matchers.TextInputLayoutHintEnabledMatcher
import io.github.kakaocup.kakao.common.utilities.getResourceString
import com.google.android.material.textfield.TextInputLayout

/**
 * Provides assertions for TextInputLayout
 */
interface TextInputLayoutAssertions : BaseAssertions {
    /**
     * Checks if this input layout has given hint
     *
     * @param hint - hint text to be checked
     */
    fun hasHint(hint: String) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is TextInputLayout) {
                if (hint != view.hint) {
                    throw AssertionError(
                        "Expected hint is $hint," +
                                " but actual is ${view.hint}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    fun hasHint(@StringRes resId: Int) {
        hasHint(getResourceString(resId))
    }

    fun isHintEnabled() {
        view.check(ViewAssertions.matches(TextInputLayoutHintEnabledMatcher(true)))
    }

    fun isHintDisabled() {
        view.check(ViewAssertions.matches(TextInputLayoutHintEnabledMatcher(false)))
    }

    fun hasError(@StringRes resId: Int) {
        hasError(getResourceString(resId))
    }

    fun hasError(error: String) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is TextInputLayout) {
                if (error != view.error) {
                    throw AssertionError(
                        "Expected error is $error," +
                                " but actual is ${view.error}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    fun hasNoError() {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is TextInputLayout) {
                if (!view.error.isNullOrEmpty()) {
                    throw AssertionError(
                        "Expected no error but actual is ${view.error}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    fun isErrorEnabled() {
        view.check(ViewAssertions.matches(TextInputLayoutErrorEnabledMatcher(true)))
    }

    fun isErrorDisabled() {
        view.check(ViewAssertions.matches(TextInputLayoutErrorEnabledMatcher(false)))
    }

    fun hasCounterMaxLength(length: Int) {
        view.check(ViewAssertion { view, notFoundException ->
            if (view is TextInputLayout) {
                if (length != view.counterMaxLength) {
                    throw AssertionError(
                        "Expected counter max length is $length," +
                                " but actual is ${view.counterMaxLength}"
                    )
                }
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        })
    }

    fun isCounterEnabled() {
        view.check(ViewAssertions.matches(TextInputLayoutCounterEnabledMatcher(true)))
    }

    fun isCounterDisabled() {
        view.check(ViewAssertions.matches(TextInputLayoutCounterEnabledMatcher(false)))
    }
}
