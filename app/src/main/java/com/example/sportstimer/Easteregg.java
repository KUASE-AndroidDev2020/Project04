package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Easteregg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easteregg);
    }

    public void HURRYHURRY(View view) {
        Intent toBackMain = new Intent(this,MainActivity.class);
        startActivity(toBackMain);
    }
}
