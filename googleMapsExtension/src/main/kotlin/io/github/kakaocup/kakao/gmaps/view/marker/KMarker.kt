package io.github.kakaocup.kakao.gmaps.view.marker

import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.model.Marker
import io.github.kakaocup.kakao.gmaps.screen.MapScreen
import io.github.kakaocup.kakao.gmaps.view.KDelegateView
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps

class KMarker<ACTIVITY : FragmentActivity>(
    mapScreen: MapScreen<*, ACTIVITY>,
    override val googleMap: KGoogleMaps,
    matcher: ACTIVITY.() -> Marker?
) : KDelegateView<ACTIVITY, Marker>(mapScreen, matcher), MarkerAssertions, MarkerActions
