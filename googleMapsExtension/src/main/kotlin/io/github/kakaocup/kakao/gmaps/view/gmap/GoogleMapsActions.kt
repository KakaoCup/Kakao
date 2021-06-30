@file:Suppress("unused")

package io.github.kakaocup.kakao.gmaps.view.gmap

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import io.github.kakaocup.kakao.gmaps.view.UiThread

/**
 * Provides actions for Google Maps
 */
interface GoogleMapsActions : UiThread {
    val map: GoogleMap

    fun moveCamera(latLng: LatLng) = runOnUiThread {
        map.moveCamera(CameraUpdateFactory.newLatLng(latLng))
    }

    fun moveCamera(latLng: LatLng, zoom: Float) = runOnUiThread {
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
    }

    fun animateCamera(latLng: LatLng) = runOnUiThread {
        map.animateCamera(CameraUpdateFactory.newLatLng(latLng))
    }

    fun animateCamera(latLng: LatLng, zoom: Float) = runOnUiThread {
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
    }

    fun newCameraPosition(cameraPosition: CameraPosition) = runOnUiThread {
        map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition))
    }

    fun newCameraPosition(latLngBounds: LatLngBounds, padding: Int) = runOnUiThread {
        map.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, padding))
    }

    fun newCameraPosition(latLngBounds: LatLngBounds, width: Int, height: Int, padding: Int) = runOnUiThread {
        map.animateCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, width, height, padding))
    }
}
