package com.example.fastquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fastquiz.R;

public class EndActivity extends AppCompatActivity {

    private Button mBoutonRejouer;
    private Button mBoutonAccueil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        mBoutonRejouer = findViewById(R.id.BoutonRejouer);
        mBoutonAccueil = findViewById(R.id.BoutonAccueil);

        mBoutonRejouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        mBoutonAccueil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameActivityIntent = new Intent(EndActivity.this, MainActivity.class);
                startActivity(gameActivityIntent);
            }
        });
    }
}