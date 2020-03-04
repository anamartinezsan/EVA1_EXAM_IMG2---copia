package com.example.eva1_exam_img2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

import android.os.Bundle;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.Surface;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {
SeekBar skBr, skBrLand;
ImageView imagePortrait, img1, img2, img3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagePortrait=findViewById(R.id.imgPortrait);
        skBr= findViewById(R.id.seekBar);
        skBrLand=findViewById(R.id.seekBar2);
        img1=findViewById(R.id.img1);
        img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);

        final Animation animation= new AnimationUtils().loadAnimation(this, R.anim.fade_in);
        int rotacion = getWindowManager().getDefaultDisplay().getRotation();

         TransitionSet set = new TransitionSet().addTransition(new Fade());

        if (rotacion == Surface.ROTATION_0 || rotacion == Surface.ROTATION_180) {
            skBr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                    switch(progress){
                        case 0:
                            frag.startAnimation(animation);
                            break;
                        case 1:
                            frag1.startAnimation(animation);
                            break;
                        case 2: 
                        frag2.startAnimation(animation);
                            break;
                        case 3: 
                                frag3.startAnimation(animation);
                            break;
                        case 4: 
                                frag4.startAnimation(animation);
                            break;
                        case 5: 
                                frag5.startAnimation(animation);
                            break;
                        case 6: 
                                frag6.startAnimation(animation);
                            break;

                    }

                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
        } else {
            skBrLand.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {


                    switch (progress){
                        case 0: 
                                frag.startAnimation(animation);
                                
                                frag1.startAnimation(animation);
                                
                                frag2.startAnimation(animation);
                            break;
                        case 1: 
                                .startAnimation(animation);
                                
                                .startAnimation(animation);
                                
                                .startAnimation(animation);
                            break;
                        case 2: 
                                .startAnimation(animation);
                                
                                .startAnimation(animation);
                                
                                .startAnimation(animation);
                            break;
                        case 3: 
                                .startAnimation(animation);
                                
                            break;
                        case 4: 
                                .startAnimation(animation);
                            break;
                        case 5:  
                                 .startAnimation(animation);
                            break;
                        case 6: 
                                .startAnimation(animation);
                            break;
                    }
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });

        }
    }
}

