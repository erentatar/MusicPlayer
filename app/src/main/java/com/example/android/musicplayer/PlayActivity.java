package com.example.android.musicplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.parceler.Parcels;

public class PlayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Song song = Parcels.unwrap(getIntent().getParcelableExtra("song"));
        if (song != null) {
            //set song name text
            TextView txtSongName = findViewById(R.id.txtSongName);
            txtSongName.setText(song.getSongName());

            //set artist name text
            TextView txtArtistName = findViewById(R.id.txtArtistName);
            txtArtistName.setText(song.getArtistName());
        }
    }
}
