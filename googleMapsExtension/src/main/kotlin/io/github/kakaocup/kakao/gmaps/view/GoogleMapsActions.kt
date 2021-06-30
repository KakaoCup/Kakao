@file:Suppress("unused")

package io.github.kakaocup.kakao.gmaps.view

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.LatLng

/**
 * Provides actions for Google Maps
 */
interface GoogleMapsActions : UiThread {
    val map: GoogleMap

    fun moveCamera(latLng: LatLng, zoom: Float? = null) = runOnUiThread {
        zoom?.let {
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
        } ?: kotlin.run {
            map.moveCamera(CameraUpdateFactory.newLatLng(latLng))
        }
    }

    fun animateCamera(latLng: LatLng, zoom: Float? = null) = runOnUiThread {
        zoom?.let {
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
        } ?: kotlin.run {
            map.animateCamera(CameraUpdateFactory.newLatLng(latLng))
        }
    }
}
