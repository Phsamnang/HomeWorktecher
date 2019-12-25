package com.example.homeworkstyles;

import androidx.annotation.AnimRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private ImageView img;
    private TextView txtsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        img = findViewById(R.id.img);
        txtsh = findViewById(R.id.txtsh);
        doAnime();
    }

    private void doAnime() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash);
        Animation animation1 = AnimationUtils.loadAnimation(this, R.anim.rotate);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        img.clearAnimation();
        img.startAnimation(animation);
        txtsh.clearAnimation();
        txtsh.startAnimation(animation1);
    }

}
