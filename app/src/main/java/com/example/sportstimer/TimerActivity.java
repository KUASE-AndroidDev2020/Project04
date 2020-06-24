package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
    }
    public void TimerBackHome(View view){
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);

    }
}
