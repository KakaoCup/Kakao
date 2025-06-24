package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.EmptyImageViewScreen
import org.junit.Ignore
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class EmptyDrawableMatcherTest {

    @Rule
    @JvmField
    val rule = ActivityScenarioRule(EmptyImageViewActivity::class.java)

    @Test
    fun test() {
        Screen.onScreen<EmptyImageViewScreen> {
            imageViewWithDrawable.isVisible()
        }
    }
}
