package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyFavoriteActivity extends AppCompatActivity {

    TextView accessData1;
    TextView accessData2;
    TextView accessData3;
    TextView accessData4;
    TextView accessData5;
    TextView accessData6;

    // These boolean markers are used to indicate what actions need to be executed in onCreate()
    // set default values to "false"
    boolean addTimer = false;
    boolean addInterval = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_favorite);

        Bundle transferredData = getIntent().getExtras();
        // Execute the following lines only if there's data extracted from Intent
        if (transferredData != null) {
            // Get the value of the addTimer marker
            addTimer = transferredData.getBoolean("addTimerMarker");

            // if the marker is set to "true", that means new timer is added in TimerSetActivity.java
            // only extract timer data when addTimer marker is true
            // otherwise you'll get an error because you are trying to get data from null
            if (addTimer == true) {

                //menu1の時間表示
                accessData1 = (TextView) findViewById(R.id.textView22);
                // Bundle transferredData1 = getIntent().getExtras();
                String s1 = transferredData.getString("time1");
                accessData1.setText(s1);

                //menu1のActivity表示
                accessData2 = (TextView) findViewById(R.id.textView27);
                // Bundle transferredData2 = getIntent().getExtras();
                String s2 = transferredData.getString("activity1");
                accessData2.setText(s2);

                //menu2の時間表示
                accessData3 = (TextView) findViewById(R.id.textView19);
                // Bundle transferredData3 = getIntent().getExtras();
                String s3 = transferredData.getString("time2");
                accessData3.setText(s3);

                //menu2のActivity表示
                accessData4 = (TextView) findViewById(R.id.textView24);
                // Bundle transferredData4 = getIntent().getExtras();
                String s4 = transferredData.getString("activity2");
                accessData4.setText(s4);

                //menu3の時間表示
                accessData5 = (TextView) findViewById(R.id.textView21);
                // Bundle transferredData5 = getIntent().getExtras();
                String s5 = transferredData.getString("time3");
                accessData5.setText(s5);

                //menu3のActivity表示
                accessData6 = (TextView) findViewById(R.id.textView20);
                // Bundle transferredData6 = getIntent().getExtras();
                String s6 = transferredData.getString("activity3");
                accessData6.setText(s6);
            }
        }

    }




    public void MyFavoriteListBackHomeButton(View view) {
        Intent toBackHome = new Intent(this, MainActivity.class);
        startActivity(toBackHome);
    }

    public void imageView6(View view) {
        Intent toSetTimer = new Intent(this, TimerSetActivity.class);
        startActivity(toSetTimer);
    }

    public void imageView5(View view) {
        Intent toFavoriteHome = new Intent(this, IntervalActivityHome.class);
        startActivity(toFavoriteHome);
    }
}

