package io.github.kakaocup.kakao.ext.clicks.coordinates

import android.view.View
import androidx.test.espresso.action.CoordinatesProvider

internal class RelativeCoordinatesProvider(
    private val coordinatesProvider: CoordinatesProvider
) : CoordinatesProvider {
    override fun calculateCoordinates(view: View): FloatArray {
        val (offsetX, offsetY) = IntArray(2).apply(view.rootView::getLocationOnScreen)
        val (viewX, viewY) = coordinatesProvider.calculateCoordinates(view)
        return floatArrayOf(viewX - offsetX, viewY - offsetY)
    }
}
