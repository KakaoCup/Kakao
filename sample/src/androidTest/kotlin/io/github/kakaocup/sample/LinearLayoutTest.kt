package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.LinearLayoutScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class LinearLayoutTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(LinearLayoutActivity::class.java)

    @Test
    fun testLinearLayout() {
        Screen.onScreen<LinearLayoutScreen> {
            text1 {
                hasText("Text 1")
            }

            text2 {
                hasText("Text 2")
            }
        }
    }
}
