package com.example.monitory;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout4);
        Intent intent = getIntent();
        String text1 = intent.getStringExtra(MainActivity.NAMA);
        TextView textView = findViewById(R.id.layout4_text1);
        textView.setText("Beres! Sekarang " + text1 + " udah bisa ngecek penggunaan HP  " + text1 + "  tiap hari buat bantu " + text1 + " ngatur waktu :)");
    }
}
