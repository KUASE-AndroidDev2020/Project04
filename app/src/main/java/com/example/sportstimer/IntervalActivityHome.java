package com.example.sportstimer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class IntervalActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval_home);
    }

    public void IntervalHomeBackHomeButton(View view) {
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);
    }

    public void IntervalHomeSaveButton(View view) {
        Intent toInterval = new Intent(this,IntervalActivity.class);
        startActivity(toInterval);
    }
}
