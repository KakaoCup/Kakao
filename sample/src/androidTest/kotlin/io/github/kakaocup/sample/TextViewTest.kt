package io.github.kakaocup.sample

import android.graphics.Typeface
import android.view.Gravity.BOTTOM
import android.view.Gravity.CENTER_HORIZONTAL
import android.view.Gravity.CENTER_VERTICAL
import android.view.Gravity.END
import android.view.Gravity.START
import android.view.Gravity.TOP
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
    fun testCompoundDrawables() {
        Screen.onScreen<TextScreen> {
            textViewWithLeftDrawable.hasCompoundDrawable(left = R.drawable.ic_android_black_24dp)
            textViewWithRightDrawable.hasCompoundDrawable(right = R.drawable.ic_android_black_24dp)
            textViewWithTopDrawable.hasCompoundDrawable(top = R.drawable.ic_android_black_24dp)
            textViewWithBottomDrawable.hasCompoundDrawable(bottom = R.drawable.ic_android_black_24dp)
            textViewPlain.hasCompoundDrawable()
        }
    }

    @Test
    fun testTextGravity() {
        Screen.onScreen<TextScreen> {
            textViewCentered.hasGravity(horizontalGravity = CENTER_HORIZONTAL)
            textViewOnStart.hasGravity(horizontalGravity = START)
            textViewOnEnd.hasGravity(horizontalGravity = END)
            textViewOnTop.hasGravity(verticalGravity = TOP)
            textViewOnBottom.hasGravity(verticalGravity = BOTTOM)
            textViewOnTopLeft.hasGravity(horizontalGravity = START, verticalGravity = TOP)
            textViewOnBottomRight.hasGravity(horizontalGravity = END, verticalGravity = BOTTOM)
            textViewHorizontalCenteredTop.hasGravity(horizontalGravity = CENTER_HORIZONTAL, verticalGravity = TOP)
            textViewVerticalCenteredEnd.hasGravity(horizontalGravity = END, verticalGravity = CENTER_VERTICAL)
        }
    }

    @Test
    fun testTextSize() {
        Screen.onScreen<TextScreen> {
            textViewSize14Sp.hasTextSize(14)
            textViewSize19Sp.hasTextSize(19)
            textViewSize32Sp.hasTextSize(32)
        }
    }

    @Test
    fun testTextTypeface() {
        Screen.onScreen<TextScreen> {
            textViewTypefaceNormal.hasTypeface(Typeface.DEFAULT)
            textViewTypefaceMonospace.hasTypeface(Typeface.MONOSPACE)
            textViewTypefaceNormalBold.hasTypeface(Typeface.DEFAULT_BOLD)
            textViewTypefaceSansItalic.hasTypeface(Typeface.create("sans", Typeface.ITALIC))
            textViewTypefaceSerifBoldItalic.hasTypeface(Typeface.create("serif", Typeface.BOLD_ITALIC))
        }
    }

    @Test
    fun testBoldStyle() {
        Screen.onScreen<TextScreen> {
            textViewTypefaceNormal.isNotBold()
            textViewTypefaceNormalBold.isBold()
            textViewTypefaceSansItalic.isNotBold()
            textViewTypefaceSerifBoldItalic.isBold()
        }
    }

    @Test
    fun testItalicStyle() {
        Screen.onScreen<TextScreen> {
            textViewTypefaceNormal.isNotItalic()
            textViewTypefaceNormalBold.isNotItalic()
            textViewTypefaceSansItalic.isItalic()
            textViewTypefaceSerifBoldItalic.isItalic()
        }
    }
}
