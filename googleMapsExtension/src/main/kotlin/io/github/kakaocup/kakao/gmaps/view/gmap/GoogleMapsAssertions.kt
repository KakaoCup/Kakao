package io.github.kakaocup.kakao.gmaps.view.gmap

import android.graphics.Bitmap
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import io.github.kakaocup.kakao.gmaps.utils.IdleResource
import io.github.kakaocup.kakao.gmaps.view.UiThread
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.assertEquals

import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Provides assertion for Google Maps
 */
@SuppressWarnings("TooManyFunctions")
interface GoogleMapsAssertions : UiThread {
    val map: GoogleMap
    fun hasTarget(target: LatLng, accuracy: Accuracy = Accuracy.NORMAL) = runOnUiThread {
        assertEquals(target.normalize(accuracy), map.cameraPosition.target.normalize(accuracy))
    }

    fun hasZoom(zoom: Float) = runOnUiThread {
        assertEquals(zoom, map.cameraPosition.zoom)
    }

    fun hasTilt(tilt: Float) = runOnUiThread {
        assertEquals(tilt, map.cameraPosition.tilt)
    }

    fun hasBearing(bearing: Float) = runOnUiThread {
        assertEquals(bearing, map.cameraPosition.bearing)
    }

    fun hasLatLngBounds(latLngBounds: LatLngBounds) = runOnUiThread {
        assertEquals(latLngBounds, map.projection.visibleRegion.latLngBounds)
    }

    fun hasMapType(mapType: Int) = runOnUiThread {
        assertEquals(mapType, map.mapType)
    }

    fun isBuildingsEnabled() = runOnUiThread {
        assertTrue(map.isBuildingsEnabled)
    }

    fun isBuildingsDisabled() = runOnUiThread {
        assertFalse(map.isBuildingsEnabled)
    }

    fun isIndoorEnabled() = runOnUiThread {
        assertTrue(map.isIndoorEnabled)
    }

    fun isIndoorDisabled() = runOnUiThread {
        assertFalse(map.isIndoorEnabled)
    }

    fun isMyLocationEnabled() = runOnUiThread {
        assertTrue(map.isMyLocationEnabled)
    }

    fun isMyLocationDisabled() = runOnUiThread {
        assertFalse(map.isMyLocationEnabled)
    }

    fun isTrafficEnabled() = runOnUiThread {
        assertTrue(map.isTrafficEnabled)
    }

    fun isTrafficDisabled() = runOnUiThread {
        assertFalse(map.isTrafficEnabled)
    }

    fun isLatLngVisible(vararg latLng: LatLng) {
        latLng.iterator().forEach {
            assert(map.projection.visibleRegion.latLngBounds.contains(it))
        }
    }

    fun verifySnapshot(snapshot: Bitmap) {
        IdleResource.idle {
            map.snapshot {
                assertTrue(it?.sameAs(snapshot) == true)
                release()
            }
        }
    }

    private fun LatLng.normalize(accuracy: Accuracy) = LatLng(
        BigDecimal(latitude).setScale(accuracy.commaDigits, RoundingMode.HALF_EVEN).toDouble(),
        BigDecimal(longitude).setScale(accuracy.commaDigits, RoundingMode.HALF_EVEN).toDouble()
    )
    
    enum class Accuracy(val commaDigits: Int){
        FINE(6),
        NORMAL(4),
        APPROXIMATE(2)
    }
}
