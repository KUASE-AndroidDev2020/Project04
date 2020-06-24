package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView timerButton = findViewById(R.id.timerButton); // class 2
        timerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch(v.getId()){
        case R.id.timerButton:
            //data here
            break;
        }
    }
}
