package com.example.sportstimer;

//AndroidX
import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

/*import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;*/



public class StopWatchActivity extends AppCompatActivity {

    private Handler handler = new Handler();

    private long startTime = -1;
    private long elapsedTime = 0l;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            count ++;
            timerText.setText(dataFormat.
                    format(count*period));
            handler.postDelayed(this, period);
        }
    };
    private TextView timerLabel;
    private ListView listView;

    private TextView timerText;
    private SimpleDateFormat dataFormat =
            new SimpleDateFormat("mm:ss.S", Locale.US);


    private int count, period;
    long t=0l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);

        count = 0;
        period = 100;

        timerText = findViewById(R.id.Timer);
        timerText.setText(dataFormat.format(0));

        Button startButton = findViewById(R.id.StopWatchStartButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.post(runnable);
            }
        });

        //タイマーストップ
        Button stopButton = findViewById(R.id.StopWatchStopButton);
        stopButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                elapsedTime += SystemClock.elapsedRealtime() - startTime;
                handler.removeCallbacks(runnable);



            }
        } );

        //タイマーラップ
        startTime = System.currentTimeMillis();

        Button lapButton = findViewById(R.id.LapButton);
        timerLabel = findViewById(R.id.Timerlabel);
        lapButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){

               t = SystemClock.elapsedRealtime() - startTime + elapsedTime; // ミリ秒
                timerLabel.setText(dataFormat.format(t));
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 5);



       handler.postDelayed(runnable, 5);

            }

        });

        // タイマーリセット
        Button resetButton = findViewById(R.id.StopWatchResetButton);
        resetButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runnable);
                timerText.setText(dataFormat.format(0));
                timerLabel.setText(dataFormat.format(0));
                count = 0;
                if(startTime == -1) {
                    startTime = System.currentTimeMillis();
                }

            }
        });
    }

    public void StopWatchBackHome(View view){
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);
    }
}