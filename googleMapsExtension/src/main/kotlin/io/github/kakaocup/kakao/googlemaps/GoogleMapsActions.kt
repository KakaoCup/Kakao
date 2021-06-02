@file:Suppress("unused")

package io.github.kakaocup.kakao.googlemaps

import android.view.View
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.matcher.ViewMatchers
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import io.github.kakaocup.kakao.common.actions.BaseActions

/**
 * Provides actions for Google Maps
 */
interface GoogleMapsActions : BaseActions {
    fun moveCamera(latLng: LatLng, zoom: Float? = null) {
        view.perform(object : ViewAction {
            override fun getDescription() = "Cannot moveCamera on Google Map"

            override fun getConstraints() = ViewMatchers.isAssignableFrom(View::class.java)

            override fun perform(controller: UiController, view: View) {
                //TODO: How to get proper access for map fragment??
                /*
                if (view is SupportMapFragment) {
                    view.getMapAsync { googleMap ->
                        zoom?.let {
                            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, zoom))
                        } ?: kotlin.run {
                            googleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng))
                        }
                    }
                }
                 */
            }
        })
    }
}
