package io.github.kakaoandroid.sample.screen

import android.view.View
import io.github.kakaoandroid.kakao.check.KCheckBox
import io.github.kakaoandroid.kakao.recycler.KRecyclerItem
import io.github.kakaoandroid.kakao.recycler.KRecyclerView
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.text.KTextView
import io.github.kakaoandroid.sample.R
import org.hamcrest.Matcher

open class TestRecyclerScreen : Screen<TestRecyclerScreen>() {
    val recycler: KRecyclerView = KRecyclerView({
                                                    withId(R.id.recycler_view)
                                                }, itemTypeBuilder = {
        itemType(::MainItem)
        itemType(::CheckBoxItem)
    })

    class MainItem(parent: Matcher<View>) : KRecyclerItem<MainItem>(parent) {
        val title: KTextView = KTextView(parent) { withId(R.id.title) }
        val subtitle: KTextView = KTextView(parent) { withId(R.id.subtitle) }
    }

    class CheckBoxItem(parent: Matcher<View>) : KRecyclerItem<CheckBoxItem>(parent) {
        val checkbox: KCheckBox = KCheckBox { withMatcher(parent) }
    }
}
