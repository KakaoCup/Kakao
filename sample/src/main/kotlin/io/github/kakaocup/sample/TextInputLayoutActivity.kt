package io.github.kakaocup.sample

import android.graphics.Color
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

@SuppressWarnings("MagicNumber")
class TextInputLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_layout)

        val layout = findViewById<TextInputLayout>(R.id.input_layout).apply {
            isCounterEnabled = true
            isHintEnabled = true
            isErrorEnabled = true
            counterMaxLength = 50
            hint = getSpannableHint()
            error = getSpannableError()
        }

        findViewById<Button>(R.id.toggle_counter).setOnClickListener {
            layout.isCounterEnabled = !layout.isCounterEnabled
        }

        findViewById<Button>(R.id.toggle_hint).setOnClickListener {
            layout.isHintEnabled = !layout.isHintEnabled
        }

        findViewById<Button>(R.id.toggle_error).setOnClickListener {
            layout.isErrorEnabled = !layout.isErrorEnabled
        }

        findViewById<Button>(R.id.clean_error).setOnClickListener {
            layout.error = null
        }
    }

    private fun getSpannableHint(): Spannable {
        return SpannableString(resources.getString(R.string.hint)).apply {
            setSpan(ForegroundColorSpan(Color.RED), 12, 16, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }

    private fun getSpannableError(): Spannable {
        return SpannableString(resources.getString(R.string.error)).apply {
            setSpan(ForegroundColorSpan(Color.GREEN), 12, 17, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }
    }
}
