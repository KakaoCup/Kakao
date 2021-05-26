package io.github.kakaoandroid.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaoandroid.kakao.screen.Screen.Companion.onScreen
import io.github.kakaoandroid.sample.screen.TestRecyclerScreen
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

                childWith<TestRecyclerScreen.CheckBoxItem> { withText("CheckBox 2") } perform {
                    checkbox {
                        isNotChecked()
                        click()
                        isChecked()
                    }
                }
            }
        }
    }
}
