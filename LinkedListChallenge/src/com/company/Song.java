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

    @Override
    public String toString() {
        return String.format("%-25s %-10s%n", songTitle, songDuration / 60 + ":" +
                String.format("%02d", songDuration % 60));
    }
}
