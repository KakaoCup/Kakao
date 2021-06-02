package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.googlemaps.KGoogleMaps
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R

open class GoogleMapActivityScreen : Screen<GoogleMapActivityScreen>() {
    val map = KGoogleMaps { withId(R.id.mapFragment) }
}
