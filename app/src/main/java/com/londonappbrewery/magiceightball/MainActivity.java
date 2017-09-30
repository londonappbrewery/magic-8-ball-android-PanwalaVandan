package com.londonappbrewery.magiceightball;

import android.icu.text.DateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.lang.reflect.Field;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView ballImage;
    int[] ballArray =
            {       R.drawable.ball1,
                    R.drawable.ball2,
                    R.drawable.ball3,
                    R.drawable.ball4,
                    R.drawable.ball5
            };

    Button myButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ballImage = (ImageView)findViewById(R.id.image_eightball);
        myButton = (Button)findViewById(R.id.askButton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(4);
                ballImage.setImageResource(ballArray[number]);
            }
        });
    }
}
