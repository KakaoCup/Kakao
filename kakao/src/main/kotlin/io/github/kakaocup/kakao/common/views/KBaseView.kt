@file:Suppress("unused")

package io.github.kakaocup.kakao.common.views

import android.view.View
import androidx.test.espresso.DataInteraction
import androidx.test.espresso.Root
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.RootMatchers
import io.github.kakaocup.kakao.common.KakaoDslMarker
import io.github.kakaocup.kakao.common.actions.BaseActions
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.delegate.DataInteractionDelegate
import io.github.kakaocup.kakao.delegate.ViewInteractionDelegate
import io.github.kakaocup.kakao.intercept.Interceptable
import org.hamcrest.Matcher
import org.hamcrest.Matchers

/**
 * Base class for all Kakao views
 *
 * This base class allows to create new custom view with ease. All you
 * have to do is to extend this class, implement all necessarily additional
 * actions/assertions interfaces and override necessary constructors
 *
 * @param T Type of your custom view. Needs to be defined to enable invoke() and perform() for descendants
 */
@KakaoDslMarker
open class KBaseView<T> : KDSLView<T>, BaseActions, BaseAssertions, Interceptable<ViewInteraction, ViewAssertion, ViewAction> {
    final override val view: ViewInteractionDelegate
    override var root: Matcher<Root> = RootMatchers.DEFAULT

    /**
     * Constructs view class with view interaction from given ViewBuilder
     *
     * @param function ViewBuilder which will result in view's interaction
     *
     * @see ViewBuilder
     */
    constructor(function: ViewBuilder.() -> Unit) {
        view = ViewBuilder().apply(function).getViewInteractionDelegate()
    }

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent Matcher that will be used as parent in isDescendantOfA() matcher
     * @param function ViewBuilder which will result in view's interaction
     *
     * @see ViewBuilder
     */
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) :
            this(
                {
                    function(this)
                    isDescendantOfA { withMatcher(parent) }
                })

    /**
     * Constructs view class with parent and view interaction from given ViewBuilder
     *
     * @param parent DataInteraction that will be used as parent to ViewBuilder
     * @param function ViewBuilder which will result in view's interaction
     *
     * @see ViewBuilder
     */
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) {
        view = DataInteractionDelegate(parent)
            .onChildView(ViewBuilder().apply(function).getViewMatcher())
            .check(ViewAssertions.matches(Matchers.anything()))
    }
}
