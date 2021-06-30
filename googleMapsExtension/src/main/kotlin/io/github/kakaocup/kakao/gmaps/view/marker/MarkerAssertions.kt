package io.github.kakaocup.kakao.gmaps.view.marker

import com.google.android.gms.maps.model.Marker
import io.github.kakaocup.kakao.gmaps.view.UiThread
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps
import org.junit.Assert

/**
 * Provides assertion for Google Map Marker
 */
interface MarkerAssertions : UiThread {
    val googleMap: KGoogleMaps
    val delegate: Marker

    fun isDisplayed() = runOnUiThread {
        delegate.run {
            Assert.assertTrue(isVisible && googleMap.map.projection.visibleRegion.latLngBounds.contains(position))
        }
    }

    fun isNotDisplayed() = runOnUiThread {
        delegate.run {
            Assert.assertFalse(isVisible && googleMap.map.projection.visibleRegion.latLngBounds.contains(position))
        }
    }

    fun isInfoWindowShown() = runOnUiThread {
        delegate.run {
            Assert.assertTrue(isInfoWindowShown)
        }
    }

    fun isInfoWindowNotShown() = runOnUiThread {
        delegate.run {
            Assert.assertFalse(isInfoWindowShown)
        }
    }

    fun hasText(text: String) = runOnUiThread {
        delegate.run {
            Assert.assertEquals(title, text)
        }
    }

    fun hasRotation(rotation: Float) = runOnUiThread {
        delegate.run {
            Assert.assertEquals(rotation, getRotation())
        }
    }
}
