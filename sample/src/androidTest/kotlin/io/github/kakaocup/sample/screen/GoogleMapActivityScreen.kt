package io.github.kakaocup.sample.screen

import androidx.test.ext.junit.rules.ActivityScenarioRule
import io.github.kakaocup.kakao.googlemaps.view.KGoogleMaps
import io.github.kakaocup.kakao.googlemaps.screen.MapScreen
import io.github.kakaocup.sample.GoogleMapActivity
import io.github.kakaocup.sample.R

class GoogleMapActivityScreen(rule: ActivityScenarioRule<GoogleMapActivity>) : MapScreen<GoogleMapActivityScreen, GoogleMapActivity>(rule) {

    val map = KGoogleMaps(this, R.id.mapFragment)
}
