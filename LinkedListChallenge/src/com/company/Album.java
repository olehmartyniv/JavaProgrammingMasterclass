package com.company;

import java.util.ArrayList;

public class Album {

    private String albumTitle;
    private String albumArtist;
    private ArrayList<Song> songs;

    public Album(String albumTitle, String albumArtist) {
        this.albumTitle = albumTitle;
        this.albumArtist = albumArtist;
        songs = new ArrayList<>();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getAlbumArtist() {
        return albumArtist;
    }

    public int getAlbumSize() {
        return songs.size();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Song getSong(int index) {
        return songs.get(index);
    }

    public void printAlbumSongs() {
        if (songs.isEmpty()) {
            System.out.println("Album is empty");
        } else {
            System.out.println("\n" + albumArtist + " - " + albumTitle);
            System.out.printf("%-3s %-25s %-10s%n", "#", "Title", "Duration");
            for (int i = 0; i < songs.size(); i++) {
                System.out.printf("%-3d %s", (i + 1), songs.get(i));
            }
        }
    }
}
