@file:Suppress("unused")

package io.github.kakaoandroid.kakao.common.views

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.common.builders.ViewBuilder
import org.hamcrest.Matcher

/**
 * Simple view with BaseActions and BaseAssertions
 *
 * @see BaseActions
 * @see BaseAssertions
 */
class KView : KBaseView<KView> {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
