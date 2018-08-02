package com.murshidiinhajj;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainPointsMapActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_points_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Mina and move the camera
        LatLng Mina = new LatLng(21.4080, 39.8893);
        mMap.addMarker(new MarkerOptions().position(Mina).title("المؤشر على منى، مكة المكرمة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Mina));


        LatLng Muzdalifah = new LatLng(21.3925,  39.937778);
        mMap.addMarker(new MarkerOptions().position(Muzdalifah).title("المؤشر على مزدلفة، مكة المكرمة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Muzdalifah));


        LatLng Arafat = new LatLng(21.354741, 39.984049);
        mMap.addMarker(new MarkerOptions().position(Arafat).title("المؤشر على عرفات، مكة المكرمة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Arafat));
    }
}
