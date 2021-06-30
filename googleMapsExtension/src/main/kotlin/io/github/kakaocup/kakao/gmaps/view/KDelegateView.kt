package io.github.kakaocup.kakao.gmaps.view

import androidx.fragment.app.FragmentActivity
import androidx.test.core.app.ActivityScenario
import io.github.kakaocup.kakao.common.views.KDSLView
import io.github.kakaocup.kakao.gmaps.exceptions.DelegateNotFoundException
import io.github.kakaocup.kakao.gmaps.screen.MapScreen
import io.github.kakaocup.kakao.gmaps.view.marker.KMarker

open class KDelegateView<ACTIVITY : FragmentActivity, DELEGATE>(
    private val mapScreen: MapScreen<*, ACTIVITY>,
    private val matcher: ACTIVITY.() -> DELEGATE?
) : KDSLView<KMarker<ACTIVITY>>() {

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
