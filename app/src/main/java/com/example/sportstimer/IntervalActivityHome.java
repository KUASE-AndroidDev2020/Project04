package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IntervalActivityHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval_home);
    }

    public void Addbutton(View view) {
        Intent toInterSet = new Intent(this,IntervalActivity.class);
        startActivity(toInterSet);
    }
}
