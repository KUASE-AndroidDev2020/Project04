package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyFavoriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_favorite);
    }

    public void MyFavoriteListBackHomeButton(View view){
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);
    }

    public void SetTimerAddButton(View view){
        Intent toSetTimer = new Intent(this,TimerSetActivity.class);
        startActivity(toSetTimer);
    }

    public void MyFavoriteListIntervalAddButton(View view) {
        Intent toFavoriteHome = new Intent(this,IntervalActivityHome.class);
        startActivity(toFavoriteHome);
    }
}
