package io.github.kakaocup.sample

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.TextScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class TextViewTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(TextActivity::class.java)

    @Test
    fun textCompoundDrawables() {
        Screen.onScreen<TextScreen> {
            textViewWithLeftDrawable.hasCompoundDrawable(left = R.drawable.ic_android_black_24dp)
            textViewWithRightDrawable.hasCompoundDrawable(right = R.drawable.ic_android_black_24dp)
            textViewWithTopDrawable.hasCompoundDrawable(top = R.drawable.ic_android_black_24dp)
            textViewWithBottomDrawable.hasCompoundDrawable(bottom = R.drawable.ic_android_black_24dp)
            textViewPlain.hasCompoundDrawable()
        }
    }
}
