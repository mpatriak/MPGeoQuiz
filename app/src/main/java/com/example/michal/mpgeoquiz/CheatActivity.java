package com.example.michal.mpgeoquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Michal on 9/30/2015.
 */
public class CheatActivity extends AppCompatActivity
{
    public static final String EXTRA_ANSWER_IS_TRUE = "com.example.michal.mpgeoquiz";
    public static final String EXTRA_ANSWER_SHOWN = "com.example.michal.mpgeoquiz";
    private boolean mAnswerIsTrue;

    private TextView mAnswerTextView;
    private Button mShowAnswer;

    // Private method that creates an intent, puts an extra on it, and sets a result.
    private void setAnswerShownResult(boolean isAnswerShown)
    {
        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
        setResult(RESULT_OK, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        // Retrieves the value from the extra and stores it in the member variable.
        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);

        // Wire up the TextView and Button to use the retrieved values.
        mAnswerTextView = (TextView)findViewById(R.id.answerTextView);
        mShowAnswer = (Button)findViewById(R.id.showAnswerButton);

        // Answer will not be shown until the user presses the button.
        setAnswerShownResult(false);

        mShowAnswer.setOnClickListener(new View.OnClickListener()
        {
           @Override
            public void onClick(View v)
           {
               if (mAnswerIsTrue)
               {
                   mAnswerTextView.setText(R.string.true_button);
               } else
               {
                   mAnswerTextView.setText(R.string.false_button);
               }
               setAnswerShownResult(true);
           }
        });
    }
} // End class CheatActivity
