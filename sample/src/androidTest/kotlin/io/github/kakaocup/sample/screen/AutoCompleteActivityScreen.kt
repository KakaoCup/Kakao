package io.github.kakaocup.sample.screen

import android.widget.ListView
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.edit.KEditText
import io.github.kakaocup.kakao.list.KAbsListView
import io.github.kakaocup.kakao.list.KAdapterItem
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

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
