package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;
    SoundPool mSoundPool;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);


        // TODO: Load and get the IDs to identify the sounds
        mCSoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDSoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,2);
        mESoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,3);
        mFSoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,4);
        mGSoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,5);
        mASoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,6);
        mBSoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,7);


    }

    // TODO: Add the play methods triggered by the buttons
        public void playC(View v){
            mCSoundId = mSoundPool.play(1,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

        }

        public void playD(View v){
            mDSoundId = mSoundPool.play(2,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

        }

        public void playE(View v){
            mESoundId = mSoundPool.play(3,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

        }

        public void playF(View v){
            mFSoundId = mSoundPool.play(4,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

        }

        public void playG(View v){
            mGSoundId = mSoundPool.play(5,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

        }

        public void playA(View v){
            mASoundId = mSoundPool.play(6,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

        }

        public void playB(View v){
            mBSoundId = mSoundPool.play(7,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

        }

}
