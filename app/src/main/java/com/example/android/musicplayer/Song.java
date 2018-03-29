package com.example.android.musicplayer;

public class Song {

    private static final int NO_IMAGE_PROVIDED = -1;
    private int songId;
    private String songName;
    private String artistName;
    private int imageResourceId = NO_IMAGE_PROVIDED;

    public Song(int songId, String songName, String artistName) {
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
    }

    public Song(int songId, String songName, String artistName, int imageResourceId) {
        this.songId = songId;
        this.songName = songName;
        this.artistName = artistName;
        this.imageResourceId = imageResourceId;
    }

    public int getSongId() {
        return this.songId;
    }

    public String getSongName() {
        return this.songName;
    }

    public String getArtistName() {
        return this.artistName;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

    public Boolean hasImage() {
        return this.imageResourceId != NO_IMAGE_PROVIDED;
    }
}
