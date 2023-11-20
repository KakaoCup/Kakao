package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.ScrollScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class NestedScrollTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(NestedScrollActivity::class.java)

    @Test
    fun test() {
        onScreen<ScrollScreen> {
            checkStart()
            scroll { scrollToEnd() }
            checkEnd()

            scroll { scrollToStart() }
            checkStart()

            scroll { scrollTo(5000) }
            checkEnd()
        }
    }
}

