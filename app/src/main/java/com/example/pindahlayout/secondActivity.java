package com.example.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

TextView tvnama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportActionBar().setTitle("sesudah pindah");

tvnama = findViewById(R.id.tv_nama);

Intent terima = getIntent();
String ynama = terima.getStringExtra("xnama");
tvnama.setText(ynama);


    }
}