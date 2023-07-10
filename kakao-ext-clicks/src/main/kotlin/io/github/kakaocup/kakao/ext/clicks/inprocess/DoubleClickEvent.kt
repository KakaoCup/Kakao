package io.github.kakaocup.kakao.ext.clicks.inprocess

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import android.view.View
import android.view.ViewConfiguration
import androidx.annotation.ChecksSdkIntAtLeast
import androidx.test.espresso.UiController
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers
import org.hamcrest.TypeSafeMatcher

class DoubleClickEvent(override val visualClicksConfig: VisualClicksConfig?) : ClickEvent() {

    private val doubleTapMinTime: Int = getDoubleTapMinTime()

    override fun description(): String = "double click"

    override fun constraints(): Matcher<View> = Matchers.allOf(
        MinApiConstraint(),
        DoubleTapAvailabilityConstraint(doubleTapMinTime)
    )

    override fun perform(
        uiController: UiController,
        view: View,
        rootView: View,
        coordinates: FloatArray,
        precision: FloatArray,
    ) {
        performSingleClick(uiController, rootView, coordinates, precision)

        if (doubleTapMinTime > 0) {
            uiController.loopMainThreadForAtLeast(doubleTapMinTime.toLong())
        }

        performSingleClick(uiController, rootView, coordinates, precision)
    }

    private class DoubleTapAvailabilityConstraint(private val doubleTapMinTime: Int) : TypeSafeMatcher<View>() {
        override fun describeTo(description: Description) {
            description.appendText("doubleTapMinTime is unavailable. Double click will not succeed. See log for clues")
        }

        override fun matchesSafely(item: View): Boolean {
            return doubleTapMinTime > 0
        }
    }

    private class MinApiConstraint : TypeSafeMatcher<View>() {
        override fun describeTo(description: Description) {
            description.appendText("getDoubleTapMinTime only available on KITKAT+")
        }

        @ChecksSdkIntAtLeast(api = Build.VERSION_CODES.KITKAT)
        override fun matchesSafely(item: View): Boolean {
            return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
        }
    }

    @SuppressLint("DiscouragedPrivateApi") // that's the only way to get system settings value
    private fun getDoubleTapMinTime(): Int {
        return try {
            val getDoubleTapMinTimeMethod = ViewConfiguration::class.java.getDeclaredMethod("getDoubleTapMinTime")
            getDoubleTapMinTimeMethod.invoke(null) as Int
        } catch (e: NoSuchMethodException) {
            Log.w("Kakao", "Expected to find getDoubleTapMinTime", e)
            0
        }
    }
}
