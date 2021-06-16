package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.edit.KTextInputLayout
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.sample.R

class TextInputLayoutScreen : Screen<TextInputLayoutScreen>() {
    val inputLayout = KTextInputLayout { withId(R.id.input_layout) }
    val toggleCounter = KButton { withId(R.id.toggle_counter) }
    val toggleHint = KButton { withId(R.id.toggle_hint) }
    val toggleError = KButton { withId(R.id.toggle_error) }
    val cleanError = KButton { withId(R.id.clean_error) }

    init {
        rootView = inputLayout
    }
}
