package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class IntervalActivity extends AppCompatActivity {

    TextView accessData8;
    TextView accessData9;
    TextView accessData10;
    TextView accessData11;
    TextView accessData12;

    boolean addIntervalName = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval);

        Bundle transferredData3 = getIntent().getExtras();
        if (transferredData3 != null) {
            addIntervalName = transferredData3.getBoolean("addIntervalNameMarker");
            if (addIntervalName == true) {

                //IntervalのPrepareを表示
                accessData11 = (TextView) findViewById(R.id.textView43);
                String s10 = transferredData3.getString("SetPrepare");
                accessData11.setText(s10);

                //Intervalのmenu名を表示
                accessData8 = (TextView) findViewById(R.id.textView41);
                String s7 = transferredData3.getString("SetIntervalName");
                accessData8.setText(s7);

                //IntervalのWorkOutを表示
                accessData9 = (TextView) findViewById(R.id.Clock);
                String s8 = transferredData3.getString("SetWorkOut");
                accessData9.setText(s8);

                //IntervalのRestを表示
                accessData10 = (TextView) findViewById(R.id.PastTexFutureView);
                String s9 = transferredData3.getString("SetRest");
                accessData10.setText(s9);

                //IntervalのLoopを表示
                accessData12 = (TextView) findViewById(R.id.textView39);
                String s11 = transferredData3.getString("SetLoop");
                accessData12.setText(s11);

                }
            }
        }

        public void GiveUpButton (View view){
        Intent toGoQuoteActivity = new Intent(this, QuoteActivity.class);
        startActivity(toGoQuoteActivity);
    }
}
