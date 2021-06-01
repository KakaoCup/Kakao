package io.github.kakaocup.sample

import androidx.test.espresso.web.webdriver.Locator
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen.Companion.onScreen
import io.github.kakaocup.sample.screen.TestWebScreen
import org.junit.Ignore
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class WebTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(WebActivity::class.java)

    @Test
    @Ignore("Failed on API 29+")
    fun testWebViewHasTextHelloAndClickLink() {
        onScreen<TestWebScreen> {
            webView {
                withElement(Locator.ID, "text") {
                    hasText("Hello")
                }
                withElement(Locator.LINK_TEXT, "My Home") {
                    click()
                }
            }
        }
    }

    @Test
    @Ignore("Failed on API 29+")
    fun testWebViewInteractionInterceptor() {
        val list = mutableListOf<String>()

        onScreen<TestWebScreen> {
            webView {
                intercept {
                    onAll { list.add("ALL") }
                    onCheck { _, _ -> list.add("CHECK") }
                    onPerform { _, _ -> list.add("PERFORM") }
                }

                withElement(Locator.ID, "text") {
                    hasText("Hello")
                }
                withElement(Locator.LINK_TEXT, "My Home") {
                    click()
                }
            }
        }

        assert(list == mutableListOf("ALL", "CHECK", "ALL", "PERFORM"))
    }
}
