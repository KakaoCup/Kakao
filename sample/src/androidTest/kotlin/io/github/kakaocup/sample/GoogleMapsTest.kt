package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.google.android.gms.maps.model.LatLng
import io.github.kakaocup.kakao.googlemaps.screen.MapScreen
import io.github.kakaocup.sample.screen.GoogleMapActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class GoogleMapsTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(GoogleMapActivity::class.java)

    @Test
    fun testMove() {
        MapScreen.onScreen<GoogleMapActivityScreen>(rule) {
            map {
                hasTarget(LatLng(0.0, 0.0))
                hasZoom(2.0f)
                hasTilt(0f)
                hasBearing(0f)

                moveCamera(LatLng(-33.914172, 151.265490), 17f)

                hasTarget(LatLng(-33.914172, 151.265490))
                hasZoom(17f)
            }
        }
    }
}
