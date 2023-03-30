@file:Suppress("unused")

package io.github.kakaocup.kakao.viewswitcher

import android.graphics.Bitmap
import android.graphics.Typeface
import android.graphics.drawable.Drawable
import android.widget.TextView
import android.widget.ViewSwitcher
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.matchers.AnyTextMatcher
import io.github.kakaocup.kakao.common.matchers.BoldStyleMatcher
import io.github.kakaocup.kakao.common.matchers.CompoundDrawableMatcher
import io.github.kakaocup.kakao.common.matchers.ItalicStyleMatcher
import io.github.kakaocup.kakao.common.matchers.SpanDrawableMatcher
import io.github.kakaocup.kakao.common.matchers.TextSizeMatcher
import io.github.kakaocup.kakao.common.matchers.TextViewGravityMatcher
import io.github.kakaocup.kakao.common.matchers.TypefaceMatcher
import io.github.kakaocup.kakao.delegate.ViewInteractionDelegate
import org.hamcrest.CoreMatchers
import org.hamcrest.Matcher
import org.hamcrest.Matchers

/**
 * Provides text based assertions for TextViewSwitcher
 */
interface TextSwitcherAssertions : BaseAssertions {

    private fun ViewInteractionDelegate.currentViewCheck(assertion: ViewAssertion): ViewInteractionDelegate {
        return check { view, notFoundException ->
            if (view is ViewSwitcher && view.currentView is TextView) {
                assertion.check(view.currentView, notFoundException)
            } else {
                notFoundException?.let { throw AssertionError(it) }
            }
        }
    }

    /**
     * Checks if the view have not any text
     */
    fun hasEmptyText() {
        view.currentViewCheck(
            ViewAssertions.matches(
                ViewMatchers.withText("")
            )
        )
    }

    /**
     * Checks if the view has any text
     */
    fun hasAnyText() {
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
            ViewAssertions.matches(
                ViewMatchers.withText(resId)
            )
        )
    }

    /**
     * Checks if the view has text that matches given matcher
     */
    fun hasText(matcher: Matcher<String>) {
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(ViewAssertions.matches(ViewMatchers.withContentDescription(text)))
    }

    /**
     * Checks if the view contains given text
     *
     * @param text Text to be searched
     */
    fun containsText(text: String) {
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
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
        view.currentViewCheck(
            ViewAssertions.matches(
                TypefaceMatcher(typeface)
            )
        )
    }

    /**
     * Checks if the text view is bold
     */
    fun isBold() {
        view.currentViewCheck(
            ViewAssertions.matches(
                BoldStyleMatcher()
            )
        )
    }

    /**
     * Checks if the text view is not bold
     */
    fun isNotBold() {
        view.currentViewCheck(
            ViewAssertions.matches(
                Matchers.not(BoldStyleMatcher())
            )
        )
    }

    /**
     * Checks if the text view is italic
     */
    fun isItalic() {
        view.currentViewCheck(
            ViewAssertions.matches(
                ItalicStyleMatcher()
            )
        )
    }

    /**
     * Checks if the text view is not italic
     */
    fun isNotItalic() {
        view.currentViewCheck(
            ViewAssertions.matches(
                Matchers.not(ItalicStyleMatcher())
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param queryStart Index of the character that is the beginning of the range of text to which span is attached
     * @param queryEnd Index of the character that is the end of the range of text to which span is attached
     * @param resId Drawable resource to be matched
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpan(
        queryStart: Int,
        queryEnd: Int,
        @DrawableRes resId: Int,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null
    ) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(queryStart = queryStart, queryEnd = queryEnd, resId = resId, toBitmap = toBitmap)
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param queryStart Index of the character that is the beginning of the range of text to which span is attached
     * @param queryEnd Index of the character that is the end of the range of text to which span is attached
     * @param resId Drawable resource to be matched
     * @param tintColorId Tint color resource id
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpanWithTint(
        queryStart: Int,
        queryEnd: Int,
        @DrawableRes resId: Int,
        @ColorRes tintColorId: Int,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null
    ) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(
                    queryStart = queryStart,
                    queryEnd = queryEnd,
                    resId = resId,
                    tintColorId = tintColorId,
                    toBitmap = toBitmap
                )
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param queryStart Index of the character that is the beginning of the range of text to which span is attached
     * @param queryEnd Index of the character that is the end of the range of text to which span is attached
     * @param drawable Drawable to be matched
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpan(
        queryStart: Int,
        queryEnd: Int,
        drawable: Drawable,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(queryStart = queryStart, queryEnd = queryEnd, drawable = drawable, toBitmap = toBitmap)
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param queryStart Index of the character that is the beginning of the range of text to which span is attached
     * @param queryEnd Index of the character that is the end of the range of text to which span is attached
     * @param drawable Drawable to be matched
     * @param tintColorId Tint color resource id
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpanWithTint(
        queryStart: Int,
        queryEnd: Int,
        drawable: Drawable,
        @ColorRes tintColorId: Int,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null
    ) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(
                    queryStart = queryStart,
                    queryEnd = queryEnd,
                    tintColorId = tintColorId,
                    drawable = drawable,
                    toBitmap = toBitmap
                )
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param spanIndex Index of span in string's spans array
     * @param resId Drawable resource to be matched
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpan(
        spanIndex: Int,
        @DrawableRes resId: Int,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(spanIndex = spanIndex, resId = resId, toBitmap = toBitmap)
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param spanIndex Index of span in string's spans array
     * @param resId Drawable resource to be matched
     * @param tintColorId Tint color resource id
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpanWithTint(
        spanIndex: Int,
        @DrawableRes resId: Int,
        @ColorRes tintColorId: Int,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null
    ) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(spanIndex = spanIndex, resId = resId, tintColorId = tintColorId, toBitmap = toBitmap)
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param spanIndex Index of span in string's spans array
     * @param drawable Drawable to be matched
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpan(
        spanIndex: Int,
        drawable: Drawable,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(spanIndex = spanIndex, drawable = drawable, toBitmap = toBitmap)
            )
        )
    }

    /**
     * Checks if the drawable span displayed in the view
     *
     * @param spanIndex Index of span in string's spans array
     * @param drawable Drawable to be matched
     * @param tintColorId Tint color resource id
     * @param toBitmap Lambda with custom Drawable -> Bitmap converter (default is null)
     */
    fun hasDrawableSpanWithTint(
        spanIndex: Int,
        drawable: Drawable,
        @ColorRes tintColorId: Int,
        toBitmap: ((drawable: Drawable) -> Bitmap)? = null
    ) {
        view.currentViewCheck(
            ViewAssertions.matches(
                SpanDrawableMatcher(spanIndex = spanIndex, drawable = drawable, tintColorId = tintColorId, toBitmap = toBitmap)
            )
        )
    }
}
