package io.github.kakaoandroid.sample.screen

import android.view.View
import io.github.kakaoandroid.kakao.pager2.KViewPager2
import io.github.kakaoandroid.kakao.pager2.KViewPagerItem
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.text.KTextView
import io.github.kakaoandroid.sample.R
import org.hamcrest.Matcher

open class Pager2Screen : Screen<Pager2Screen>() {
    val pager: KViewPager2 = KViewPager2({
                                             withId(R.id.pager)
                                         }, itemTypeBuilder = {
        itemType(Pager2Screen::SimpleItem)
    })

    class SimpleItem(parent: Matcher<View>) : KViewPagerItem<SimpleItem>(parent) {
        val text: KTextView = KTextView(parent) { withId(R.id.text) }
    }
}
