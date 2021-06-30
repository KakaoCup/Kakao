package io.github.kakaocup.kakao.gmaps.view.marker

import com.google.android.gms.maps.model.Marker
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps
import org.junit.Assert

/**
 * Provides actions for Google Map Marker
 */
interface MarkerActions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Marker

    fun showInfoWindow() = runOnUiThread {
        delegate.run {
            showInfoWindow()
        }
    }

    fun moveCameraTo(zoom: Float = googleMap.map.cameraPosition.zoom) = runOnUiThread{
        delegate.run {
            googleMap.moveCamera(position, zoom)

        }
    }
}
