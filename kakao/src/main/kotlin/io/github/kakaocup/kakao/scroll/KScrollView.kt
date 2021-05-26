package io.github.kakaocup.kakao.scroll

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with ScrollViewActions and BaseAssertions
 *
 * @see ScrollViewActions
 * @see BaseAssertions
 */
class KScrollView : KBaseView<KScrollView>, ScrollViewActions, BaseAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
