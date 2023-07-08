package io.github.kakaocup.sample

import androidx.core.content.ContextCompat
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.platform.app.InstrumentationRegistry
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.screen.ImageViewScreen
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ImageViewTest {
    @Rule
    @JvmField
    val rule = ActivityScenarioRule(ImageViewActivity::class.java)

    @Test
    fun fromResourceMatchingTest() {
        Screen.onScreen<ImageViewScreen> {
            imageView {
                hasDrawable(R.drawable.ic_sentiment_very_satisfied_black_24dp)
            }
        }
    }

    @Test
    fun fromResourceTintedMatchingTest() {
        Screen.onScreen<ImageViewScreen> {
            tintedImageView {
                hasDrawableWithTint(R.drawable.ic_sentiment_very_satisfied_black_24dp, R.color.red)
            }
        }
    }

    @Test
    fun fromDrawableMatchingTest() {
        val expectedDrawable = ContextCompat.getDrawable(
            InstrumentationRegistry.getInstrumentation().targetContext,
            R.drawable.ic_sentiment_very_satisfied_black_24dp
        )

        Screen.onScreen<ImageViewScreen> {
            imageView {
                hasDrawable(expectedDrawable!!)
            }
        }
    }

    @Test
    fun fromDrawableTintedMatchingTest() {
        val expectedDrawable = ContextCompat.getDrawable(
            InstrumentationRegistry.getInstrumentation().targetContext,
            R.drawable.ic_sentiment_very_satisfied_black_24dp
        )

        Screen.onScreen<ImageViewScreen> {
            tintedImageView {
                hasDrawableWithTint(expectedDrawable!!, R.color.red)
            }
        }
    }
}