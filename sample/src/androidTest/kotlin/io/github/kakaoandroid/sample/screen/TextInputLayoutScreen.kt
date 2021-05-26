package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.edit.KTextInputLayout
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.text.KButton
import io.github.kakaoandroid.sample.R

class TextInputLayoutScreen : Screen<TextInputLayoutScreen>() {
    val inputLayout = KTextInputLayout { withId(R.id.input_layout) }
    val toggleCounter = KButton { withId(R.id.toggle_counter) }
    val toggleHint = KButton { withId(R.id.toggle_hint) }
    val toggleError = KButton { withId(R.id.toggle_error) }

    init {
        rootView = inputLayout
    }
}
