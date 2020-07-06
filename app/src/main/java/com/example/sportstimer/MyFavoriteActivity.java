package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MyFavoriteActivity extends AppCompatActivity {

    TextView accessData;

    @Override
    protected void onCreate(Bundle savedTimerSet) {
        super.onCreate(savedTimerSet);
        setContentView(R.layout.activity_my_favorite);

        //menu1の時間表示
        accessData = (TextView)findViewById(R.id.textView22);
        Bundle transferredData1 = getIntent().getExtras();
        String s1 = transferredData1.getString("time1");
        String txt1 = s1 + "min";
        accessData.setText(txt1);

        //menu2の時間表示
        accessData = (TextView)findViewById(R.id.textView19);
        Bundle transferredData2 = getIntent().getExtras();
        String s2 = transferredData2.getString("time2");
        String txt2 = s2 + "min";
        accessData.setText(txt2);

        //menu3の時間表示
        accessData = (TextView)findViewById(R.id.textView21);
        Bundle transferredData3 = getIntent().getExtras();
        String s3 = transferredData3.getString("time3");
        String txt3 = s3 + "min";
        accessData.setText(txt3);

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

