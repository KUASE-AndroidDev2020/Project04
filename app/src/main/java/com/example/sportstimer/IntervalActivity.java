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

public class IntervalActivity extends AppCompatActivity{

    TextView accessData8;

    boolean addIntervalName = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval);

        Bundle transferredData3 = getIntent().getExtras();
        if (transferredData3 != null) {
            addIntervalName = transferredData3.getBoolean("addIntervalNameMarker");
            if (addIntervalName == true) {

                //Intervalのmenu名を表示
                accessData8 = (TextView) findViewById(R.id.textView41);
                String s7 = transferredData3.getString("SetIntervalName");
                accessData8.setText(s7);
            }
        }
    }
    public void GiveUpButton(View view){
        Intent toGoQuoteActivity = new Intent(this,QuoteActivity.class);
        startActivity(toGoQuoteActivity);
    }
}
