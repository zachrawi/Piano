package com.zachrawi.piano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonC = findViewById(R.id.buttonC);
        Button buttonD = findViewById(R.id.buttonD);
        Button buttonE = findViewById(R.id.buttonE);
        Button buttonF = findViewById(R.id.buttonF);
        Button buttonG = findViewById(R.id.buttonG);
        Button buttonA = findViewById(R.id.buttonA);
        Button buttonB = findViewById(R.id.buttonB);

        final SoundPool soundPool = new SoundPool(7, AudioManager.STREAM_MUSIC, 0);

        final int noteC = soundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        final int noteD = soundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        final int noteE = soundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        final int noteF = soundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        final int noteG = soundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        final int noteA = soundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        final int noteB = soundPool.load(getApplicationContext(), R.raw.note7_b, 1);

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noteC, 1.0f, 1.0f, 1, 0, 1);
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noteD, 1.0f, 1.0f, 1, 0, 1);
            }
        });

        buttonE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noteE, 1.0f, 1.0f, 1, 0, 1);
            }
        });

        buttonF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noteF, 1.0f, 1.0f, 1, 0, 1);
            }
        });

        buttonG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noteG, 1.0f, 1.0f, 1, 0, 1);
            }
        });

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noteA, 1.0f, 1.0f, 1, 0, 1);
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(noteB, 1.0f, 1.0f, 1, 0, 1);
            }
        });
    }
}
