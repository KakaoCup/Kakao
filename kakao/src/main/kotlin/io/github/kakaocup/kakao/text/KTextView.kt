@file:Suppress("unused")

package io.github.kakaocup.kakao.text

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with BaseActions and TextViewAssertions
 *
 * @see io.github.kakaocup.kakao.common.actions.BaseActions
 * @see TextViewActions
 * @see TextViewAssertions
 */
class KTextView : KBaseView<KTextView>, TextViewActions, TextViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
