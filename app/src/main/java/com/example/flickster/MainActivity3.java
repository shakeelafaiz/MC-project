package com.example.flickster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    private  static int SPLASH_SCREEN=5000;
Animation top_animation,bot_animation;
TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_anim);

        t1=findViewById(R.id.textView13);

        t1.setAnimation(top_animation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                finish();
            }
        },SPLASH_SCREEN);


    }
}