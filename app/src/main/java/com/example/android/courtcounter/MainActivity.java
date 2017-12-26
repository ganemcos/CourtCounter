package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score1=0;
    int score2=0;
    TextView score2textA;
    TextView score2textB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score2textA =  (TextView)findViewById(R.id.score1);
        score2textB =  (TextView)findViewById(R.id.score2);

    }
    public void add3(View view)
    {
        score1=score1+3;
        display1(Integer.toString(score1));
    }
    public void add2(View view)
    {
        score1=score1+2;
        display1(Integer.toString(score1));

    }
    public void add(View view)
    {
        score1=score1+1;
        display1(Integer.toString(score1));

    }
    private void display1(String text)
    {
        score2textA.setText(text);
    }
    public void badd3(View view)
    {
        score2=score2+3;
        display2(Integer.toString(score2));
    }
    public void badd2(View view)
    {
        score2=score2+2;
        display2(Integer.toString(score2));

    }
    public void badd(View view)
    {
        score2=score2+1;
        display2(Integer.toString(score2));

    }
    private void display2(String text)
    {
        score2textB.setText(text);
    }
    public void reset(View view)
    {
        score2=0;
        score1=0;
        score2textA.setText("0");
        score2textB.setText("0");
    }


}
