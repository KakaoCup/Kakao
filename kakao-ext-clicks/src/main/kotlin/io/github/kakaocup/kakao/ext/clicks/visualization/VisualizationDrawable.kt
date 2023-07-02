package io.github.kakaocup.kakao.ext.clicks.visualization

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.PixelFormat
import android.graphics.drawable.Drawable
import androidx.annotation.ColorInt

internal class VisualizationDrawable(
    private val originalForeground: Drawable?,
    private val x: Float,
    private val y: Float,
    private val radiusInPixels: Float,
    @ColorInt val color: Int
) : Drawable() {

    private val paint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = this@VisualizationDrawable.color
    }

    override fun draw(canvas: Canvas) {
        originalForeground?.draw(canvas)
        canvas.drawCircle(x, y, radiusInPixels, paint)
    }

    override fun setAlpha(alpha: Int) {
        originalForeground?.alpha = alpha
        paint.alpha = alpha
    }

    @Suppress("OVERRIDE_DEPRECATION")
    override fun getOpacity(): Int = PixelFormat.TRANSLUCENT

    override fun setColorFilter(colorFilter: ColorFilter?) {
        originalForeground?.colorFilter = colorFilter
        paint.colorFilter = colorFilter
    }
}
