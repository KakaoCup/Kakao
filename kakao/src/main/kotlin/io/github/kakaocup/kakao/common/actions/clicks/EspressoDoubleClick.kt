package io.github.kakaocup.kakao.common.actions.clicks

import android.view.InputDevice
import android.view.MotionEvent
import androidx.test.espresso.action.GeneralClickAction
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Tap
import io.github.kakaocup.kakao.delegate.ViewInteractionDelegate

class EspressoDoubleClick : ClickAction {
    override fun click(view: ViewInteractionDelegate, location: GeneralLocation) {
        view.perform(
            GeneralClickAction(
                Tap.DOUBLE, location, Press.FINGER,
                InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY
            )
        )
    }
}