package io.github.kakaocup.kakao.gmaps.view.circle

import com.google.android.gms.maps.model.Circle
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps
import org.junit.Assert

/**
 * Provides assertion for Google Map Circle
 */
interface CircleAssertions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Circle

    fun isDisplayed() = runOnUiThread {
        delegate.run {
            Assert.assertTrue(isVisible && googleMap.map.projection.visibleRegion.latLngBounds.contains(center))
        }
    }

    fun isNotDisplayed() = runOnUiThread {
        delegate.run {
            Assert.assertFalse(isVisible && googleMap.map.projection.visibleRegion.latLngBounds.contains(center))
        }
    }
}
