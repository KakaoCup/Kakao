@file:Suppress("unused")

package io.github.kakaocup.kakao.toolbar

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View for acting and asserting on Toolbar
 *
 * @see ToolbarViewActions
 * @see ToolbarViewAssertions
 */
class KToolbar : KBaseView<KToolbar>,
    ToolbarViewActions, ToolbarViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
