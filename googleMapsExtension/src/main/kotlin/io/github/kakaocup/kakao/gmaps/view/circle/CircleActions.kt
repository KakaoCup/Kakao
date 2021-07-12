package io.github.kakaocup.kakao.gmaps.view.circle

import com.google.android.gms.maps.model.Circle
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps

/**
 * Provides actions for Google Map Circle
 */
interface CircleActions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Circle

    fun moveCameraTo() = runOnUiThread {
        delegate.run {
            googleMap.moveCamera(center, googleMap.map.cameraPosition.zoom)
        }
    }

    fun moveCameraTo(zoom: Float) = runOnUiThread{
        delegate.run {
            googleMap.moveCamera(center, zoom)
        }
    }
}
