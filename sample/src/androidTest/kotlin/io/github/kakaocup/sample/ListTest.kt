package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.TestListScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ListTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ListActivity::class.java)

    @Test
    fun testContentItemsListView() {
        onScreen<TestListScreen> {
            list {
                isVisible()
                hasSize(10)

                firstChild<TestListScreen.Item> {
                    isVisible()
                    title {
                        hasText("Title 1")
                    }
                    subtitle {
                        hasText("This is a test subtitle character sequence")
                        hasBackgroundColor("#dfebf5")
                    }
                }

                lastChild<TestListScreen.Item> {
                    isVisible()
                    title { hasText("Title 10") }
                }

                children<TestListScreen.Item> {
                    subtitle {
                        hasText("This is a test subtitle character sequence")
                        hasBackgroundColor(R.color.background_color)
                    }
                }

                childWith<TestListScreen.Item> {
                    isInstanceOf(String::class.java)
                    equals("Title 5")
                } perform {
                    title {
                        isDisplayed()
                        hasText("Title 5")
                    }

                    button { click() }
                }

                childAt<TestListScreen.Item>(4) {
                    title {
                        isDisplayed()
                        hasText("Title 5")
                    }
                }
            }
        }
    }

    @Test
    fun testDataInteraction() {
        val dataList = mutableListOf<String>()
        val viewList = mutableListOf<String>()

        onScreen<TestListScreen> {
            intercept {
                onDataInteraction {
                    onAll { dataList.add("DATA_ALL") }
                    onCheck { _, _ -> dataList.add("DATA_CHECK") }
                }

                onViewInteraction {
                    onAll { viewList.add("ALL") }
                    onCheck { _, _ -> viewList.add("CHECK") }
                    onPerform { _, _ -> viewList.add("PERFORM") }
                }
            }

            list {
                firstChild<TestListScreen.Item> {
                    isVisible()
                    title { click() }
                }
            }
        }

        assert(
            dataList == mutableListOf(
                "DATA_ALL",
                "DATA_CHECK",
                "DATA_ALL",
                "DATA_CHECK",
                "DATA_ALL",
                "DATA_CHECK",
                "DATA_ALL",
                "DATA_CHECK"
            )
        )
        assert(viewList == mutableListOf("ALL", "CHECK", "ALL", "PERFORM"))
    }
}
