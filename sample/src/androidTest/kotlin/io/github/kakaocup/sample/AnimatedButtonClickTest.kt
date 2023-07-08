package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.ext.clicks.coordinates.VisibleCenterGlobalCoordinatesProvider
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.AnimatedButtonClickScreen
import io.github.kakaocup.sample.tools.applyEspressoClickExtension
import io.github.kakaocup.sample.tools.applyKakaoClickExtension
import org.junit.Assert.assertThrows
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AnimatedButtonClickTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(AnimatedButtonClickActivity::class.java)

    @Test
    fun testEspressoClickAction() {
        Screen.onScreen<AnimatedButtonClickScreen> {
            applyEspressoClickExtension()

            animatedView.click()
            assertThrows(AssertionError::class.java) {
                clickIndicator.isVisible()
            }
        }
    }

    @Test
    fun testKakaoClickAction() {
        Screen.onScreen<AnimatedButtonClickScreen> {
            applyKakaoClickExtension()

            animatedView.click()
            assertThrows(AssertionError::class.java) {
                clickIndicator.isVisible()
            }

            applyEspressoClickExtension()
        }
    }

    @Test
    fun testKakaoClickActionOnGlobalCenter() {
        Screen.onScreen<AnimatedButtonClickScreen> {
            applyKakaoClickExtension()

            animatedView.click(VisibleCenterGlobalCoordinatesProvider())
            clickIndicator.isVisible()

            applyEspressoClickExtension()
        }
    }
}
