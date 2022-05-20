package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView main;
    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main = findViewById(R.id.main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        btn = findViewById(R.id.btn);





        @SuppressLint("NonConstantResourceId") View.OnClickListener onClickListener = v -> {
            switch (v.getId()) {
                case R.id.one:
                    one.setTextSize(60);
                    one.setTypeface(Typeface.DEFAULT_BOLD);
                    main.append("1");
                    break;
                case R.id.two:
                    two.setTextSize(60);
                    two.setTypeface(Typeface.DEFAULT_BOLD);
                    main.append("2");
                    break;
                case R.id.three:
                    three.setTextSize(60);
                    three.setTypeface(Typeface.DEFAULT_BOLD);
                    main.append("3");
                    break;
                case R.id.four:
                    four.setTextSize(60);
                    four.setTypeface(Typeface.DEFAULT_BOLD);
                    main.append("4");
                    break;
                case R.id.five:
                    five.setTextSize(60);
                    five.setTypeface(Typeface.DEFAULT_BOLD);
                    main.append("5");
                    break;
                case R.id.btn:
                    main.setText("");
                    one.setTypeface(Typeface.DEFAULT);
                    two.setTypeface(Typeface.DEFAULT);
                    three.setTypeface(Typeface.DEFAULT);
                    four.setTypeface(Typeface.DEFAULT);
                    five.setTypeface(Typeface.DEFAULT);
                    one.setTextSize(34);
                    two.setTextSize(34);
                    three.setTextSize(34);
                    four.setTextSize(34);
                    five.setTextSize(34);
                    break;
            }
        };
        one.setOnClickListener(onClickListener);
        two.setOnClickListener(onClickListener);
        three.setOnClickListener(onClickListener);
        four.setOnClickListener(onClickListener);
        five.setOnClickListener(onClickListener);
        btn.setOnClickListener(onClickListener);
    }
}


