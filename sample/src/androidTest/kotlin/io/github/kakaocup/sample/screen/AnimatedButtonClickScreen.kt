package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

class AnimatedButtonClickScreen : Screen<AnimatedButtonClickScreen>() {
    val animatedView = KView { withId(R.id.animated_view) }
    val clickIndicator = KTextView { withId(R.id.animated_view_click_indicator) }
}
