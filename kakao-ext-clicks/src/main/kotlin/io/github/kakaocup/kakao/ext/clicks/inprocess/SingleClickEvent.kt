package io.github.kakaocup.kakao.ext.clicks.inprocess

import android.view.View
import androidx.test.espresso.UiController
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig
import org.hamcrest.Matcher
import org.hamcrest.Matchers

class SingleClickEvent(override val visualClicksConfig: VisualClicksConfig?) : ClickEvent() {

    override fun description(): String = "single click"

    override fun constraints(): Matcher<View> = Matchers.allOf()

    override fun perform(
        uiController: UiController,
        view: View,
        rootView: View,
        coordinates: FloatArray,
        precision: FloatArray,
    ) {
        performSingleClick(uiController, rootView, coordinates, precision)
    }
}
