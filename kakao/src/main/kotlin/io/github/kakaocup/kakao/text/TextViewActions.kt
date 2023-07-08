@file:Suppress("unused")

package io.github.kakaocup.kakao.text

import android.net.Uri
import android.text.Spanned
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.test.espresso.PerformException
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.util.HumanReadables
import io.github.kakaocup.kakao.common.actions.BaseActions
import org.hamcrest.Matcher
import org.hamcrest.Matchers

/**
 * Provides actions for TextViews
 */
interface TextViewActions : BaseActions {
    /**
     * @see ViewActions.openLinkWithText
     */
    fun openLinkWithText(text: String) {
        view.perform(ViewActions.openLinkWithText(text))
    }

    /**
     * @see ViewActions.openLinkWithText
     */
    fun openLinkWithText(text: Matcher<String>) {
        view.perform(ViewActions.openLinkWithText(text))
    }

    /**
     * @see ViewActions.openLinkWithUri
     */
    fun openLinkWithUri(uri: String) {
        view.perform(ViewActions.openLinkWithUri(uri))
    }

    /**
     * @see ViewActions.openLinkWithUri
     */
    fun openLinkWithUri(uri: Matcher<Uri>) {
        view.perform(ViewActions.openLinkWithUri(uri))
    }

    /**
     * @see ViewActions.openLink
     */
    fun openLink(text: Matcher<String>, uri: Matcher<Uri>) {
        view.perform(ViewActions.openLink(text, uri))
    }

    /**
     * Performs a click on the span with specified text.
     * @param text - text of the span
     */
    fun clickSpanWithText(text: String) {
        val textMatcher = Matchers.equalTo(text)

        view.perform(object : ViewAction {
            override fun getConstraints(): Matcher<View> {
                return Matchers.allOf(
                    ViewMatchers.isDisplayed(), ViewMatchers.isAssignableFrom(
                    TextView::class.java
                )
                )
            }

            override fun getDescription(): String {
                return "Click on TextView's span with text $textMatcher"
            }

            override fun perform(uiController: UiController, view: View) {
                val textView = view as TextView
                val spannedText = textView.text as Spanned
                val clickableSpans = spannedText.getSpans(0, textView.text.length, ClickableSpan::class.java)

                for (clickableSpan in clickableSpans) {
                    val spanStart = spannedText.getSpanStart(clickableSpan)
                    val spanEnd = spannedText.getSpanEnd(clickableSpan)
                    if (spanStart == -1 || spanEnd == -1) {
                        error("Unable to find text associated with $clickableSpan")
                    }
                    val spanText = spannedText.substring(spanStart, spanEnd)
                    if (textMatcher.matches(spanText)) {
                        clickableSpan.onClick(textView)
                        return
                    }
                }

                throw PerformException.Builder()
                    .withActionDescription(description)
                    .withViewDescription(HumanReadables.describe(textView))
                    .withCause(
                        RuntimeException("Span with text $textMatcher not found")
                    )
                    .build()
            }
        }
        )
    }
}
