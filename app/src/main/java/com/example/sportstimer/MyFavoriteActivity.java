package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyFavoriteActivity extends AppCompatActivity {

    TextView accessData1;// menu1の時間表示
    TextView accessData2;// menu1のActivity表示
    TextView accessData3;// menu2の時間表示
    TextView accessData4;// menu2のActivity表示
    TextView accessData5;// menu3の時間表示
    TextView accessData6;// menu3のActivity表示
    TextView accessData7;
    TextView accessData8;
    TextView accessData9;

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

                // menu1の時間表示
                accessData1 = (TextView) findViewById(R.id.textView22);
                // Bundle transferredData1 = getIntent().getExtras();
                String s1 = transferredData.getString("time1");
                accessData1.setText(s1);

                // menu1のActivity表示
                accessData2 = (TextView) findViewById(R.id.textView27);
                // Bundle transferredData2 = getIntent().getExtras();
                String s2 = transferredData.getString("activity1");
                accessData2.setText(s2);

                // menu2の時間表示
                accessData3 = (TextView) findViewById(R.id.textView19);
                // Bundle transferredData3 = getIntent().getExtras();
                String s3 = transferredData.getString("time2");
                accessData3.setText(s3);

                // menu2のActivity表示
                accessData4 = (TextView) findViewById(R.id.textView24);
                // Bundle transferredData4 = getIntent().getExtras();
                String s4 = transferredData.getString("activity2");
                accessData4.setText(s4);

                // menu3の時間表示
                accessData5 = (TextView) findViewById(R.id.textView21);
                // Bundle transferredData5 = getIntent().getExtras();
                String s5 = transferredData.getString("time3");
                accessData5.setText(s5);

                // menu3のActivity表示
                accessData6 = (TextView) findViewById(R.id.textView20);
                // Bundle transferredData6 = getIntent().getExtras();
                String s6 = transferredData.getString("activity3");
                accessData6.setText(s6);

            }
        }

        Bundle transferredData2 = getIntent().getExtras();
        if (transferredData2 != null) {
            addInterval = transferredData2.getBoolean("addIntervalMarker2");
            if (addInterval == true) {
                //Intervalのmenu1表示
                accessData7 = (TextView) findViewById(R.id.textView46);
                String s7 = transferredData.getString("SetInterval1");
                accessData7.setText(s7);

                //Intervalのmenu2表示
                accessData8 = (TextView) findViewById(R.id.textView45);
                String s8 = transferredData.getString("SetInterval2");
                accessData8.setText(s8);

                //Intervalのmenu3表示
                accessData9 = (TextView) findViewById(R.id.textView37);
                String s9 = transferredData.getString("SetInterval3");
                accessData9.setText(s9);
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
/*
// 保存チャレンジ
    }
    public class SaveActivity extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_my_favorite);

            Button saveButton = (Button) findViewById(R.id.MyFavoriteSaveButton);
            saveButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    saveButtonClick();
                }
            });

            Button loadButton = (Button) findViewById(R.id.LoadButton);
            loadButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    loadButtonClick();
                }
            });
        }
    }

    private void saveButtonClick() {
        // 保存
        EditText editText = (EditText) findViewById(R.id.Test);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        sp.edit().putString("SaveString", editText.getText().toString()).commit();

    }
    private void loadButtonClick() {
        // 読み込み
        EditText editText = (EditText) findViewById(R.id.Test);
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(this);
        editText.setText(sp.getString("SaveString", null), TextView.BufferType.NORMAL);
    }
 */
}


