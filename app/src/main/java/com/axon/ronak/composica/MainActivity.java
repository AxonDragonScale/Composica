package com.axon.ronak.composica;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NO_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int[] mSoundId;

    private SoundPool mSoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mSoundPool = new SoundPool.Builder().setMaxStreams(NO_OF_SIMULTANEOUS_SOUNDS).build();
        mSoundPool = new SoundPool(NO_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);

        mSoundId = new int[7];
        mSoundId[0] = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mSoundId[1] = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mSoundId[2] = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mSoundId[3] = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mSoundId[4] = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mSoundId[5] = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mSoundId[6] = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.btn_cKey: mSoundPool.play(mSoundId[0],LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                        break;
                    case R.id.btn_dKey: mSoundPool.play(mSoundId[1],LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                        break;
                    case R.id.btn_eKey: mSoundPool.play(mSoundId[2],LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                        break;
                    case R.id.btn_fKey: mSoundPool.play(mSoundId[3],LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                        break;
                    case R.id.btn_gKey: mSoundPool.play(mSoundId[4],LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                        break;
                    case R.id.btn_aKey: mSoundPool.play(mSoundId[5],LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                        break;
                    case R.id.btn_bKey: mSoundPool.play(mSoundId[6],LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
                }
            }
        };

        Button[] buttons = new Button[7];
        buttons[0] = (Button) findViewById(R.id.btn_cKey);
        buttons[1] = (Button) findViewById(R.id.btn_dKey);
        buttons[2] = (Button) findViewById(R.id.btn_eKey);
        buttons[3] = (Button) findViewById(R.id.btn_fKey);
        buttons[4] = (Button) findViewById(R.id.btn_gKey);
        buttons[5] = (Button) findViewById(R.id.btn_aKey);
        buttons[6] = (Button) findViewById(R.id.btn_bKey);

        for(Button button : buttons) {
            button.setOnClickListener(clickListener);
        }






    }
}
