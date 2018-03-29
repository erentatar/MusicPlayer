package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String mSongName = getIntent().getStringExtra("mSongName");
            if (!mSongName.isEmpty()) {
                //set song name text
                TextView txtSongName = (TextView) findViewById(R.id.txtSongName);
                txtSongName.setText(mSongName);
            }

            String mArtistName = getIntent().getStringExtra("mArtistName");
            if (!mArtistName.isEmpty()) {
                //set artist name text
                TextView txtArtistName = (TextView) findViewById(R.id.txtArtistName);
                txtArtistName.setText(mArtistName);
            }
        }
    }
}
