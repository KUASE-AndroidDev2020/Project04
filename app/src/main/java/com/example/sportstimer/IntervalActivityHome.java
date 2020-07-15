package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntervalActivityHome extends AppCompatActivity {

    Boolean addInterval = true;
    Boolean addIntervalName = true;
    EditText userInput1;
    EditText userInput2;
    EditText userInput3;
    EditText userInput4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interval_home);
        userInput1 = (EditText)findViewById(R.id.editText);
        userInput2 = (EditText)findViewById(R.id.editText);
        userInput3 = (EditText)findViewById(R.id.editText);
        userInput4 = (EditText)findViewById(R.id.editText);

    }

    public void IntervalHomeDoItbutton(View view) {
        Intent toInterSet = new Intent(this,IntervalActivity.class);
        toInterSet.putExtra("SetIntervalName",userInput4.getText().toString());
        toInterSet.putExtra("addIntervalNameMarker",addIntervalName);
        startActivity(toInterSet);
    }

    public void IntervalHomeBackHomeButton(View view) {
        Intent toBackHome = new Intent(this,MainActivity.class);
        startActivity(toBackHome);
    }

    public void IntervalHomeSaveButton1(View view){
        Intent toMyFavorite = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite.putExtra("SetInterval1",userInput1.getText().toString());
        toMyFavorite.putExtra("addIntervalMarker2",addInterval);
        startActivity(toMyFavorite);
    }

    public void IntervalHomeSaveButton2(View v){
        Intent toMyFavorite2 = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite2.putExtra("SetInterval2",userInput2.getText().toString());
        toMyFavorite2.putExtra("addIntervalMarker2",addInterval);
        startActivity(toMyFavorite2);
    }

    public void IntervalHomeSaveButton3(View v){
        Intent toMyFavorite3 = new Intent(this,MyFavoriteActivity.class);
        toMyFavorite3.putExtra("SetInterval3",userInput3.getText().toString());
        toMyFavorite3.putExtra("addIntervalMarker2",addInterval);
        startActivity(toMyFavorite3);
    }
}
