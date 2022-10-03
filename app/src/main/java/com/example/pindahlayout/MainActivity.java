package com.example.pindahlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button Btnpindah;
    EditText etnama;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("sebelum pindah");

        Btnpindah=findViewById(R.id.btn_pindah);
        etnama nama=findViewById(R.id.et_nama);
        Btnpindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                
                Intent p= new Intent(MainActivity.this,secondActivity.class);
                startActivity(p);
            }

        });
    }
}