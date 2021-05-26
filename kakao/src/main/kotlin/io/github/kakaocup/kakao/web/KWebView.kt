@file:Suppress("unused")

package io.github.kakaocup.kakao.web

import androidx.test.espresso.web.sugar.Web
import io.github.kakaocup.kakao.common.KakaoDslMarker
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.delegate.WebInteractionDelegate

/**
 * Class for interacting with WebViews
 *
 * @param matcher ViewBuilder which will result in matcher of web view
 */
@KakaoDslMarker
open class KWebView(matcher: (ViewBuilder.() -> Unit)? = null) {
    private val web = WebInteractionDelegate(
        if (matcher != null) {
            Web.onWebView(ViewBuilder().apply(matcher).getViewMatcher())
        } else {
            Web.onWebView()
        }
    )

    /**
     * Operator that allows usage of DSL style
     *
     * @param function WebElementBuilder which will give you access to match elements
     * and perform actions/assertions on it.
     */
    operator fun invoke(function: WebElementBuilder.() -> Unit) {
        WebElementBuilder(web).apply(function)
    }
}
