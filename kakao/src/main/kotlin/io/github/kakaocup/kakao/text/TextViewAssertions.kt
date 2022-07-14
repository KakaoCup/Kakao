@file:Suppress("unused")

package io.github.kakaocup.kakao.text

import android.graphics.Typeface
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.matchers.AnyTextMatcher
import io.github.kakaocup.kakao.common.matchers.CompoundDrawableMatcher
import io.github.kakaocup.kakao.common.matchers.TextSizeMatcher
import io.github.kakaocup.kakao.common.matchers.TextViewGravityMatcher
import io.github.kakaocup.kakao.common.matchers.TypefaceMatcher
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers

/**
 * Provides text based assertions for views
 */
interface TextViewAssertions : BaseAssertions {
    /**
     * Checks if the view have not any text
     */
    fun hasEmptyText() {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withText("")
            )
        )
    }

    /**
     * Checks if the view has any text
     */
    fun hasAnyText() {
        view.check(
            ViewAssertions.matches(
                AnyTextMatcher()
            )
        )
    }

    /**
     * Checks if the view has given text
     *
     * @param text Text to be matched
     */
    fun hasText(text: String) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withText(text)
            )
        )
    }

    /**
     * Checks if the view has given text
     *
     * @param resId String resource to be matched
     */
    fun hasText(@StringRes resId: Int) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withText(resId)
            )
        )
    }

    /**
     * Checks if the view has text that matches given matcher
     */
    fun hasText(matcher: Matcher<String>) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withText(matcher)
            )
        )
    }

    /**
     * Checks if the view has given text color
     *
     * @param resId Color resource to be matched
     */
    fun hasTextColor(@ColorRes resId: Int) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.hasTextColor(resId)
            )
        )
    }

    /**
     * Checks if the view does not have a given text
     *
     * @param text Text to be matched
     */
    fun hasNoText(text: String) {
        view.check(
            ViewAssertions.matches(
                CoreMatchers.not(
                    ViewMatchers.withText(text)
                )
            )
        )
    }

    /**
     * Checks if the view does not have a given text
     *
     * @param resId String resource to be matched
     */
    fun hasNoText(@StringRes resId: Int) {
        view.check(
            ViewAssertions.matches(
                CoreMatchers.not(
                    ViewMatchers.withText(resId)
                )
            )
        )
    }

    /**
     * Checks if the view has given content description
     *
     * @param text Content description to be matched
     */
    fun hasContentDescription(text: String) {
        view.check(ViewAssertions.matches(ViewMatchers.withContentDescription(text)))
    }

    /**
     * Checks if the view contains given text
     *
     * @param text Text to be searched
     */
    fun containsText(text: String) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withText(Matchers.containsString(text))
            )
        )
    }

    /**
     * Checks if the view text start with given substring
     *
     * @param text Text to be searched
     */
    fun startsWithText(text: String) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withText(Matchers.startsWith(text))
            )
        )
    }

    /**
     * Checks if the view has given hint
     *
     * @param hint Text to be matched
     */
    fun hasHint(hint: String) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withHint(hint)
            )
        )
    }

    /**
     * Checks if the view has given hint
     *
     * @param resId String resource to be matched
     */
    fun hasHint(@StringRes resId: Int) {
        view.check(
            ViewAssertions.matches(
                ViewMatchers.withHint(resId)
            )
        )
    }

    /**
     * Checks if the view have compound drawables
     * @param left left compound drawable resId
     * @param top top compound drawable resId
     * @param right right compound drawable resId
     * @param bottom bottom compound drawable resId      \
     */
    fun hasCompoundDrawable(
        @DrawableRes left: Int? = null,
        @DrawableRes top: Int? = null,
        @DrawableRes right: Int? = null,
        @DrawableRes bottom: Int? = null
    ) {
        view.check(
            ViewAssertions.matches(
                CompoundDrawableMatcher(left, top, right, bottom)
            )
        )
    }

    /**
     * Checks if the view has given gravity
     *
     * @param horizontalGravity relative horizontal gravity values to be matched
     * @param verticalGravity vertical gravity values to be matched
     */
    fun hasGravity(horizontalGravity: Int? = null, verticalGravity: Int? = null) {
        view.check(
            ViewAssertions.matches(
                TextViewGravityMatcher(horizontalGravity, verticalGravity)
            )
        )
    }

    /**
     * Checks if the view has text size in sp
     *
     * @param sp Text size in sp to be matched
     */
    fun hasTextSize(sp: Int) {
        view.check(
            ViewAssertions.matches(
                TextSizeMatcher(sp)
            )
        )
    }

    /**
     * Checks if the view has given typeface
     *
     * @param typeface TextView typeface to be matched
     */
    fun hasTypeface(typeface: Typeface) {
        view.check(
            ViewAssertions.matches(
                TypefaceMatcher(typeface)
            )
        )
    }
}
