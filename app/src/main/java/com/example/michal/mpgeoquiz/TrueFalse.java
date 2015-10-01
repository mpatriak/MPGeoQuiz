package com.example.michal.mpgeoquiz;

/**
 * Created by Michal on 9/27/2015.
 */
public class TrueFalse
{
    private int mQuestion;

    private boolean mTrueQuestion;

    // Constructor
    public TrueFalse(int question, boolean trueQuestion)
    {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestion()
    {
        return mQuestion;
    }

    public void setQuestion(int question)
    {
        mQuestion = question;
    }

    public boolean isTrueQuestion()
    {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion)
    {
        mTrueQuestion = trueQuestion;
    }
} // End class TrueFalse
