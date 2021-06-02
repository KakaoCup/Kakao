@file:Suppress("unused")

package io.github.kakaocup.kakao.googlemaps

import android.R
import android.view.View
import android.widget.ImageView
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import io.github.kakaocup.kakao.image.KImageView
import org.hamcrest.Matcher

/**
 * View for acting and asserting on Google Maps
 *
 * @see GoogleMapsActions
 * @see GoogleMapsAssertions
 */
class KGoogleMaps : KBaseView<KGoogleMaps>,
    GoogleMapsActions, GoogleMapsAssertions {

    val zoomInButton: KImageView
    val zoomOutButton: KImageView

    constructor(function: ViewBuilder.() -> Unit) : super(function) {
        zoomInButton = KImageView {
            isDescendantOfA(function)
            isAssignableFrom(ImageView::class.java)
            withTag("GoogleMapZoomInButton")
        }

        zoomOutButton = KImageView {
            isDescendantOfA(function)
            isAssignableFrom(ImageView::class.java)
            withTag("GoogleMapZoomOutButton")
        }
    }

    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function) {
        zoomInButton = KImageView {
            isDescendantOfA(function)
            isAssignableFrom(ImageView::class.java)
            withTag("GoogleMapZoomInButton")
        }

        zoomOutButton = KImageView {
            isDescendantOfA(function)
            isAssignableFrom(ImageView::class.java)
            withTag("GoogleMapZoomOutButton")
        }
    }

    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function) {
        zoomInButton = KImageView {
            isDescendantOfA(function)
            isAssignableFrom(ImageView::class.java)
            withTag("GoogleMapZoomInButton")
        }

        zoomOutButton = KImageView {
            isDescendantOfA(function)
            isAssignableFrom(ImageView::class.java)
            withTag("GoogleMapZoomOutButton")
        }
    }
}
