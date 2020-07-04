package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TimerSetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_set);
    }

    public void AddIntoMenu1Button(View view){
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        startActivity(toMyFavorite);

    }

    public void AddIntoMenu2Button(View v){
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        startActivity(toMyFavorite);
    }

    public void AddIntoMenu3Button(View v){
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        startActivity(toMyFavorite);
    }

    public void SetTimerBackHomeButton(View view){
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);
    }

    public void imageView3(View v){
        String s =((EditText)findViewById(R.id.editText2)).getText().toString();
        ((TextView)findViewById(R.id.textView9)).setText(s + "min");
    }

    public void imageView4(View v){
        String s =((EditText)findViewById(R.id.editText3)).getText().toString();
        ((TextView)findViewById(R.id.textView12)).setText(s);
    }
}
