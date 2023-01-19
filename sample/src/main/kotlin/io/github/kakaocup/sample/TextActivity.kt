package io.github.kakaocup.sample

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ClickableSpan
import android.text.style.ImageSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class TextActivity : AppCompatActivity() {

    private val clickableSpansTextView: TextView by lazy { findViewById(R.id.text_view_multiple_clickable_spans) }

    private val leftDrawableSpanTextView: TextView by lazy { findViewById(R.id.text_view_drawable_span_left) }
    private val rightDrawableSpanTextView: TextView by lazy { findViewById(R.id.text_view_drawable_span_right) }
    private val multipleDrawableSpansTextView: TextView by lazy { findViewById(R.id.text_view_drawable_span_multiple) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)
        buildClickableSpanString()
        buildDrawableSpanStrings()
    }

    @SuppressWarnings("MagicNumber")
    private fun buildClickableSpanString() {
        class DummyClickableSpan : ClickableSpan() {
            override fun onClick(widget: View) {
            // no-op
            }
        }

        val text = "First span some text last span"

        clickableSpansTextView.text = with(SpannableStringBuilder(text)) {
            setSpan(DummyClickableSpan(), 0, 10, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(DummyClickableSpan(), 21, 30, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            this
        }
    }

    private fun buildDrawableSpanStrings() {
        val text = "$ String with drawable span $"

        val imageAndroid = ResourcesCompat.getDrawable(baseContext.resources, R.drawable.ic_android_black_24dp, baseContext.theme)!!
        imageAndroid.setBounds(0, 0, imageAndroid.intrinsicWidth, imageAndroid.intrinsicHeight)
        val imageAndroidSpan = ImageSpan(imageAndroid, ImageSpan.ALIGN_BOTTOM)

        val imageSentiment = ResourcesCompat.getDrawable(baseContext.resources, R.drawable.ic_sentiment_very_satisfied_black_24dp, baseContext.theme)!!
        imageSentiment.setTint(resources.getColor(R.color.red))
        imageSentiment.setBounds(0, 0, imageSentiment.intrinsicWidth, imageSentiment.intrinsicHeight)
        val imageSentimentSpan = ImageSpan(imageSentiment, ImageSpan.ALIGN_BOTTOM)

        val leftSpanStart = 0
        val leftSpanEnd = leftSpanStart + 1
        val rightSpanStart = text.lastIndex
        val rightSpanEnd = rightSpanStart + 1

        leftDrawableSpanTextView.text = with(SpannableStringBuilder(text)) {
            setSpan(imageAndroidSpan, leftSpanStart, leftSpanEnd, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            this
        }

        rightDrawableSpanTextView.text = with(SpannableStringBuilder(text)) {
            setSpan(imageSentimentSpan, rightSpanStart, rightSpanEnd, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            this
        }

        multipleDrawableSpansTextView.text = with(SpannableStringBuilder(text)) {
            setSpan(imageAndroidSpan, leftSpanStart, leftSpanEnd, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            setSpan(imageSentimentSpan, rightSpanStart, rightSpanEnd, Spannable.SPAN_INCLUSIVE_EXCLUSIVE)
            this
        }
    }
}
