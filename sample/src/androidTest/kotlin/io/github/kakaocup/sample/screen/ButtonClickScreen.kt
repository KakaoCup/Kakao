package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.sample.R

class ButtonClickScreen : Screen<ButtonClickScreen>() {
    val button = KButton { withId(R.id.button) }
}
