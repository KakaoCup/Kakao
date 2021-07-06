package io.github.kakaocup.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMapOptions
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions

@SuppressWarnings("MagicNumber")
class GoogleMapActivity : AppCompatActivity() {
    val markerArray: ArrayList<Marker> = arrayListOf()

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
            }
    }
}
