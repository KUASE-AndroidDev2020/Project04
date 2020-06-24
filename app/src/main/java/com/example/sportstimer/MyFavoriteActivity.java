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

}
