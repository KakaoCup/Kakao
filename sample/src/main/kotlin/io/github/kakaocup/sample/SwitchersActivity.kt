package io.github.kakaocup.sample

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextSwitcher
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SwitchersActivity : AppCompatActivity() {

    private val textSwitcher: TextSwitcher by lazy { findViewById(R.id.text_switcher) }
    private val nextButton: Button by lazy { findViewById(R.id.next) }

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_textswitcher)
        textSwitcher.setFactory {
            val textView = TextView(this)
            textView.textSize = TEXT_SIZE
            textView.gravity = Gravity.CENTER_HORIZONTAL
            textView.setTextColor(Color.parseColor("#0F9D58"))
            textView
        }
        textSwitcher.setCurrentText(getNextText())
        nextButton.setOnClickListener {
            textSwitcher.setText(getNextText())
        }
    }

    private fun getNextText(): String {
        counter++
        return "Counter: $counter"
    }

    private companion object {
        const val TEXT_SIZE = 24f
    }
}
