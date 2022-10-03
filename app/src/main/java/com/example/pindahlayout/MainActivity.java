package com.example.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button Btnpindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btnpindah=findViewById(R.id.btn_pindah);
        Btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah= new Intent(MainActivity.this, secondActivity.class);
                startActivity(pindah);
                Intent p= new Intent(MainActivity.this,secondActivity.class);
                startActivity(p);
            }
            
        });
    }
}