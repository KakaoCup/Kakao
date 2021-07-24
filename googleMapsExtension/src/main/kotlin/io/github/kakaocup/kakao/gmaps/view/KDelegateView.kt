package io.github.kakaocup.kakao.gmaps.view

import androidx.fragment.app.FragmentActivity
import androidx.test.core.app.ActivityScenario
import io.github.kakaocup.kakao.common.views.KDSLView
import io.github.kakaocup.kakao.gmaps.exceptions.DelegateNotFoundException
import io.github.kakaocup.kakao.gmaps.screen.MapScreen

open class KDelegateView<ACTIVITY : FragmentActivity, DELEGATE, CLASS>(
    private val mapScreen: MapScreen<*, ACTIVITY>,
    private val matcher: ACTIVITY.() -> DELEGATE?
) : KDSLView<CLASS>() {

    val scenario: ActivityScenario<*>
        get() = mapScreen.activityRule.scenario

    val delegate: DELEGATE
        get() {
            var delegate: DELEGATE? = null
            mapScreen.activityRule.scenario.onActivity {
                delegate = matcher.invoke(it)
            }
            return delegate ?: throw DelegateNotFoundException()
        }
}
