package io.github.kakaocup.kakao.ext.clicks.inprocess

import android.view.View
import android.view.ViewConfiguration
import androidx.test.espresso.UiController
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig
import org.hamcrest.Matcher
import org.hamcrest.Matchers

class LongClickEvent(override val visualClicksConfig: VisualClicksConfig?) : ClickEvent() {

    override fun description(): String = "long click"

    override fun constraints(): Matcher<View> = Matchers.allOf()

    override fun perform(
        uiController: UiController,
        view: View,
        rootView: View,
        coordinates: FloatArray,
        precision: FloatArray,
    ) {

        performSingleClick(
            uiController,
            rootView,
            coordinates,
            precision,
            delayBetweenDownAndUp = (LONG_PRESS_FACTOR * ViewConfiguration.getLongPressTimeout()).toLong()
        )
    }

    private companion object {

        /**
         * Factor is needed, otherwise a long press is not safely detected.
         * According to [androidx.test.espresso.action.Tap.LONG]
         */
        const val LONG_PRESS_FACTOR = 1.5f
    }
}
