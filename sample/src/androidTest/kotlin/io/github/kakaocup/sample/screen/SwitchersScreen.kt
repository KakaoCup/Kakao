package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.viewswitcher.ViewSwitcher
import io.github.kakaocup.sample.R

class SwitchersScreen : Screen<SwitchersScreen>() {
    val textSwitcher = ViewSwitcher { withId(R.id.text_switcher) }
}
