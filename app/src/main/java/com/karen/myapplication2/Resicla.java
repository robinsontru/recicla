package com.karen.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Resicla extends AppCompatActivity {

    //Declaracion de variables
    Button button;
    MediaPlayer sonido1;

    VideoView vvinicial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_resicla);
        //referencia



        button =findViewById(R.id.button1);


        sonido1=MediaPlayer.create(this,R.raw.sonido1);
    sonido1.start();
    //referencia de video
        vvinicial=findViewById(R.id.vvinicial);
        vvinicial.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video1);
        vvinicial.setMediaController(new MediaController(this));
        vvinicial.start();
    //creamos en evnto click

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sonido1.start();
            }
        });
    }



}

