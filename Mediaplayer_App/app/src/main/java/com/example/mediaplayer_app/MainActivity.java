package com.example.mediaplayer_app;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        media=MediaPlayer.create(this,R.raw.cakebytheocean);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button play=(Button)findViewById(R.id.Play);
        Button stop=(Button)findViewById(R.id.Stop);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

           media.start();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            media.pause();
            }
        });
    }
}