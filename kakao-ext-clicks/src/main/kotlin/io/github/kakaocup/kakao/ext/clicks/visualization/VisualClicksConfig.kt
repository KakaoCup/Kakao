package io.github.kakaocup.kakao.ext.clicks.visualization

import androidx.annotation.ColorInt

data class VisualClicksConfig(
    @ColorInt val color: Int = DEFAULT_TOUCH_COLOR,
    val radiusInDp: Int = DEFAULT_TOUCH_RADIUS_DP
)

private const val DEFAULT_TOUCH_RADIUS_DP = 16
private const val DEFAULT_TOUCH_COLOR = -1610612481 // Color.argb(0xA0, 0x00, 0x00, 0xFF)
