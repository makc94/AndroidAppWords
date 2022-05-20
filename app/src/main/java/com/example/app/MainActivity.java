package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView main;
    TextView one;
    TextView two;
    TextView three;
    TextView four;
    TextView five;
    Button btn;

    ImageView image1;
    ImageView image2;
    ImageView image3;
    ImageView image4;
    ImageView image5;



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

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);
        image5 = findViewById(R.id.image5);





        @SuppressLint("NonConstantResourceId") View.OnClickListener onClickListener = v -> {
            switch (v.getId()) {
                case R.id.one:
                    one.setTextSize(60);
                    one.setTypeface(Typeface.DEFAULT_BOLD);
                    one.setTextColor(Color.rgb(142, 68, 206));
                    image1.setVisibility(View.VISIBLE);
                    main.append("1");
                    break;
                case R.id.two:
                    two.setTextSize(60);
                    two.setTypeface(Typeface.DEFAULT_BOLD);
                    two.setTextColor(Color.rgb(68, 72, 206));
                    image2.setVisibility(View.VISIBLE);
                    main.append("2");
                    break;
                case R.id.three:
                    three.setTextSize(60);
                    three.setTypeface(Typeface.DEFAULT_BOLD);
                    three.setTextColor(Color.rgb(68, 183, 206));
                    image3.setVisibility(View.VISIBLE);
                    main.append("3");
                    break;
                case R.id.four:
                    four.setTextSize(60);
                    four.setTypeface(Typeface.DEFAULT_BOLD);
                    four.setTextColor(Color.rgb(68, 206, 142));
                    image4.setVisibility(View.VISIBLE);
                    main.append("4");
                    break;
                case R.id.five:
                    five.setTextSize(60);
                    five.setTypeface(Typeface.DEFAULT_BOLD);
                    five.setTextColor(Color.rgb(202, 206, 68));
                    image5.setVisibility(View.VISIBLE);
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

                    one.setTextColor(Color.BLACK);
                    two.setTextColor(Color.BLACK);
                    three.setTextColor(Color.BLACK);
                    four.setTextColor(Color.BLACK);
                    five.setTextColor(Color.BLACK);

                    image1.setVisibility(View.INVISIBLE);
                    image2.setVisibility(View.INVISIBLE);
                    image3.setVisibility(View.INVISIBLE);
                    image4.setVisibility(View.INVISIBLE);
                    image5.setVisibility(View.INVISIBLE);
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



