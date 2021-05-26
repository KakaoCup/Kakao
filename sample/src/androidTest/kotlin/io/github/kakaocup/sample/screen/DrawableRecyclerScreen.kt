package io.github.kakaocup.sample.screen

import android.view.View
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R
import org.hamcrest.Matcher

class DrawableRecyclerScreen : Screen<DrawableRecyclerScreen>() {
    val list = KRecyclerView(
        builder = { withId(R.id.drawableRecycler) },
        itemTypeBuilder = { itemType(::Item) })

    class Item(parent: Matcher<View>) :
        KRecyclerItem<Item>(parent) {
        val imageView = KImageView(parent, { withId(R.id.imgView) })
    }

}
