package io.github.kakaocup.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayout

class TabLayoutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val tabs = listOf("Tab1", "Tab2", "Tab3")
        tabs.forEach { tab ->
            tabLayout.addTab(tabLayout.newTab().setText(tab))
        }
    }
}
