package io.github.kakaocup.kakao.ext.clicks.visualization

import android.content.res.Resources
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.View

internal class ClickVisualization(
    private val x: Float,
    private val y: Float,
    private val visualClicksConfig: VisualClicksConfig,
) {

    private var attachedView: View? = null
    private var originalForeground: Drawable? = null

    fun attachTo(view: View) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            attachedView = view
            originalForeground = view.foreground

            view.foreground = VisualizationDrawable(
                originalForeground = originalForeground,
                x = x,
                y = y,
                radiusInPixels = visualClicksConfig.radiusInDp.toPx(),
                color = visualClicksConfig.color
            )
        }
    }

    fun detach() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            attachedView?.foreground = originalForeground
        }
    }

    private fun Int.toPx(): Float = this * Resources.getSystem().displayMetrics.density
}
