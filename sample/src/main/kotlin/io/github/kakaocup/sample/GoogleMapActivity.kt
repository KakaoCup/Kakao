package io.github.kakaocup.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.GoogleMapOptions
import com.google.android.gms.maps.SupportMapFragment

class GoogleMapActivity : AppCompatActivity() {

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
            .commit()
    }
}
