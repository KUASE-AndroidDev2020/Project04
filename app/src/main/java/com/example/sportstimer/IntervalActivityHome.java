package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntervalActivityHome extends AppCompatActivity {

    EditText userInput1;
    EditText userInput2;
    EditText userInput3;
    Boolean addInterval = true;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval_home);
        userInput1 = (EditText)findViewById(R.id.editText);
        //userInput2 = (EditText)findViewById(R.id.editText);
        //userInput3 = (EditText)findViewById(R.id.editText);
    }

    public void IntervalHomeDoItbutton(View view) {
        Intent toInterSet = new Intent(this,IntervalActivity.class);
        startActivity(toInterSet);
    }

    public void IntervalHomeBackHomeButton(View view) {
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);
    }

    public void IntervalHomeSaveButton(View view){
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite.putExtra("SetInterval",userInput1.getText().toString());
        toMyFavorite.putExtra("addIntervalMarker", addInterval);
        startActivity(toMyFavorite);
    }
}
