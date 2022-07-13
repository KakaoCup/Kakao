package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

class TextScreen : Screen<TextScreen>() {
    val textViewPlain = KTextView { withId(R.id.plain_text_view) }
    val textViewWithLeftDrawable = KTextView { withId(R.id.text_view_drawable_left) }
    val textViewWithRightDrawable = KTextView { withId(R.id.text_view_drawable_right) }
    val textViewWithTopDrawable = KTextView { withId(R.id.text_view_drawable_top) }
    val textViewWithBottomDrawable = KTextView { withId(R.id.text_view_drawable_bottom) }
}
