@file:Suppress("unused")

package io.github.kakaocup.kakao.common.views

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.actions.SwipeableActions
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * View with SwipeableActions and BaseAssertions
 *
 * @see SwipeableActions
 * @see BaseAssertions
 */
class KSwipeView : KBaseView<KSwipeView>, SwipeableActions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
