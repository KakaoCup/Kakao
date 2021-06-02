package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.google.android.gms.maps.model.LatLng
import io.github.kakaocup.kakao.screen.Screen
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
        Screen.onScreen<GoogleMapActivityScreen> {
            map {
                moveCamera(LatLng(-33.914172, 151.265490), 17f)
            }
        }
    }
}
