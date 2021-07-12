package io.github.kakaocup.kakao.gmaps.view.polyline

import com.google.android.gms.maps.model.Polyline
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps
import org.junit.Assert

/**
 * Provides assertion for Google Map Polyline
 */
interface PolylineAssertions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Polyline

    /**
     * Assert that polyline is fully displayed
     */
    fun isDisplayed() = runOnUiThread {
        delegate.run {
            val latLngBounds = googleMap.map.projection.visibleRegion.latLngBounds
            Assert.assertTrue(
                "Polyline with coordinates $points does not fully displayed, or displayed partially",
                points.all { latLngBounds.contains(it) }
            )
        }
    }

    /**
     * Assert that polyline is not fully displayed
     */
    fun isNotDisplayed() = runOnUiThread {
        delegate.run {
            val latLngBounds = googleMap.map.projection.visibleRegion.latLngBounds
            Assert.assertFalse(
                "Polyline with coordinates $points is fully displayed",
                points.all { latLngBounds.contains(it) }
            )
        }
    }
}
