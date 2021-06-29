package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.tabs.KTabLayout
import io.github.kakaocup.sample.R

class TabLayoutActivityScreen : Screen<TabLayoutActivityScreen>() {
    val tabLayout = KTabLayout { withId(R.id.tab_layout) }
}
