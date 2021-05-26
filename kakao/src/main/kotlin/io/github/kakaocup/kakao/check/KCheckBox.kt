@file:Suppress("unused")

package io.github.kakaocup.kakao.check

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import io.github.kakaocup.kakao.text.TextViewAssertions
import org.hamcrest.Matcher

/**
 * View with CheckableActions, CheckableAssertions and TextViewAssertions
 *
 * @see CheckableActions
 * @see CheckableAssertions
 * @see TextViewAssertions
 */
class KCheckBox : KBaseView<KCheckBox>, CheckableActions, TextViewAssertions, CheckableAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
