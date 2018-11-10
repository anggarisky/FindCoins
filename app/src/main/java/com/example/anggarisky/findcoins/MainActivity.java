package com.example.anggarisky.findcoins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.skyfishjy.library.RippleBackground;

public class MainActivity extends AppCompatActivity {

    RippleBackground findcoins;
    ImageView spotcon;
    Animation spotconim;
    LinearLayout resultcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findcoins = (RippleBackground) findViewById(R.id.findcoins);
        findcoins.startRippleAnimation();

        spotcon = (ImageView) findViewById(R.id.spotcon);

        spotconim = AnimationUtils.loadAnimation(this, R.anim.spotconim);
        spotcon.startAnimation(spotconim);

        resultcon = (LinearLayout) findViewById(R.id.resultcon);
        resultcon.startAnimation(spotconim);


    }
}
