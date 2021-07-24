package io.github.kakaocup.kakao.gmaps.view.polyline

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Polyline
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps

/**
 * Provides actions for Google Map Polyline
 */
interface PolylineActions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Polyline

    fun moveCameraTo(padding: Int = 0) = runOnUiThread {
        delegate.run {
            val points = points
            val latLngBounds = LatLngBounds.builder().apply {
                points.forEach { include(it) }
            }.build()
            googleMap.map.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, padding))
        }
    }
}
