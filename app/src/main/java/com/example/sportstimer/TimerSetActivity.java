package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TimerSetActivity extends AppCompatActivity {

    EditText userInput1;
    EditText userInput2;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_set);
        userInput1 = (EditText)findViewById(R.id.editText2);
        userInput2 = (EditText)findViewById(R.id.editText3);
    }

    public void AddIntoMenu1Button(View view) {
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite.putExtra("time", userInput1.getText().toString());
        toMyFavorite.putExtra("time", userInput2.getText().toString());
        startActivity(toMyFavorite);
    }

    public void AddIntoMenu2Button(View v){
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite.putExtra("time", userInput1.getText().toString());
        toMyFavorite.putExtra("time", userInput2.getText().toString());
        startActivity(toMyFavorite);
    }

    public void AddIntoMenu3Button(View v){
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite.putExtra("time", userInput1.getText().toString());
        toMyFavorite.putExtra("time", userInput2.getText().toString());
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



