package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.AlertDialogActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AlertDialogTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(AlertDialogActivity::class.java)

    @Test
    fun testAlertDialog() {
        Screen.onScreen<AlertDialogActivityScreen> {
            showAlertDialogButton {
                click()
            }

            alertDialog {
                title {
                    hasText("Title")
                }

                message {
                    hasText("Message")
                }

                icon {
                    hasDrawable(R.drawable.ic_android_black_24dp)
                }

                positiveButton {
                    hasText("Positive")
                    click()
                }
            }

            showAlertDialogButton {
                click()
            }

            alertDialog {
                negativeButton {
                    hasText("Negative")
                    click()
                }
            }

            showAlertDialogButton {
                click()
            }

            alertDialog {
                neutralButton {
                    hasText("Neutral")
                    click()
                }
            }
        }
    }
}
