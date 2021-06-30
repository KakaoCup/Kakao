package io.github.kakaocup.kakao.gmaps.view

import androidx.test.core.app.ActivityScenario

interface UiThread {
    val scenario: ActivityScenario<*>

    fun runOnUiThread(function: () -> Unit) {
        scenario.onActivity {
            it.runOnUiThread {
                function.invoke()
            }
        }
    }
}
