package com.chinese.flashcards.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.chinese.flashcards.R;

public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        Intent i = getIntent();

        String timerValue = i.getStringExtra(QuizActivity.timerValue);
        TextView timerView = (TextView) findViewById(R.id.timeToFinishView);
        timerView.setText("Time to Finish Deck: " + timerValue);

        String numRight = i.getStringExtra(QuizActivity.numRight);
        TextView numRightView = (TextView) findViewById(R.id.numRightView);
        numRightView.setText("Number Right: " + numRight);

        String numWrong = i.getStringExtra(QuizActivity.numWrong);
        TextView numWrongView = (TextView) findViewById(R.id.NumWrongView);
        numWrongView.setText("Number Wrong: " + numWrong);
    }


    public void onClick(View view)
    {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}


