package io.github.kakaocup.kakao.ext.clicks.coordinates

import android.graphics.Rect
import android.view.View
import androidx.test.espresso.action.CoordinatesProvider

/**
 * Returns center of a visible part
 *
 * It's a replacement of androidx.test.espresso.action.GeneralLocation.VISIBLE_CENTER.
 * Espresso implementation can miss on property animated views (e.g. rotated and scaled)
 *
 * Known issues:
 * - It can miss in case of clipping when a view is rotated.
 */
class VisibleCenterGlobalCoordinatesProvider : CoordinatesProvider {
    override fun calculateCoordinates(view: View): FloatArray {
        val rect = Rect().apply(view::getGlobalVisibleRect)
        return floatArrayOf(rect.centerX().toFloat(), rect.centerY().toFloat())
    }
}
