package io.github.kakaocup.kakao.delegate

import androidx.test.espresso.FailureHandler
import androidx.test.espresso.Root
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import io.github.kakaocup.kakao.Kakao
import io.github.kakaocup.kakao.intercept.Interceptor
import io.github.kakaocup.kakao.screen.Screen
import org.hamcrest.Matcher
import org.jetbrains.annotations.Contract

/**
 * Delegation class for [ViewInteraction].
 * Wraps all available public calls and intercepts [check] and [perform].
 *
 * @see Delegate
 * @see Interceptor
 */
class ViewInteractionDelegate(override var interaction: ViewInteraction) : Delegate<ViewInteraction, ViewAssertion, ViewAction> {
    override var interceptor: Interceptor<ViewInteraction, ViewAssertion, ViewAction>? = null

    @Contract("_->this")
    fun check(viewAssert: ViewAssertion) = this.also {
        if (!interceptCheck(viewAssert)) interaction.check(viewAssert)
    }

    @Contract("_->this")
    fun inRoot(rootMatcher: Matcher<Root>) = this.also {
        interaction.inRoot(rootMatcher)
    }

    @Contract("_->this")
    fun noActivity() = this.also {
        interaction.noActivity()
    }

    @Contract("_->this")
    fun perform(vararg viewActions: ViewAction) = this.also {
        if (viewActions.none { interceptPerform(it) }) interaction.perform(*viewActions)
    }

    @Contract("_->this")
    fun withFailureHandler(failureHandler: FailureHandler) = this.also {
        interaction.withFailureHandler(failureHandler)
    }

    override fun screenInterceptors() = Screen.viewInterceptors
    override fun kakaoInterceptor() = Kakao.viewInterceptor
}
