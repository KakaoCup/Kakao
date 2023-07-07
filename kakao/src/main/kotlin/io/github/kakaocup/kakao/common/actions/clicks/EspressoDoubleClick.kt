package io.github.kakaocup.kakao.common.actions.clicks

import android.view.InputDevice
import android.view.MotionEvent
import androidx.test.espresso.action.CoordinatesProvider
import androidx.test.espresso.action.GeneralClickAction
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Tap

class EspressoDoubleClick : ClickAction {
    override fun click(location: CoordinatesProvider) = GeneralClickAction(
        Tap.DOUBLE, location, Press.FINGER,
        InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY
    )
}
