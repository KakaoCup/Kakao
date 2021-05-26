package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.AutoCompleteActivityScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class AutoCompleteTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(AutoCompleteActivity::class.java)

    @Test
    fun testContentItemsListView() {
        onScreen<AutoCompleteActivityScreen> {
            input {
                isDisplayed()
                typeText("Title")
            }

            list {
                inRoot {
                    isPlatformPopup()
                }

                isVisible()
                hasSize(10)

                firstChild<AutoCompleteActivityScreen.Item> {
                    isVisible()
                    text {
                        hasText("Title 1")
                    }
                }

                lastChild<AutoCompleteActivityScreen.Item> {
                    isVisible()
                    text { hasText("Title 10") }
                }

                childWith<AutoCompleteActivityScreen.Item> {
                    isInstanceOf(String::class.java)
                    equals("Title 5")
                } perform {
                    text {
                        isDisplayed()
                        click()
                    }
                }
            }

            input {
                isDisplayed()
                hasText("Title 5")
            }
        }
    }
}
