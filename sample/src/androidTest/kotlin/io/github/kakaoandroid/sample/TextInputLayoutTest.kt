package io.github.kakaoandroid.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaoandroid.kakao.screen.Screen.Companion.onScreen
import io.github.kakaoandroid.sample.screen.TextInputLayoutScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class TextInputLayoutTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(TextInputLayoutActivity::class.java)

    @Test
    fun testTextInputLayout() {
        onScreen<TextInputLayoutScreen> {
            inputLayout {
                hasCounterMaxLength(50)
                hasHint("This is the HINT!")
                hasHint(R.string.hint)
                hasError("This is the ERROR!")
                hasError(R.string.error)
                isCounterEnabled()
                isHintEnabled()
                isErrorEnabled()
            }

            toggleCounter { click() }
            toggleHint { click() }
            toggleError { click() }

            inputLayout {
                isCounterDisabled()
                isHintDisabled()
                isErrorDisabled()

                edit {
                    typeText("EDIT TEST")
                    hasText("EDIT TEST")
                }
            }
        }
    }
}
