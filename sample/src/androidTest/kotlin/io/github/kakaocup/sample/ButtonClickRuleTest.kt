package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.Kakao
import io.github.kakaocup.kakao.ext.clicks.KakaoClicksTestRule
import io.github.kakaocup.kakao.ext.clicks.KakaoDoubleClick
import io.github.kakaocup.kakao.ext.clicks.KakaoLongClick
import io.github.kakaocup.kakao.ext.clicks.KakaoSingleClick
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.ButtonClickScreen
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain
import org.junit.rules.TestRule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ButtonClickRuleTest {
    @Rule
    @JvmField
    var chain: TestRule = RuleChain.outerRule(ActivityScenarioRule(ButtonClickActivity::class.java))
        .around(KakaoClicksTestRule())

    @Test
    fun testEspressoClickAction() {
        Screen.onScreen<ButtonClickScreen> {
            Kakao {
                assert(singleClickAction is KakaoSingleClick)
                assert(doubleClickAction is KakaoDoubleClick)
                assert(longClickAction is KakaoLongClick)
            }

            button {
                click()
                hasText("Single Click")
                longClick()
                hasText("Long Click")
            }
        }
    }
}
