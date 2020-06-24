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

        TextView timerButton = findViewById(R.id.timerButton); // class 2
        timerButton.setOnClickListener(this);

        TextView intervalButton = findViewById(R.id.intervalButton);
        intervalButton.setOnClickListener(this);

        TextView stopwatchButton = findViewById(R.id.stopwatchButton);
        stopwatchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch(v.getId()) {
        case R.id.timerButton:
            Intent toTimer = new Intent(this, TimerActivity.class);
            startActivity(toTimer);//data here
            break;

        case R.id.intervalButton:
            Intent toInterval = new Intent(this, IntervalActivity.class);
            startActivity(toInterval);
            break;

        case R.id.stopwatchButton:
            Intent toStopW = new Intent(this, StopWatchActivity.class);
            startActivity(toStopW);
            break;
    }
    }
}
