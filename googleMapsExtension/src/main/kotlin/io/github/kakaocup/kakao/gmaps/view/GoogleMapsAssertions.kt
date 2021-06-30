package io.github.kakaocup.kakao.gmaps.view

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

    private fun LatLng.normalize(accuracy: Accuracy) = LatLng(
        BigDecimal(latitude).setScale(accuracy.commaDigits, RoundingMode.HALF_EVEN).toDouble(),
        BigDecimal(longitude).setScale(accuracy.commaDigits, RoundingMode.HALF_EVEN).toDouble()
    )

    private companion object {
        const val thresholdLatLng = 6
    }
    
    enum class Accuracy(val commaDigits: Int){
        FINE(6),
        NORMAL(4),
        APPROXIMATE(2)
    }
}
