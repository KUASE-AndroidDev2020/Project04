package com.example.sportstimer;

//AndroidX
import androidx.appcompat.app.AppCompatActivity;
//import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;



public class StopWatchActivity extends AppCompatActivity {

    private final Handler handler = new Handler();

    //private long startTime;
    //private long elapsedTime = 0l;

    // The following four variables are used to calculate lap
    private long elapsedTotal;
    private long lapPointPrevious;
    private long lapPointNow;
    private long lapDiff;
    private long count, period;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            count ++;

            timerText.setText(dataFormat.
                    format(count*period));
            handler.postDelayed(this, period);

            // We need to use total elapsed time to calculate lap
            elapsedTotal = count*period;

        }
    };
    private TextView timerLabel;

    private TextView timerText;
    private SimpleDateFormat dataFormat =
            new SimpleDateFormat("mm:ss.S", Locale.JAPAN);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);


        count = 0;
        period = 100;


        timerText = findViewById(R.id.Timer);
        timerText.setText(dataFormat.format(0));

        final Button startButton = findViewById(R.id.StopWatchStartButton);
        final Button lapButton = findViewById(R.id.LapButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.post(runnable);
                startButton.setEnabled(false);
                lapButton.setEnabled(true);
            }
        });

        //タイマーストップ
        Button stopButton = findViewById(R.id.StopWatchStopButton);
        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runnable);
                startButton.setEnabled(true);
                lapButton.setEnabled(false);


            }
        });

        //タイマーラップ

        //final Button lapButton = findViewById(R.id.LapButton);
        timerLabel = findViewById(R.id.Timerlabel);
        lapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // We want to show the exact time when the user click the lap button
                // so just crab the text from timerText :p
                timerLabel.setText(timerText.getText());
                // If We want to show the exact timing when the user click the lap button
                // just crab the text from timerText :p
                // timerLabel.setText(timerText.getText());

                // If we want to show the elapsed time in one lap, this is how we do it
                lapPointNow = elapsedTotal;
                // 二回目に00から引くことになる？
                lapDiff = lapPointNow - lapPointPrevious;
                timerLabel.setText(dataFormat.
                        format(lapDiff));
                lapPointPrevious = lapPointNow;

                //ラップ記録
                //lapmemory = lapDiff;
                //for (int i = 1; i < lapmemory; i++);
            }
        });


        // タイマーリセット
        Button resetButton = findViewById(R.id.StopWatchResetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handler.removeCallbacks(runnable);
                count = 0;
                timerText.setText(dataFormat.format(0));
                timerLabel.setText("");
                lapPointPrevious = 0l;
                startButton.setEnabled(true);
                lapButton.setEnabled(false);

            }
        });
    }




    public void StopWatchBackHome(View view){
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);
    }

    public void EasterEgg(View view) {
        Intent toEasteregg = new Intent(this,Easteregg.class);
        startActivity(toEasteregg);
    }
}