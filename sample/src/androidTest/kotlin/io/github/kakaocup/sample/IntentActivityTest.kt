package io.github.kakaocup.sample

import androidx.test.espresso.intent.Intents
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.IntentActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class IntentActivityTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(IntentActivity::class.java)

    @Test
    fun testContentScreen() {
        Intents.init()
        onScreen<IntentActivityScreen> {
            resultText { hasText("No result") }

            startActivityButton { click() }
            normalIntent { intended() }
            pressBack()

            okResultIntent { intending() }
            startActivityForResultButton { click() }
            resultText { hasText("SUCCESS") }

            errorResultIntent { intending() }
            startActivityForResultButton { click() }
            resultText { hasText("null") }
        }
    }
}
