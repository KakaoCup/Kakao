package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.ext.clicks.coordinates.VisibleCenterGlobalCoordinatesProvider
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.ButtonClickScreen
import io.github.kakaocup.sample.tools.applyEspressoClickExtension
import io.github.kakaocup.sample.tools.applyKakaoClickExtension
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ButtonClickTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ButtonClickActivity::class.java)

    @Test
    fun testEspressoClickAction() {
        Screen.onScreen<ButtonClickScreen> {
            applyEspressoClickExtension()
            button {
                click()
                hasText("Single Click")
                longClick()
                hasText("Long Click")
            }
        }
    }

    @Test
    fun testKakaoClickAction() {
        Screen.onScreen<ButtonClickScreen> {
            applyKakaoClickExtension()

            button {
                click()
                hasText("Single Click")
                longClick()
                hasText("Long Click")
            }

            applyEspressoClickExtension()
        }
    }

    @Test
    fun testKakaoClickActionOnGlobalCenter() {
        Screen.onScreen<ButtonClickScreen> {
            applyKakaoClickExtension()

            button {
                click(VisibleCenterGlobalCoordinatesProvider())
                hasText("Single Click")
                longClick(VisibleCenterGlobalCoordinatesProvider())
                hasText("Long Click")
            }

            applyEspressoClickExtension()
        }
    }
}
