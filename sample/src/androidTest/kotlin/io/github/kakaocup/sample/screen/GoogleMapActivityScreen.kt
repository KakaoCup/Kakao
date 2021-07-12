package io.github.kakaocup.sample.screen

import androidx.test.ext.junit.rules.ActivityScenarioRule
import io.github.kakaocup.kakao.gmaps.screen.MapScreen
import io.github.kakaocup.kakao.gmaps.view.circle.KCircle
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps
import io.github.kakaocup.kakao.gmaps.view.marker.KMarker
import io.github.kakaocup.kakao.gmaps.view.polygon.KPolygon
import io.github.kakaocup.kakao.gmaps.view.polyline.KPolyline
import io.github.kakaocup.sample.GoogleMapActivity
import io.github.kakaocup.sample.R

class GoogleMapActivityScreen(rule: ActivityScenarioRule<GoogleMapActivity>) : MapScreen<GoogleMapActivityScreen, GoogleMapActivity>(rule) {

    val map = KGoogleMaps(this, R.id.mapFragment)

    val cozyPlaceMarker = KMarker(this, map) {
        markerArray.find { it.tag == "MyMarker" }
    }
    val crossTuggerah = KPolyline(this, map) { polyline }
    val tuggerahBounds = KPolygon(this, map) { polygon }
    val circle = KCircle(this, map) { circle }
}
