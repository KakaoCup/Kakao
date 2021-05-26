package io.github.kakaocup.sample.screen

import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.list.KAbsListView
import io.github.kakaocup.kakao.list.KAdapterItem
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R

class DrawableListScreen : Screen<DrawableListScreen>() {
    val list = KAbsListView(
        builder = { withId(R.id.drawableList) },
        itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val imageView = KImageView(i) { withId(R.id.imgView) }
    }
}
