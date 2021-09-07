package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.TestRecyclerScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MultiTypeRecyclerTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(MultitypeRecyclerActivity::class.java)

    @Test
    fun testMultipleItemTypeRecyclerView() {
        onScreen<TestRecyclerScreen> {
            recycler {
                isVisible()
                hasSize(9)

                firstChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Title 0") }
                }

                lastChild<TestRecyclerScreen.MainItem> {
                    isVisible()
                    title { hasText("Final Title") }
                }
            }
        }
    }

    @Test
    fun testFirstLevelItemTypeRecyclerView() {
        onScreen<TestRecyclerScreen> {
            recycler {
                childWith<TestRecyclerScreen.CheckBoxItem> { withText("CheckBox 2") } perform {
                    checkbox {
                        isNotChecked()
                        click()
                        isChecked()
                    }
                }

                childAt<TestRecyclerScreen.CheckBoxItem>(4) {
                    checkbox {
                        hasText("CheckBox 0")
                    }
                }
            }
        }
    }
}
