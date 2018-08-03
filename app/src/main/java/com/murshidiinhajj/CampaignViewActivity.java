package com.murshidiinhajj;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class CampaignViewActivity extends AppCompatActivity {

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_main_points:
                    Intent mpIntent = new Intent(CampaignViewActivity.this, MainPointsMapActivity.class);
                    startActivity(mpIntent);

                case R.id.navigation_track_guide:

                    return true;
            }
            return false;
        }
    };

    private Toolbar campToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campaign_view);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        campToolbar = (Toolbar) findViewById(R.id.campTB);
        setSupportActionBar(campToolbar);
        setTitle("مرشدي في الحج");
    }
}
