package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.SwitchersScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SwitchersViewTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(SwitchersActivity::class.java)

    @Test
    fun testTextSwitcher() {
        Screen.onScreen<SwitchersScreen> {
            textSwitcher {
                hasText("Counter: 1")
            }

            nextButton.click()

            textSwitcher {
                hasText("Counter: 2")
            }
        }
    }
}
