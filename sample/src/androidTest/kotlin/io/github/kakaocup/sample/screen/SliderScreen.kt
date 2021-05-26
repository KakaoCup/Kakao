package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.slider.KSlider
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.sample.R

class SliderScreen : Screen<SliderScreen>() {
    val slider = KSlider { withId(R.id.slider) }
    val buttonValue5 = KButton { withId(R.id.button_value_5) }
}
