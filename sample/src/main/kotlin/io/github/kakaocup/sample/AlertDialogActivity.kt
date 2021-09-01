package io.github.kakaocup.sample

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class AlertDialogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        val singleChoiceItems = listOf("First", "Second", "Third")

        findViewById<View>(R.id.show_alert_dialog).setOnClickListener {
            AlertDialog
                .Builder(this)
                .setTitle("Title")
                .setIcon(android.R.drawable.arrow_up_float)
                .setMessage("Message")
                .setPositiveButton("Positive") { _, _ -> }
                .setNegativeButton("Negative") { _, _ -> }
                .setNeutralButton("Neutral") { _, _ -> }
                .create()
                .show()
        }

        findViewById<View>(R.id.show_multi_choice_dialog).setOnClickListener {
            AlertDialog
                .Builder(this)
                .setTitle("Title")
                .setIcon(android.R.drawable.arrow_up_float)
                .setSingleChoiceItems(singleChoiceItems.toTypedArray(), 0) { _, _ -> }
                .setPositiveButton("Positive") { _, _ -> }
                .setNegativeButton("Negative") { _, _ -> }
                .setNeutralButton("Neutral") { _, _ -> }
                .create()
                .show()
        }
    }
}
