package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.scroll.KScrollView
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R


class ScrollScreen : Screen<ScrollScreen>() {
    val firstElement = KTextView { withId(R.id.first_element) }
    val secondElement = KTextView { withId(R.id.second_element) }
    val scroll = KScrollView { withId(R.id.scroll) }

    fun checkStart() {
        idle(1000)
        firstElement {
            isDisplayed()
        }
        secondElement {
            isNotDisplayed()
        }
    }

    fun checkEnd() {
        idle(1000)
        firstElement {
            isNotDisplayed()
        }
        secondElement {
            isDisplayed()
        }
    }
}
