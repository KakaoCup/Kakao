package io.github.kakaocup.sample.screen

import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.list.KAbsListView
import io.github.kakaocup.kakao.list.KAdapterItem
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

class TestListScreen : Screen<TestListScreen>() {
    val list = KAbsListView(
        builder = { withId(R.id.list) },
        itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val title = KTextView(i) { withId(R.id.title) }
        val subtitle = KTextView(i) { withId(R.id.subtitle) }
        val button = KButton(i) { withId(R.id.button) }
    }
}
