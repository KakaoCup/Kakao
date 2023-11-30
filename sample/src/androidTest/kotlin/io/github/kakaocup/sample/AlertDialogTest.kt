package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.common.utilities.getResourceDrawable
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
            getResourceDrawable(R.drawable.ic_android_black_24dp)
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
                    hasDrawable(android.R.drawable.arrow_up_float)
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

    @Test
    fun testMultiChoiceAlertDialog() {
        Screen.onScreen<AlertDialogActivityScreen> {
            showMultiChoiceAlertDialogButton {
                click()
            }

            alertDialog {
                hasChoiceItems("First", "Second", "Third")

                onChoiceItem("First") {
                    isChecked()
                }

                onChoiceItem("Second") {
                    isDisplayed()
                    isNotChecked()
                    click()
                    isChecked()
                }
            }
        }
    }
}
