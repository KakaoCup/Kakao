package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.googlemaps.KGoogleMaps
import io.github.kakaocup.kakao.googlemaps.MapScreen
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.GoogleMapActivity
import io.github.kakaocup.sample.R

class GoogleMapActivityScreen : MapScreen<GoogleMapActivityScreen, GoogleMapActivity>() {
    override val activity: Class<GoogleMapActivity> = GoogleMapActivity::class.java

    val map = KGoogleMaps(this, R.id.mapFragment)
}
