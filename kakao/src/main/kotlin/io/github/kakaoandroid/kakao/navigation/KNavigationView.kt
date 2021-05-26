@file:Suppress("unused")

package io.github.kakaoandroid.kakao.navigation

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.common.builders.ViewBuilder
import io.github.kakaoandroid.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with NavigationViewActions and NavigationViewAssertions
 *
 * @see NavigationViewActions
 * @see NavigationViewAssertions
 */
class KNavigationView : KBaseView<KNavigationView>, NavigationViewActions, NavigationViewAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
