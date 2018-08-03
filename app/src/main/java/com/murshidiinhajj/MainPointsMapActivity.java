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
        LatLng shamsTaiba = new LatLng(21.3948381, 39.90462279999997);
        mMap.addMarker(new MarkerOptions().position(shamsTaiba).title("مخيم حملة شمس طيبة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(shamsTaiba));


        LatLng AlHuaizi = new LatLng(21.387365,  39.897681000000034);
        mMap.addMarker(new MarkerOptions().position(AlHuaizi).title("مخيم حملة الحويزي للحج - مزدلفة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AlHuaizi));


        LatLng mashaelAlnoor = new LatLng(21.3882133, 39.90482750000001);
        mMap.addMarker(new MarkerOptions().position(mashaelAlnoor).title("مخيم مشاعل النور - مزدلفة"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(mashaelAlnoor));


        LatLng Tawaef = new LatLng(21.4146051, 39.894563999999946);
        mMap.addMarker(new MarkerOptions().position(Tawaef).title("مخيم شركة طوائف - منى"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Tawaef));


        LatLng AhmedArab = new LatLng(21.3974531, 39.90205070000002);
        mMap.addMarker(new MarkerOptions().position(AhmedArab).title("حملة أحمد عرب لخدمة حجاج الداخل"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(AhmedArab));


        LatLng YaseenAlbar = new LatLng(21.4031276, 39.894868599999995);
        mMap.addMarker(new MarkerOptions().position(YaseenAlbar).title("مخيم حملة ياسين البار"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(YaseenAlbar));



    }
}
