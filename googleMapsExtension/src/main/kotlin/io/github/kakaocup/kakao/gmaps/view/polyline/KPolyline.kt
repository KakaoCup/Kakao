package io.github.kakaocup.kakao.gmaps.view.polyline

import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.model.Polyline
import io.github.kakaocup.kakao.gmaps.screen.MapScreen
import io.github.kakaocup.kakao.gmaps.view.KDelegateView
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps

class KPolyline<ACTIVITY : FragmentActivity>(
    mapScreen: MapScreen<*, ACTIVITY>,
    override val googleMap: KGoogleMaps,
    matcher: ACTIVITY.() -> Polyline?
) : KDelegateView<ACTIVITY, Polyline, KPolyline<ACTIVITY>>(mapScreen, matcher), PolylineAssertions, PolylineActions
