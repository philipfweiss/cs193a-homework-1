package com.example.philipfweiss.first_activity_two;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.media.MediaPlayer;

public class first_activity_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_activity_two);
    }

    public void aOnClick(View view) {
        MediaPlayer mp1 = MediaPlayer.create(this, R.raw.a);
        mp1.start();
        mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp1) {
                mp1.release();
            }
        });
    }

    public void bOnClick(View view) {
        MediaPlayer mp2 = MediaPlayer.create(this, R.raw.b);
        mp2.start();
        mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp2) {
                mp2.release();
            }
        });
    }

    public void cOnClick(View view) {
        MediaPlayer mp3 = MediaPlayer.create(this, R.raw.c);
        mp3.start();
        mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp3) {
                mp3.release();
            }
        });
    }

    public void dOnClick(View view) {
        MediaPlayer mp4 = MediaPlayer.create(this, R.raw.d);
        mp4.start();
        mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp4) {
                mp4.release();
            }
        });
    }

    public void eOnClick(View view) {
        MediaPlayer mp5 = MediaPlayer.create(this, R.raw.e);
        mp5.start();
        mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp5) {
                mp5.release();
            }
        });
    }

    public void fOnClick(View view) {
        MediaPlayer mp6 = MediaPlayer.create(this, R.raw.f);
        mp6.start();
        mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp6) {
                mp6.release();
            }
        });
    }

    public void gOnClick(View view) {
        MediaPlayer mp7 = MediaPlayer.create(this, R.raw.g);
        mp7.start();
        mp7.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp7) {
                mp7.release();
            }
        });
    }

    public void cSharpOnClick(View view) {
        MediaPlayer mp8 = MediaPlayer.create(this, R.raw.csharp);
        mp8.start();
        mp8.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp8) {
                mp8.release();
            }
        });
    }

    public void dSharpOnClick(View view) {
        MediaPlayer mp9 = MediaPlayer.create(this, R.raw.eflat);
        mp9.start();
        mp9.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp9) {
                mp9.release();
            }
        });
    }

    public void gSharpOnClick(View view) {
        MediaPlayer mp10 = MediaPlayer.create(this, R.raw.gsharp);
        mp10.start();
        mp10.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp10) {
                mp10.release();
            }
        });
    }

    public void bFlatOnClick(View view) {
        MediaPlayer mp11 = MediaPlayer.create(this, R.raw.bflat);
        mp11.start();
        mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp11) {
                mp11.release();
            }
        });
    }

    public void fFlatOnClick(View view) {
        MediaPlayer mp12 = MediaPlayer.create(this, R.raw.fsharp);
        mp12.start();
        mp12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp12) {
                mp12.release();
            }
        });
    }
}


