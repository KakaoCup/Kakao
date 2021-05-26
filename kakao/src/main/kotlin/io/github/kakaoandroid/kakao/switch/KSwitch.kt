package io.github.kakaoandroid.kakao.switch

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.check.CheckableAssertions
import io.github.kakaoandroid.kakao.common.builders.ViewBuilder
import io.github.kakaoandroid.kakao.common.views.KBaseView
import io.github.kakaoandroid.kakao.text.TextViewAssertions
import org.hamcrest.Matcher

/**
 * View with SwitchableActions, CheckableAssertions and TextViewAssertions
 *
 * @see SwitchableActions
 * @see CheckableAssertions
 * @see TextViewAssertions
 */
class KSwitch : KBaseView<KSwitch>, SwitchableActions, TextViewAssertions, CheckableAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
