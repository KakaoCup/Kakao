package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.slider.KSlider
import io.github.kakaoandroid.kakao.text.KButton
import io.github.kakaoandroid.sample.R

class SliderScreen : Screen<SliderScreen>() {
    val slider = KSlider { withId(R.id.slider) }
    val buttonValue5 = KButton { withId(R.id.button_value_5) }
}
