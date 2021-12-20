package com.example.uts_1194018_helmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class BerandaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_beranda);
    }

    public void masuk(View view) {
        startActivity(new Intent(BerandaActivity.this,LoginActivity.class));
    }

    public void detail(View view) {
        startActivity(new Intent(BerandaActivity.this,DetailActivity.class));
    }
}