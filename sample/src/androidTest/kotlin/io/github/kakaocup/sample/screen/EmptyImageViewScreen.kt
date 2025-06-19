package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R

open class EmptyImageViewScreen : Screen<EmptyImageViewScreen>() {
    val imageViewWithDrawable = KImageView {
        withDrawable(R.drawable.ic_sentiment_very_satisfied_black_24dp)
    }
}
