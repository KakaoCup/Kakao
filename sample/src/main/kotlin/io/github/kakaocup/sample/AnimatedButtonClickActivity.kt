package io.github.kakaocup.sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class AnimatedButtonClickActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animated_button_clicks)
        setupAnimatedButton()
    }

    @Suppress("MagicNumber")
    private fun setupAnimatedButton() {
        val view = findViewById<View>(R.id.animated_view)
        view.rotation = 45f
        view.scaleY = 0.1f

        val clickIndicator = findViewById<View>(R.id.animated_view_click_indicator)
        view.setOnClickListener {
            clickIndicator.visibility = View.VISIBLE
        }
    }
}
