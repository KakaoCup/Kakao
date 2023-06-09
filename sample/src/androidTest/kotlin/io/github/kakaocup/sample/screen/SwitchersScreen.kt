package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.common.matchers.SwitcherCurrentViewMatcher
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

class SwitchersScreen : Screen<SwitchersScreen>() {
    val textSwitcher: KTextView
        get() {
            return KTextView {
                withParent {
                    withId(R.id.text_switcher)
                }
                withMatcher(SwitcherCurrentViewMatcher())
            }
        }

    val nextButton = KButton {
        withId(R.id.next)
    }
}
