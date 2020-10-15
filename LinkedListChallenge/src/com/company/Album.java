package com.company;

import java.util.ArrayList;

public class Album {

    private String albumTitle;
    private ArrayList<Song> songs;

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
        songs = new ArrayList<>();
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void printAlbumSongs() {
        if (songs.isEmpty()) {
            System.out.println("Album is empty");
        } else {
            System.out.printf("%-3s %-25s %-10s%n", "#", "Title", "Duration");
            for (int i = 0; i < songs.size(); i++) {
                String duration = songs.get(i).getSongDuration() / 60 + ":" +
                        String.format("%02d", songs.get(i).getSongDuration() % 60);
                System.out.printf("%-3d %-25s %-10s%n", (i + 1), songs.get(i).getSongTitle(), duration);
            }
        }
    }

    public void addSong(Song song) {
        if (lookupSong(song.getSongTitle()) < 0) {
            songs.add(song);
            System.out.println(song.getSongTitle() + " added to '" + albumTitle + "' album");
        } else {
            System.out.println(song.getSongTitle() + " already in the album");
        }
    }

    public Song getSong(int index) {
            return songs.get(index);
    }

    private int lookupSong(String name) {
        int index = -1;
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getSongTitle().equals(name)) index = i;
        }

        return index;
    }
}
