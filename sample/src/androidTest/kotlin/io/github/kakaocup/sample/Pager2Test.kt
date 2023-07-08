package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.Pager2Screen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4ClassRunner::class)
class Pager2Test {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ViewPager2Activity::class.java)

    @Test
    fun testViewPager2() {
        Screen.onScreen<Pager2Screen> {
            pager {
                isVisible()
                hasSize(6)

                childAt<Pager2Screen.SimpleItem>(0) {
                    text {
                        hasText("0")
                    }
                }

                childAt<Pager2Screen.SimpleItem>(5) {
                    text {
                        hasText("5")
                    }
                }
            }
        }
    }

    @Test
    fun testViewPager2Scroll() {
        Screen.onScreen<Pager2Screen> {
            pager {
                hasDescendant {
                    withText("0")
                    isCompletelyDisplayed()
                }
                scrollForward()
                hasDescendant {
                    withText("1")
                    isCompletelyDisplayed()
                }
                scrollBackward()
                hasDescendant {
                    withText("0")
                    isCompletelyDisplayed()
                }
            }
        }
    }

    @Test
    fun testViewPager2ScrollOverStartEdge() {
        Screen.onScreen<Pager2Screen> {
            pager {
                scrollToStart()
                hasDescendant {
                    withText("0")
                    isCompletelyDisplayed()
                }
                scrollBackward()
                hasDescendant {
                    withText("0")
                    isCompletelyDisplayed()
                }
            }
        }
    }

    @Test
    fun testViewPager2ScrollOverEndEdge() {
        Screen.onScreen<Pager2Screen> {
            pager {
                scrollToEnd()
                hasDescendant {
                    withText("5")
                    isCompletelyDisplayed()
                }
                scrollForward()
                hasDescendant {
                    withText("5")
                    isCompletelyDisplayed()
                }
            }
        }
    }
}
