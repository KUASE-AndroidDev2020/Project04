package com.example.sportstimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Easteregg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easteregg);
    }


    public void TrueButton(View view) {
        Intent toBackMain = new Intent(this,MainActivity.class);
        startActivity(toBackMain);
    }

    public void HURRYHURRY(View view) {
        Intent toLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kuas.ac.jp/academics/faculty/engineering/Department-of-Mechanical-and-Electrical-System-Engineering"));
        startActivity(toLink);
    }

    public void ProfessorMagic(View view) {
        Intent toMagic = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?time_continue=2&v=53REWvxVHow&feature=emb_logo"));
        startActivity(toMagic);
    }

    public void ProfessorMagic2(View view) {
        Intent toMagic2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XMHC8qaSbZw&feature=emb_logo"));
        startActivity(toMagic2);
    }
}
