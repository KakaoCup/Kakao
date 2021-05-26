package io.github.kakaoandroid.sample.screen

import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.image.KImageView
import io.github.kakaoandroid.kakao.list.KAbsListView
import io.github.kakaoandroid.kakao.list.KAdapterItem
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.sample.R

class DrawableListScreen : Screen<DrawableListScreen>() {
    val list = KAbsListView(
        builder = { withId(R.id.drawableList) },
        itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val imageView = KImageView(i) { withId(R.id.imgView) }
    }
}
