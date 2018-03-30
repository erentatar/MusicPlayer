package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import org.parceler.Parcels;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a list of songs
        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Telli Turnam", "Cem Adrian", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(2, "Elastic Heart", "Sia", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(3, "What About Us", "Pink", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(4, "Bad Day", "Daniel Powder", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(5, "Havana", "Camila Cabello", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(6, "Kış Güneşi", "Tarkan", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(7, "Endless", "Inna", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(8, "Halo", "Beyonce", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(9, "Wrong Side of the Road", "Can Gox", R.drawable.ic_music_note_white_48dp));
        songs.add(new Song(10, "Dead and Lovely", "Tom Waits", R.drawable.ic_music_note_white_48dp));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_main.xml layout file.
        ListView listView = findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Create a new intent to open the {@link PlayActivity}
                Intent playIntent = new Intent(MainActivity.this, PlayActivity.class);

                Parcelable wrapped = Parcels.wrap(songs.get(position));
                playIntent.putExtra("song", wrapped);
                // Start the new activity
                startActivity(playIntent);
            }
        });
    }
}
