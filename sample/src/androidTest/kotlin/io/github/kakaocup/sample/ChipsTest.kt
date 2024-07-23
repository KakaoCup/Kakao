package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.ChipsScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ChipsTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ChipsActivity::class.java)

    @Test
    fun testCorrectChipsDisplayed() {
        onScreen<ChipsScreen> {
            chip1 {
                isChecked()
                hasText("Chip1")
                hasCheckedIcon(R.drawable.ic_sentiment_very_satisfied_black_24dp)
            }
            chip2 {
                isNotChecked()
                hasText("Chip2")
                hasChipIcon(R.drawable.ic_auto_fix_high_24dp)
            }
            chip3 {
                isNotChecked()
                hasText("Chip3")
                hasCloseIcon(R.drawable.ic_android_black_24dp, tintColorId = android.R.color.black)
            }
            chip4 {
                isNotChecked()
                hasText("Chip4")
                hasNoIconVisible()
            }
        }
    }
}
