@file:Suppress("unused")

package io.github.kakaocup.kakao.progress

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with ProgressBarActions and ProgressBarAssertions
 *
 * @see ProgressBarActions
 * @see ProgressBarAssertions
 */
class KProgressBar : KBaseView<KProgressBar>, ProgressBarActions, ProgressBarAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
