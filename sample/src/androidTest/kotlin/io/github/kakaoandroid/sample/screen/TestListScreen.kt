package io.github.kakaoandroid.sample.screen

import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.list.KAbsListView
import io.github.kakaoandroid.kakao.list.KAdapterItem
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.text.KButton
import io.github.kakaoandroid.kakao.text.KTextView
import io.github.kakaoandroid.sample.R

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
