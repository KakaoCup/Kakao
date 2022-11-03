package io.github.kakaocup.sample

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableStringBuilder
import android.text.style.ClickableSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TextActivity : AppCompatActivity() {

    private val clickableSpansTextView: TextView by lazy { findViewById(R.id.text_view_multiple_clickable_spans) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)
        buildClickableSpanString()
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
}
