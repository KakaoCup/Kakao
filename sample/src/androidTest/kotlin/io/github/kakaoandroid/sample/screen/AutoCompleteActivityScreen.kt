package io.github.kakaoandroid.sample.screen

import android.widget.ListView
import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.edit.KEditText
import io.github.kakaoandroid.kakao.list.KAbsListView
import io.github.kakaoandroid.kakao.list.KAdapterItem
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.text.KTextView
import io.github.kakaoandroid.sample.R

class AutoCompleteActivityScreen : Screen<AutoCompleteActivityScreen>() {
    val input = KEditText {
        withId(R.id.auto_complete_view)
    }

    val list = KAbsListView(
        builder = { isInstanceOf(ListView::class.java) },
        itemTypeBuilder = { itemType(::Item) })

    class Item(i: DataInteraction) : KAdapterItem<Item>(i) {
        val text = KTextView(i) { withId(R.id.text) }
    }
}
