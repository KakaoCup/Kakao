package io.github.kakaocup.kakao.common.actions.clicks

import androidx.test.espresso.action.GeneralLocation
import io.github.kakaocup.kakao.delegate.ViewInteractionDelegate

interface ClickAction {
    fun click(view: ViewInteractionDelegate, location: GeneralLocation)
}