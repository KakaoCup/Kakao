package io.github.kakaocup.kakao.ext.clicks.inprocess

import android.os.Build
import android.view.View
import android.view.ViewConfiguration
import android.webkit.WebView
import androidx.test.espresso.UiController
import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.CoordinatesProvider
import androidx.test.espresso.action.PrecisionDescriber
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

class InProcessClickAction(
    private val clickEvent: ClickEvent,
    private val coordinatesProvider: CoordinatesProvider,
    private val precisionDescriber: PrecisionDescriber,
    private val visualClicksConfig: VisualClicksConfig?,
) : ViewAction {

    override fun getDescription(): String = clickEvent.description()

    override fun getConstraints(): Matcher<View> = Matchers.allOf(
        VisualClicksAPIConstraint(visualClicksConfig),
        clickEvent.constraints()
    )

    override fun perform(uiController: UiController, view: View) {
        val rootView = view.rootView
        val precision = precisionDescriber.describePrecision()

        val (offsetX, offsetY) = IntArray(2).apply(rootView::getLocationOnScreen)
        val (viewX, viewY) = coordinatesProvider.calculateCoordinates(view)
        val coordinates = floatArrayOf(viewX - offsetX, viewY - offsetY)

        clickEvent.perform(
            uiController = uiController,
            view = view,
            rootView = rootView,
            coordinates = coordinates,
            precision = precision,
        )

        /**
         * According to [androidx.test.espresso.action.GeneralClickAction.perform]
         * Probably valid for any click types
         */
        if (view is WebView) {
            uiController.loopMainThreadForAtLeast(ViewConfiguration.getDoubleTapTimeout().toLong())
        } else {
            uiController.loopMainThreadForAtLeast(ViewConfiguration.getPressedStateDuration().toLong())
        }
    }

    private class VisualClicksAPIConstraint(private val visualClicksConfig: VisualClicksConfig?) : TypeSafeMatcher<View>() {

        override fun describeTo(description: Description) {
            description.appendText("Click visualization supported only on Android M+ (23+ API)")
        }

        override fun matchesSafely(item: View): Boolean = visualClicksConfig == null || Build.VERSION.SDK_INT >= Build.VERSION_CODES.M
    }
}