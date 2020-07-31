package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView timerButton = findViewById(R.id.timerButton);
        timerButton.setOnClickListener(this);

        TextView intervalButton = findViewById(R.id.intervalButton);
        intervalButton.setOnClickListener(this);

        TextView stopwatchButton = findViewById(R.id.stopwatchButton);
        stopwatchButton.setOnClickListener(this);

        TextView MyFavoriteButton = findViewById(R.id.MyFavoriteButton);
        MyFavoriteButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch(v.getId()) {
        case R.id.timerButton:
            Intent toTimer = new Intent(this, TimerActivity.class);
            startActivity(toTimer);
            break;

        case R.id.intervalButton:
            Intent toInterval = new Intent(this, IntervalActivityHome.class);
            startActivity(toInterval);
            break;

        case R.id.stopwatchButton:
            Intent toStopW = new Intent(this, StopWatchActivity.class);
            startActivity(toStopW);
            break;

        case R.id.MyFavoriteButton:
            Intent toMyFavorite = new Intent(this, MyFavoriteActivity.class);
            startActivity(toMyFavorite);
            break;
        }
    }
}
