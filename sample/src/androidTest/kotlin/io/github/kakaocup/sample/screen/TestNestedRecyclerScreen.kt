package io.github.kakaocup.sample.screen

import android.view.View
import io.github.kakaocup.kakao.recycler.KRecyclerItem
import io.github.kakaocup.kakao.recycler.KRecyclerView
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R
import org.hamcrest.Matcher

class TestNestedRecyclerScreen : Screen<TestNestedRecyclerScreen>() {
    val recycler = KRecyclerView({ withId(R.id.recycler_view) }, { itemType(::RecyclerItem) })

    class RecyclerItem(parent: Matcher<View>) : KRecyclerItem<RecyclerItem>(parent) {
        val nested = KRecyclerView(parent, { withId(R.id.nested_recycler_view) }, { itemType(::NestedItem) })
    }

    class NestedItem(parent: Matcher<View>) : KRecyclerItem<NestedItem>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.title) }
        val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
        val button: KButton = KButton(parent) { withId(R.id.button) }
    }
}
