package com.example.ShonNumberGame;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Button1;
    private Button Button2;
    private Button Button3;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView tv5;
    private TextView tv6;
    private TextView Answer1;
    private TextView Answer2;
    private TextView Answer3;
    private ImageView c1;
    private ImageView c2;
    private ImageView c3;
    private ImageView Wrong1;
    private ImageView Wrong2;
    private ImageView Wrong3;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    private int ranint1;
    private int ranint2;
    private int ranint3;
    private int ranint4;
    private int ranint5;
    private int ranint6;
    private double correct = 0;
    private double score;
    private double sum = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.Button1);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);
        tv6 = findViewById(R.id.tv6);
        Answer1 = findViewById(R.id.Answer1);
        Answer2 = findViewById(R.id.Answer2);
        Answer3 = findViewById(R.id.Answer3);
        c1 = findViewById(R.id.correct1);
        c2 = findViewById(R.id.Correct2);
        c3 = findViewById(R.id.Correct3);
        Wrong1 = findViewById(R.id.Wrong1);
        Wrong2 = findViewById(R.id.Wrong2);
        Wrong3 = findViewById(R.id.Wrong3);
        ranint1 = get_rand();
        ranint4 = get_rand();
        ranint5 = get_rand();
        tv1.setText("" + ranint1);
        tv4.setText("" + ranint4);
        ranint6 = get_rand();
        tv2.setText("num");
        tv3.setText("num");
        tv5.setText("num");
        tv6.setText("num");
    }

    public static int get_rand() {
        Random rand = new Random();
        return (int)Math.floor(Math.random() * (89) + 10);
    }

    public void b1(View view) {
        input1 = findViewById(R.id.Edit1);
        String inst1 = input1.getText().toString();
        if (Integer.parseInt(inst1) == (ranint1+ranint4)) {
            c1.setVisibility(View.VISIBLE);
            Wrong1.setVisibility(View.INVISIBLE);
            correct++;
        } else {
            c1.setVisibility(View.INVISIBLE);
            Wrong1.setVisibility(View.VISIBLE);
        }
        sum++;
        ranint2 = (ranint1+ranint4);
        tv5.setText("" + ranint5);
        tv2.setText("" + ranint2);
    }

    public void b2(View view) {
        input2 = findViewById(R.id.Edit2);
        String inst2 = input2.getText().toString();
        if (Integer.parseInt(inst2) == (ranint2 + ranint5)) {
            c2.setVisibility(View.VISIBLE);
            Wrong2.setVisibility(View.INVISIBLE);
            correct++;
        } else {
            c2.setVisibility(View.INVISIBLE);
            Wrong2.setVisibility(View.VISIBLE);
        }
        sum++;
        ranint3 = (ranint2+ranint5);
        tv6.setText("" + ranint6);
        tv3.setText("" + ranint3);
    }

    public void b3(View view) {
        input3 = findViewById(R.id.Edit3);
        String inst3 = input3.getText().toString();
        if (Integer.parseInt(inst3) == (ranint3 + ranint6)) {
            c3.setVisibility(View.VISIBLE);
            Wrong3.setVisibility(View.INVISIBLE);
            correct++;
        } else {
            c3.setVisibility(View.INVISIBLE);
            Wrong3.setVisibility(View.VISIBLE);
        }
        sum++;
        ranint1 = (ranint3+ranint6);
        tv4.setText("" + ranint4);
        tv1.setText("" + ranint1);
        score = (correct/3)*100;
        Toast.makeText(MainActivity.this, (int)correct+"/"+ sum + ", " +(correct/sum)*100 + "%", Toast.LENGTH_SHORT).show();
    }

    public void Next(View view) {
        ranint1 = get_rand();
        ranint4 = get_rand();
        ranint5 = get_rand();
        ranint6 = get_rand();
        tv1.setText("" + ranint1);
        tv4.setText("" + ranint4);
        tv2.setText("num");
        tv3.setText("num");
        tv5.setText("num");
        tv6.setText("num");
        Wrong1.setVisibility(View.INVISIBLE);
        Wrong2.setVisibility(View.INVISIBLE);
        Wrong3.setVisibility(View.INVISIBLE);
        c1.setVisibility(View.INVISIBLE);
        c2.setVisibility(View.INVISIBLE);
        c3.setVisibility(View.INVISIBLE);
        score=0;
        correct=0;
        sum = 0;

        input1.setText(null);
        input2.setText(null);
        input3.setText(null);
    }
}//
