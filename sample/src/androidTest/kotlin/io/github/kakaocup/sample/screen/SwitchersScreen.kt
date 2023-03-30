package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.viewswitcher.KTextSwitcher
import io.github.kakaocup.sample.R

class SwitchersScreen : Screen<SwitchersScreen>() {
    val textSwitcher = KTextSwitcher { withId(R.id.text_switcher) }
}
