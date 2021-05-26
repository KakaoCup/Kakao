package io.github.kakaocup.sample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.slider.Slider

class SliderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)
        val slider = findViewById<Slider>(R.id.slider)
        val valueButton = findViewById<Button>(R.id.button_value_5)
        valueButton.setOnClickListener {
            slider.value = 5f
        }
    }
}
