package com.murshidiinhajj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.common.SignInButton;

public class LandingActivity extends AppCompatActivity {

    private Button hajj;
    private Button murshid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);

        hajj = (Button) findViewById(R.id.hajjBtn);
        murshid = (Button) findViewById(R.id.murshidBtn);


        hajj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cIntent = new Intent(LandingActivity.this, CampaignViewActivity.class);
                startActivity(cIntent);
            }
        });

        murshid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sIntent = new Intent(LandingActivity.this, MurshidSignInActivity.class);
                startActivity(sIntent);
            }
        });


    }
}
