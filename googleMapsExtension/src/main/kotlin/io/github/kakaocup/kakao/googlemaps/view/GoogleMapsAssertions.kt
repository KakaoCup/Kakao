package io.github.kakaocup.kakao.googlemaps.view

import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng
import junit.framework.Assert.assertEquals
import java.math.BigDecimal
import java.math.RoundingMode

/**
 * Provides assertion for Google Maps
 */
interface GoogleMapsAssertions : UiThread {
    val map: GoogleMap

    fun hasTarget(target: LatLng) = runOnUiThread {
        assertEquals(target.normalize(), map.cameraPosition.target.normalize())
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

    private fun LatLng.normalize() = LatLng(
        BigDecimal(latitude).setScale(thresholdLatLng, RoundingMode.HALF_EVEN).toDouble(),
        BigDecimal(longitude).setScale(thresholdLatLng, RoundingMode.HALF_EVEN).toDouble()
    )

    private companion object {
        const val thresholdLatLng = 6
    }
}
