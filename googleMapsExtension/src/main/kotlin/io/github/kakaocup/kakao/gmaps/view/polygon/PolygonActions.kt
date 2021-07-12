package io.github.kakaocup.kakao.gmaps.view.polygon

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.Polygon
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps

/**
 * Provides actions for Google Map Polyline
 */
interface PolygonActions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Polygon

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
