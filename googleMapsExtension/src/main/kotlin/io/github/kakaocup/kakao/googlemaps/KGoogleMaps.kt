@file:Suppress("unused")

package io.github.kakaocup.kakao.googlemaps

import android.view.View
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View for acting and asserting on Google Maps
 *
 * @see GoogleMapsActions
 * @see GoogleMapsAssertions
 */
class KGoogleMaps : KBaseView<KGoogleMaps>,
    GoogleMapsActions, GoogleMapsAssertions {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
