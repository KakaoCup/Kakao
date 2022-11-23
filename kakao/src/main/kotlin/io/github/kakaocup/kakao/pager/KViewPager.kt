@file:Suppress("unused")

package io.github.kakaocup.kakao.pager

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.actions.SwipeableActions
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with SwipeableActions and ViewPagerAssertions
 *
 * @see SwipeableActions
 * @see ViewPagerAssertions
 */
class KViewPager : KBaseView<KViewPager>, ViewPagerActions, ViewPagerAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
