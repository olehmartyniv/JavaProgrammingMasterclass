package com.company;

public class Song {

    private String songTitle;
    private int songDuration;

    public Song(String songTitle, int songDuration) {
        this.songTitle = songTitle;
        this.songDuration = songDuration;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public int getSongDuration() {
        return songDuration;
    }

    public boolean equals(Song song) {
        return (songTitle.equals(song.getSongTitle()) && songDuration == song.getSongDuration());
    }
}
