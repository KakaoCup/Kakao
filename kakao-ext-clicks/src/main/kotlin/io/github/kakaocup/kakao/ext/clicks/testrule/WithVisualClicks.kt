package io.github.kakaocup.kakao.ext.clicks.testrule

import androidx.annotation.ColorInt
import io.github.kakaocup.kakao.ext.clicks.visualization.DEFAULT_TOUCH_COLOR
import io.github.kakaocup.kakao.ext.clicks.visualization.DEFAULT_TOUCH_RADIUS_DP

@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION)
annotation class WithVisualClicks(
    val touchRadius: Int = DEFAULT_TOUCH_RADIUS_DP,
    @ColorInt val color: Int = DEFAULT_TOUCH_COLOR
)
