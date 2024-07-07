package io.github.kakaocup.kakao.chip

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.check.CheckableActions
import io.github.kakaocup.kakao.check.CheckableAssertions
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import io.github.kakaocup.kakao.text.TextViewAssertions
import org.hamcrest.Matcher

class KChip : KBaseView<KChip>, CheckableActions, CheckableAssertions, TextViewAssertions, ChipAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
