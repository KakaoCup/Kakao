package io.github.kakaocup.kakao.googlemaps

import androidx.fragment.app.FragmentActivity
import androidx.test.ext.junit.rules.ActivityScenarioRule
import io.github.kakaocup.kakao.screen.Screen
import org.junit.Rule


abstract class MapScreen<out T : Screen<T>, ACT: FragmentActivity>: Screen<T>() {

    abstract val activity: Class<ACT>

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(activity)
}