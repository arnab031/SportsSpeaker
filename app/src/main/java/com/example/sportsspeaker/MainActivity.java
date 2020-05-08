package com.example.sportsspeaker;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.nfc.Tag;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton imgBoxing,imgKickBoxing,imgKarate,imgJudo,imgAikido,imgTaekwondo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing=findViewById(R.id.imgBoxing);
        imgKickBoxing=findViewById(R.id.imgKickBoxing);
        imgKarate=findViewById(R.id.imgKarate);
        imgJudo=findViewById(R.id.imgJudo);
        imgAikido=findViewById(R.id.imgAlkido);
        imgTaekwondo=findViewById(R.id.imgTaekwondo);

        imgBoxing.setOnClickListener(MainActivity.this);
        imgKickBoxing.setOnClickListener(MainActivity.this);
        imgJudo.setOnClickListener(MainActivity.this);
        imgKarate.setOnClickListener(MainActivity.this);
        imgAikido.setOnClickListener(MainActivity.this);
        imgTaekwondo.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View imageButtonView) {
        switch (imageButtonView.getId()){
            case R.id.imgBoxing:
                playSportName(imgBoxing.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                playSportName(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                playSportName(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate:
                playSportName(imgKarate.getTag().toString());
                break;
            case R.id.imgAlkido:
                playSportName(imgAikido.getTag().toString());
                break;
            case R.id.imgTaekwondo:
                playSportName(imgTaekwondo.getTag().toString());
                break;
        }
    }

    private void playSportName(String sportName){
        MediaPlayer sportPlayer=MediaPlayer.create(this,getResources().getIdentifier(sportName,"raw",getPackageName()));
        sportPlayer.start();
    }


}
