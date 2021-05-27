@file:Suppress("unused")

package io.github.kakaocup.kakao.image

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with BaseActions and ImageViewAssertions
 *
 * @see io.github.kakaocup.kakao.common.actions.BaseActions
 * @see ImageViewAssertions
 */
class KImageView : KBaseView<KImageView>, ImageViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
