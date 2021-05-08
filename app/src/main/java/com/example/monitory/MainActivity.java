package com.example.monitory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String NAMA = "com.example.monitory.nama";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Typeface tf = ResourcesCompat.getFont(
                this,
                R.font.nunito_bold);
        TextView t1 = findViewById(R.id.layout1_text1);
        TextView t2 = findViewById(R.id.layout1_text2);
        t1.setTypeface(tf);
        t2.setTypeface(tf);


    }

    public void layout1(View view){
        setContentView(R.layout.activity_layout2);
    }


    public void layout2(View view){
        setContentView(R.layout.activity_layout3);

    }


    public void layout3(View view){
        Intent intent = new Intent(this, FinalActivity.class);
        EditText et = (EditText) findViewById(R.id.layout3_text2);
        String nama = et.getText().toString();
        intent.putExtra(NAMA, nama);
        startActivity(intent);
    }
}