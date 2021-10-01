package io.github.kakaocup.sample.screen


import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

open class LinearLayoutScreen : Screen<LinearLayoutScreen>() {
    val text1 = KTextView {
        withParent {
            withId(R.id.linear_layout)
        }
        withIndex(0) {
            withTag("matchTag")
        }
    }

    val text2 = KTextView {
        withParent {
            withId(R.id.linear_layout)
        }
        onPosition(1)
    }
}
