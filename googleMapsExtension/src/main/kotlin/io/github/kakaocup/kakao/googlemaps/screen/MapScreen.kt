package io.github.kakaocup.kakao.googlemaps.screen

import androidx.fragment.app.FragmentActivity
import androidx.test.ext.junit.rules.ActivityScenarioRule
import io.github.kakaocup.kakao.screen.Screen

abstract class MapScreen<out T : Screen<T>, ACTIVITY : FragmentActivity>(val activityRule: ActivityScenarioRule<ACTIVITY>) : Screen<T>() {
    companion object {
        inline fun <reified T : MapScreen<T, *>> onScreen(activityRule: ActivityScenarioRule<*>, noinline function: T.() -> Unit): T {
            return T::class.java
                .getDeclaredConstructor(ActivityScenarioRule::class.java)
                .newInstance(activityRule)
                .apply { this(function) }
        }
    }
}