package io.github.kakaocup.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMapOptions
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.Circle
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.Polygon
import com.google.android.gms.maps.model.PolygonOptions
import com.google.android.gms.maps.model.Polyline
import com.google.android.gms.maps.model.PolylineOptions

@SuppressWarnings("MagicNumber")
class GoogleMapActivity : AppCompatActivity() {
    val markerArray: ArrayList<Marker> = arrayListOf()

    lateinit var polyline: Polyline
    lateinit var polygon: Polygon
    lateinit var circle: Circle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.google_maps)
        supportFragmentManager
            .beginTransaction()
            .add(
                R.id.mapFragment, SupportMapFragment.newInstance(
                    GoogleMapOptions().apply {
                        zoomControlsEnabled(true)
                        compassEnabled(true)
                        mapToolbarEnabled(true)
                        ambientEnabled(true)
                    }
                )
            )
            .commitNow()

        (supportFragmentManager.findFragmentById(R.id.mapFragment) as SupportMapFragment)
            .getMapAsync { map ->
                map.addMarker(
                    MarkerOptions()
                        .position(LatLng(-33.914172, 151.265490))
                        .title("Cozy Place")
                )
                    ?.apply { tag = "MyMarker" }
                    ?.also(markerArray::add)

                polyline = map.addPolyline(PolylineOptions().apply {
                    add(
                        LatLng(-33.2434075, 151.4914183),
                        LatLng(-33.3848277, 151.4537028)
                    )
                })

                polygon = map.addPolygon(PolygonOptions().apply {
                    add(
                        LatLng(-33.2434075, 151.4914183),
                        LatLng(-33.283714, 151.5485138),
                        LatLng(-33.3848277, 151.4537028),
                        LatLng(-33.3407765, 151.3943683)
                    )
                })

                circle = map.addCircle(CircleOptions().apply {
                    center(LatLng(55.6754742, 37.4663873))
                    radius(50.0)
                })
            }
    }
}
