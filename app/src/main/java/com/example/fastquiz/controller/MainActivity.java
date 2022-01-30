package com.example.fastquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.fastquiz.R;

public class MainActivity extends AppCompatActivity {

    private TextView mTexteLogo;
    private Button mBoutonJouer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTexteLogo = findViewById(R.id.TitreAccueil);
        mBoutonJouer = findViewById(R.id.BoutonJouer);

        mBoutonJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gameActivityIntent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(gameActivityIntent);
            }
        });
    }
}