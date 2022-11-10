package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R

open class ImageViewScreen : Screen<ImageViewScreen>() {
    val imageView = KImageView {
        withId(R.id.image)
    }

    val tintedImageView = KImageView {
        withId(R.id.tinted_image)
    }
}
