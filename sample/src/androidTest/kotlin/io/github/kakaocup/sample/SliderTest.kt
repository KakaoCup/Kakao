package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.SliderScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SliderTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(SliderActivity::class.java)

    @Test
    fun testSlider() {
        onScreen<SliderScreen> {
            slider {
                isVisible()
                hasValue(0f)
                setValue(2f)
                hasValue(2f)
                dragValueTo(8f)
                hasValue(8f)
            }
            buttonValue5 {
                click()
            }
            slider {
                hasValue(5f)
            }
        }
    }
}
