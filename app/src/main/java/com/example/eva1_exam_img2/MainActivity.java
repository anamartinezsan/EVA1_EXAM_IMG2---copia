package com.example.eva1_exam_img2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Surface;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

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


        int rotacion = getWindowManager().getDefaultDisplay().getRotation();
        if (rotacion == Surface.ROTATION_0 || rotacion == Surface.ROTATION_180) {
            skBr.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,boolean fromUser) {
                    //t1.setTextSize(progress);
                    //Toast.makeText(getApplicationContext(), String.valueOf(progress),Toast.LENGTH_LONG).show();
                    switch (progress){
                        case 0: imagePortrait.setImageResource(R.drawable.a1);
                            break;
                        case 1: imagePortrait.setImageResource(R.drawable.a2);
                            break;
                        case 2: imagePortrait.setImageResource(R.drawable.a3);
                            break;
                        case 3: imagePortrait.setImageResource(R.drawable.a4);
                            break;
                        case 4: imagePortrait.setImageResource(R.drawable.a5);
                            break;
                        case 5: imagePortrait.setImageResource(R.drawable.a6);
                            break;
                        case 6: imagePortrait.setImageResource(R.drawable.a7);
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
                        case 0: img1.setImageResource(R.drawable.a1);
                                img2.setImageResource(R.drawable.a2);
                                img3.setImageResource(R.drawable.a3);
                            break;
                        case 1: img1.setImageResource(R.drawable.a2);
                                img2.setImageResource(R.drawable.a3);
                                img3.setImageResource(R.drawable.a4);
                            break;
                        case 2: img1.setImageResource(R.drawable.a3);
                                img2.setImageResource(R.drawable.a4);
                                img3.setImageResource(R.drawable.a5);
                            break;
                        case 3: img1.setImageResource(R.drawable.a4);
                                img2.setImageResource(R.drawable.a5);
                                img3.setImageResource(R.drawable.a6);
                            break;
                        case 4: img1.setImageResource(R.drawable.a5);
                                img2.setImageResource(R.drawable.a6);
                                img3.setImageResource(R.drawable.a7);
                            break;
                        case 5:  img1.setImageResource(R.drawable.a5);
                                 img2.setImageResource(R.drawable.a6);
                                 img3.setImageResource(R.drawable.a7);
                            break;
                        case 6: img1.setImageResource(R.drawable.a5); 
                                img2.setImageResource(R.drawable.a6);
                                img3.setImageResource(R.drawable.a7);
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
