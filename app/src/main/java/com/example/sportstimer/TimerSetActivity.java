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
    EditText userInput3;
    EditText userInput4;
    EditText userInput5;
    EditText userInput6;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer_set);
        userInput1 = (EditText)findViewById(R.id.editText2);
        userInput2 = (EditText)findViewById(R.id.editText3);
        userInput3 = (EditText)findViewById(R.id.editText2);
        userInput4 = (EditText)findViewById(R.id.editText3);
        userInput5 = (EditText)findViewById(R.id.editText2);
        userInput6 = (EditText)findViewById(R.id.editText3);
    }

    public void AddIntoMenu1Button(View v) {
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite.putExtra("time1", userInput1.getText().toString());
        toMyFavorite.putExtra("activity1", userInput2.getText().toString());
        startActivity(toMyFavorite);
    }

    public void AddIntoMenu2Button(View v){
        Intent toMyFavorite1 = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite1.putExtra("time2", userInput3.getText().toString());
        toMyFavorite1.putExtra("activity2", userInput4.getText().toString());
        startActivity(toMyFavorite1);
    }

    public void AddIntoMenu3Button(View v) {
        Intent toMyFavorite2 = new Intent(this, MyFavoriteActivity.class);
        toMyFavorite2.putExtra("time3", userInput5.getText().toString());
        toMyFavorite2.putExtra("activity3", userInput6.getText().toString());
        startActivity(toMyFavorite2);


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
