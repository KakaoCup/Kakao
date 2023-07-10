package io.github.kakaocup.kakao.ext.clicks.inprocess

import android.view.View
import android.view.ViewConfiguration
import androidx.test.espresso.UiController
import io.github.kakaocup.kakao.ext.clicks.visualization.ClickVisualization
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig
import org.hamcrest.Matcher

sealed class ClickEvent {

    abstract val visualClicksConfig: VisualClicksConfig?

    abstract fun perform(
        uiController: UiController,
        view: View,
        rootView: View,
        coordinates: FloatArray,
        precision: FloatArray,
    )

    abstract fun constraints(): Matcher<View>

    abstract fun description(): String

    protected fun performSingleClick(
        uiController: UiController,
        rootView: View,
        coordinates: FloatArray,
        precision: FloatArray,
        delayBetweenDownAndUp: Long = ViewConfiguration.getTapTimeout().toLong(),
    ) {
        val clickVisualization = visualClicksConfig?.let {
            ClickVisualization(
                x = coordinates[0],
                y = coordinates[1],
                visualClicksConfig = it,
            )
        }

        val downEvent = MotionEvents.downEvent(
            coordinates = coordinates,
            precision = precision
        )
        clickVisualization?.attachTo(rootView)
        rootView.dispatchTouchEvent(downEvent)

        uiController.loopMainThreadForAtLeast(delayBetweenDownAndUp)

        val upEvent = MotionEvents.upEvent(downEvent)
        rootView.dispatchTouchEvent(upEvent)
        clickVisualization?.detach()

        downEvent.recycle()
        upEvent.recycle()
    }
}
