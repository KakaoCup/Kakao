package io.github.kakaocup.kakao.gmaps.view.polygon

import com.google.android.gms.maps.model.Polygon
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps
import org.junit.Assert

/**
 * Provides assertion for Google Map Polygon
 */
interface PolygonAssertions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Polygon

    /**
     * Assert that polygon is fully displayed
     */
    fun isDisplayed() = runOnUiThread {
        delegate.run {
            val latLngBounds = googleMap.map.projection.visibleRegion.latLngBounds
            Assert.assertTrue(
                "Polygon with coordinates $points does not fully displayed, or displayed partially",
                points.all { latLngBounds.contains(it) }
            )
        }
    }

    /**
     * Assert that polygon is not fully displayed
     */
    fun isNotDisplayed() = runOnUiThread {
        delegate.run {
            val latLngBounds = googleMap.map.projection.visibleRegion.latLngBounds
            Assert.assertFalse(
                "Polygon with coordinates $points is fully displayed",
                points.all { latLngBounds.contains(it) }
            )
        }
    }
}
