package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.TabLayoutActivityScreen
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class TabLayoutTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(TabLayoutActivity::class.java)

    @Test
    fun testTabLayout() {
        onScreen<TabLayoutActivityScreen> {
            tabLayout {
                tabCount(3)

                isTabSelected(0)
                assertEquals(0, getSelectedItem())

                selectTab(1)

                isTabSelected(1)
                assertEquals(1, getSelectedItem())

                selectTab("Tab3")
                isTabSelected("Tab3")
            }
        }
    }
}
