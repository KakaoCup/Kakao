package io.github.kakaocup.sample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ButtonClickActivity : AppCompatActivity() {
    private val button: Button by lazy { findViewById(R.id.button) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_clicks)
        button.setOnClickListener {
            button.text = "Single Click"
        }

        button.setOnLongClickListener {
            button.text = "Long Click"
            true
        }
    }
}
