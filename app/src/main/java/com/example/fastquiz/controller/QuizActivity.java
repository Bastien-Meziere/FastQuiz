package com.example.fastquiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.fastquiz.R;
import com.example.fastquiz.model.Question;

import java.util.Random;

public class QuizActivity extends AppCompatActivity {

    private TextView mTexteScore;
    private TextView mTexteQuestion;
    private ProgressBar mProgressBar;
    private Button mBoutonRep1;
    private Button mBoutonRep2;
    private Button mBoutonRep3;
    private Button mBoutonRep4;
    private int mScore = 0;
    private String mReponse;
    private Question mQuestions = new Question();
    private int mQuestionsLongueur = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        mTexteScore = findViewById(R.id.Score);
        mTexteQuestion = findViewById(R.id.Question);
        mProgressBar = findViewById(R.id.Progression);
        mBoutonRep1 = findViewById(R.id.bouton1);
        mBoutonRep2 = findViewById(R.id.bouton2);
        mBoutonRep3 = findViewById(R.id.bouton3);
        mBoutonRep4 = findViewById(R.id.bouton4);

        mTexteScore.setText("Score : " + mScore);

        updateQuestion(r.nextInt(mQuestionsLongueur));

        //Barre de progression (Timer)
        new CountDownTimer(60000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                int progress = (int) (millisUntilFinished/10000);
                mProgressBar.setProgress(mProgressBar.getMax()-progress);

            }
            @Override
            public void onFinish() {
                Intent myIntent = new Intent(getBaseContext(), EndActivity.class);
                startActivityForResult(myIntent, 0);
            }
        }.start();

        mBoutonRep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBoutonRep1.getText() == mReponse) {
                    mScore++;
                    mTexteScore.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLongueur));
                } else {
                    gameOver();
                }
            }
        });
        mBoutonRep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBoutonRep2.getText() == mReponse) {
                    mScore++;
                    mTexteScore.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLongueur));
                } else {
                    gameOver();
                }
            }
        });
        mBoutonRep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBoutonRep3.getText() == mReponse) {
                    mScore++;
                    mTexteScore.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLongueur));
                } else {
                    gameOver();
                }
            }
        });
        mBoutonRep4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mBoutonRep4.getText() == mReponse) {
                    mScore++;
                    mTexteScore.setText("Score : " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLongueur));
                } else {
                    gameOver();
                }
            }
        });
    }

    //La méthode pour passer à la question suivante
    private void updateQuestion(int num) {
        mTexteQuestion.setText(mQuestions.getQuestion(num));
        mBoutonRep1.setText(mQuestions.getChoix1(num));
        mBoutonRep2.setText(mQuestions.getChoix2(num));
        mBoutonRep3.setText(mQuestions.getChoix3(num));
        mBoutonRep4.setText(mQuestions.getChoix4(num));

        mReponse = mQuestions.getBonneReponse(num);

    }

    //Méthode quand on a faux à une question
    private void gameOver() {

        updateQuestion(r.nextInt(mQuestionsLongueur));
    }
}