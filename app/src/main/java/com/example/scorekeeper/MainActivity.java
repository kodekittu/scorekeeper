package com.example.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int x=0;
    int y=0;

    private void b1(View view) {
        y = y + 3;
        display2(y);
    }
    private void a1(View view) {
        x = x + 3;
        display1(x);
    }
    private void b2(View view) {
        y = y + 2;
        display2(y);
    }
    private void a2(View view) {
        x = x + 2;
        display1(x);
    }
    private void b3(View view) {
        y = y + 1;
        display2(y);
    }
    private void a3(View view) {
        x = x + 1;
        display1(x);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display1(int n1) {
        TextView S1 = (TextView) findViewById(
                R.id.s1);
       S1.setText("" + n1);
    }
    private void display2(int n2) {
        TextView S2 = (TextView) findViewById(
                R.id.s2);
        S2.setText("" + n2);
    }
    private void reset(View view) {
        x = 0;
        y = 0;
        display1(x);
        display2(y);
    }
}
