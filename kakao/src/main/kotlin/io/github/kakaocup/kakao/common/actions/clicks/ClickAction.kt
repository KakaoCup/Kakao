package io.github.kakaocup.kakao.common.actions.clicks

import androidx.test.espresso.ViewAction
import androidx.test.espresso.action.CoordinatesProvider

interface ClickAction {
    fun click(location: CoordinatesProvider): ViewAction
}
