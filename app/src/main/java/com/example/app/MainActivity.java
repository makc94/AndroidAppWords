package com.example.app;

import static com.example.app.R.layout.activity_main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.metrics.Event;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView main, one, two, three, four, five;
    Button btn;
    ImageView image1, image2, image3, image4, image5;

    ConstraintLayout layout;

    @SuppressLint({"ClickableViewAccessibility", "NonConstantResourceId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_main);

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

        layout = findViewById(R.id.general);
//        layout.addView(new DrawLine(this));

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        };
        btn.setOnClickListener(onClickListener);

        layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        if ((event.getX() > 490 && event.getX() < 600) && (event.getY() > 570 && event.getY() < 700))
                            clickMethod(one, image1, "1", 120, 333, 32);
                        else if ((event.getX() > 830 && event.getX() < 930) && (event.getY() > 830 && event.getY() < 930))
                            clickMethod(two, image2, "2", 68, 72, 206);
                        else if ((event.getX() > 680 && event.getX() < 790) && (event.getY() > 1130 && event.getY() < 1240))
                            clickMethod(three, image3, "3", 68, 183, 206);
                        else if ((event.getX() > 300 && event.getX() < 410) && (event.getY() > 1120 && event.getY() < 1230))
                            clickMethod(four, image4, "4", 68, 206, 142);
                        else if ((event.getX() > 160 && event.getX() < 270) && (event.getY() > 820 && event.getY() < 930))
                            clickMethod(five, image5, "5", 202, 206, 68);

                    case MotionEvent.ACTION_MOVE:

                            if ((event.getX() > 490 && event.getX() < 600) && (event.getY() > 570 && event.getY() < 700))
                                clickMethod(one, image1, "1", 120, 333, 32);
                            else if ((event.getX() > 830 && event.getX() < 930) && (event.getY() > 830 && event.getY() < 930))
                                clickMethod(two, image2, "2", 68, 72, 206);
                            else if ((event.getX() > 680 && event.getX() < 790) && (event.getY() > 1130 && event.getY() < 1240))
                                clickMethod(three, image3, "3", 68, 183, 206);
                            else if ((event.getX() > 300 && event.getX() < 410) && (event.getY() > 1120 && event.getY() < 1230))
                                clickMethod(four, image4, "4", 68, 206, 142);
                            else if ((event.getX() > 160 && event.getX() < 270) && (event.getY() > 820 && event.getY() < 930))
                                clickMethod(five, image5, "5", 202, 206, 68);

                }
                return true;
            }
            private void clickMethod (TextView textView, ImageView imageView, String mainText, Integer
                    r, Integer g, Integer b){
                textView.setTextSize(60);
                textView.setTypeface(Typeface.DEFAULT_BOLD);
                textView.setTextColor(Color.rgb(r, g, b));
                imageView.setVisibility(View.VISIBLE);
                main.append(mainText);
            }
        });
    }
}
