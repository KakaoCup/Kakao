@file:Suppress("unused")

package io.github.kakaocup.kakao.gmaps.view

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.idling.CountingIdlingResource
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import io.github.kakaocup.kakao.gmaps.screen.MapScreen

/**
 * View for acting and asserting on Google Maps
 *
 * @see GoogleMapsActions
 * @see GoogleMapsAssertions
 */
class KGoogleMaps(mapScreen: MapScreen<*, *>, fragmentId: Int) : GoogleMapsActions, GoogleMapsAssertions {

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

    /**
     * Operator that allows usage of DSL style
     *
     * @param function Tail lambda with receiver which is your view
     */
    operator fun invoke(function: KGoogleMaps.() -> Unit) {
        function(this)
    }

    /**
     * Infix function for invoking lambda on your view
     *
     * Sometimes instance of view is a result of a function or constructor.
     * In this specific case you can't call invoke() since it will be considered as
     * tail lambda of your fun/constructor. In such cases please use this function.
     *
     * @param function Tail lambda with receiver which is your view
     * @return This object
     */
    infix fun perform(function: KGoogleMaps.() -> Unit): KGoogleMaps {
        function(this)
        return this
    }
}
