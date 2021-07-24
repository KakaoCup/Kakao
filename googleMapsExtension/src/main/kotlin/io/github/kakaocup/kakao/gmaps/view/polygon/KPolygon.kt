package io.github.kakaocup.kakao.gmaps.view.polygon

import androidx.fragment.app.FragmentActivity
import com.google.android.gms.maps.model.Polygon
import io.github.kakaocup.kakao.gmaps.screen.MapScreen
import io.github.kakaocup.kakao.gmaps.view.KDelegateView
import io.github.kakaocup.kakao.gmaps.view.gmap.KGoogleMaps

class KPolygon<ACTIVITY : FragmentActivity>(
    mapScreen: MapScreen<*, ACTIVITY>,
    override val googleMap: KGoogleMaps,
    matcher: ACTIVITY.() -> Polygon?
) : KDelegateView<ACTIVITY, Polygon, KPolygon<ACTIVITY>>(mapScreen, matcher), PolygonAssertions, PolygonActions
