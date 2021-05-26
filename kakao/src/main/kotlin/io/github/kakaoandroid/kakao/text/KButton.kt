@file:Suppress("unused")

package io.github.kakaoandroid.kakao.text

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.common.builders.ViewBuilder
import io.github.kakaoandroid.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with BaseActions and TextViewAssertions
 *
 * @see com.agoda.kakao.common.actions.BaseActions
 * @see TextViewAssertions
 */
class KButton : KBaseView<KButton>, TextViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
