package com.example.mynotes;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    Animation topAnimation, bottomAnimation, centerAnimation;
    TextView name;
    View first, second, third, fourth, fifth, sixth, first1, second2, third3, fourth4, fifth5, sixth6;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.sp_screen);
        //load animations
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        centerAnimation = AnimationUtils.loadAnimation(this, R.anim.center_animation);

        //find id of variables
        first = findViewById(R.id.first_line);
        second = findViewById(R.id.second_line);
        third = findViewById(R.id.third_line);
        fourth = findViewById(R.id.fourth_line);
        fifth = findViewById(R.id.fifth_line);
        sixth = findViewById(R.id.sixth_line);
        first1 = findViewById(R.id.first_line1);
        second2 = findViewById(R.id.second_line2);
        third3 = findViewById(R.id.third_line3);
        fourth4 = findViewById(R.id.fourth_line4);
        fifth5 = findViewById(R.id.fifth_line5);
        sixth6 = findViewById(R.id.sixth_line6);
        name = findViewById(R.id.app_name);

        //set topAnimation
        first.setAnimation(topAnimation);
        second.setAnimation(topAnimation);
        third.setAnimation(topAnimation);
        fourth.setAnimation(topAnimation);
        fifth.setAnimation(topAnimation);
        sixth.setAnimation(topAnimation);

        //setBottomAnimation
        first1.setAnimation(bottomAnimation);
        second2.setAnimation(bottomAnimation);
        third3.setAnimation(bottomAnimation);
        fourth4.setAnimation(bottomAnimation);
        fifth5.setAnimation(bottomAnimation);
        sixth6.setAnimation(bottomAnimation);


        //setCenterAnimation
        name.setAnimation(centerAnimation);



        new Handler().postDelayed(new Runnable(){

            public void run(){
                   startActivity(new Intent(SplashScreen.this, MainActivity.class));
                   finish();
            }
        }, 5000);


    }
}
