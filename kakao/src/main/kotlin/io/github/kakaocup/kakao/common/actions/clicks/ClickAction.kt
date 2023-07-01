package io.github.kakaocup.kakao.common.actions.clicks

import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.GeneralLocation

interface ClickAction {
    fun click(location: GeneralLocation): ViewAction
}
