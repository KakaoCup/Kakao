@file:Suppress("unused")

package io.github.kakaocup.kakao.gmaps.view.gmap

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.idling.CountingIdlingResource
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import io.github.kakaocup.kakao.common.views.KDSLView
import io.github.kakaocup.kakao.gmaps.screen.MapScreen

/**
 * View for acting and asserting on Google Maps
 *
 * @see GoogleMapsActions
 * @see GoogleMapsAssertions
 */
class KGoogleMaps(mapScreen: MapScreen<*, *>, fragmentId: Int) : KDSLView<KGoogleMaps>(), GoogleMapsActions, GoogleMapsAssertions {

    override lateinit var map: GoogleMap
    override val scenario: ActivityScenario<*> = mapScreen.activityRule.scenario

    private val countingIdlingResource = CountingIdlingResource("MapReady: $fragmentId")

    init {
        IdlingRegistry.getInstance().register(countingIdlingResource)
        countingIdlingResource.increment()
        mapScreen.activityRule.scenario.onActivity { fragmentActivity ->
            (fragmentActivity.supportFragmentManager.findFragmentById(fragmentId) as SupportMapFragment).getMapAsync {
                map = it

                countingIdlingResource.decrement()
                IdlingRegistry.getInstance().unregister(countingIdlingResource)
            }
        }
    }
}
