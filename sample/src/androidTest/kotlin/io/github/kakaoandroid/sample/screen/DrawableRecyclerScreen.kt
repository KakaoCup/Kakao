package io.github.kakaoandroid.sample.screen

import android.view.View
import io.github.kakaoandroid.kakao.image.KImageView
import io.github.kakaoandroid.kakao.recycler.KRecyclerItem
import io.github.kakaoandroid.kakao.recycler.KRecyclerView
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.sample.R
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
