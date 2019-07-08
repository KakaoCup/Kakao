@file:Suppress("unused")

package com.agoda.kakao.list

import androidx.test.espresso.DataInteraction
import androidx.test.espresso.ViewAction
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.RootMatchers
import com.agoda.kakao.common.KakaoDslMarker
import com.agoda.kakao.common.actions.BaseActions
import com.agoda.kakao.common.assertions.BaseAssertions
import com.agoda.kakao.delegate.DataInteractionDelegate
import com.agoda.kakao.intercept.Interceptor
import org.hamcrest.Matchers

/**
 * Base class for KAbsListView adapter items
 *
 * Please extend this class to provide custom recycler view item types
 *
 * @param T type of your item. Used to enable invoke() and perform() on descendants
 * @param interaction Data interaction of item. Can be used as parent for all views inside item.
 *
 * @see KAdapterItemTypeBuilder
 */
@Suppress("UNCHECKED_CAST")
@KakaoDslMarker
open class KAdapterItem<out T>(interaction: DataInteraction) : BaseActions, BaseAssertions {
    override val view = DataInteractionDelegate(interaction).check(ViewAssertions.matches(Matchers.anything()))
    override var root = RootMatchers.DEFAULT

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: T.() -> Unit) {
        function(this as T)
    }

    /**
     * Sets the interceptors for the item.
     * Interceptors will be invoked on the interaction with the item.
     *
     * @param builder Builder of the interceptors
     *
     * @see Interceptor
     */
    fun intercept(builder: Interceptor.Builder<ViewInteraction, ViewAssertion, ViewAction>.() -> Unit) {
        view.interceptor = Interceptor.Builder<ViewInteraction, ViewAssertion, ViewAction>().apply(builder).build()
    }

    /**
     * Removes the interceptors from the item.
     */
    fun reset() {
        view.interceptor = null
    }

    /**
     * Infix function for invoking lambda on your view
     *
     * Sometimes instance of view is a result of a function or constructor.
     * In this specific case you can't call invoke() since it will be considered as
     * tail lambda of your fun/constructor. In such cases please use this function.
     *
     * @param function Tail lambda with receiver which is your view
     * @return This object
     */
    infix fun perform(function: T.() -> Unit): T {
        function(this as T)
        return this
    }
}
