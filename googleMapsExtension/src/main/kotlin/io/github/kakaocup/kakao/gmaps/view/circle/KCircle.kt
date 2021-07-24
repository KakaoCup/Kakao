package io.github.kakaocup.kakao.gmaps.view.circle

import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.model.Circle
import io.github.kakaocup.kakao.gmaps.screen.MapScreen
import io.github.kakaocup.kakao.gmaps.view.KDelegateView
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps

class KCircle<ACTIVITY : FragmentActivity>(
    mapScreen: MapScreen<*, ACTIVITY>,
    override val googleMap: KGoogleMaps,
    matcher: ACTIVITY.() -> Circle?
) : KDelegateView<ACTIVITY, Circle, KCircle<ACTIVITY>>(mapScreen, matcher), CircleAssertions, CircleActions
