package io.github.kakaocup.kakao.ext.clicks

import android.view.InputDevice
import android.view.MotionEvent
import androidx.test.espresso.action.GeneralClickAction
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Tap
import io.github.kakaocup.kakao.common.actions.clicks.ClickAction

class KakaoSingleClick : ClickAction {
    override fun click(location: GeneralLocation) = GeneralClickAction(
        Tap.SINGLE, location, Press.FINGER,
        InputDevice.SOURCE_UNKNOWN, MotionEvent.BUTTON_PRIMARY
    )
}