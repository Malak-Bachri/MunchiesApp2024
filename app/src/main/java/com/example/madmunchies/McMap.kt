package com.example.madmunchies

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class McMap : AppCompatActivity(), OnMapReadyCallback{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_mc_map)

        val mapFragment = supportFragmentManager.findFragmentById(R.id.maps) as? SupportMapFragment
        if (mapFragment != null) {
            mapFragment.getMapAsync(this)
        }
    }


    override fun onMapReady(googleMap: GoogleMap) {

        val addressLatLng = LatLng(33.267234802246094,-93.22499084472656)

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(addressLatLng, 15f))

        googleMap.addMarker(MarkerOptions().position(addressLatLng).title("1127 E Main St, Magnolia, AR 71753, USA"))
    }
}
