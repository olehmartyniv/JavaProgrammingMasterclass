package com.company;

import java.util.LinkedList;

public class Playlist {

    private String playlistName;
    private LinkedList<Song> playlist;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        playlist = new LinkedList<>();
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public LinkedList<Song> getPlaylist() {
        return playlist;
    }

    public void printPlaylistSongs() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            System.out.println("\n" + playlistName + " songs:");
            System.out.printf("%-3s %-25s %-10s%n", "#", "Title", "Duration");
            for (int i = 0; i < playlist.size(); i++) {
                String duration = playlist.get(i).getSongDuration() / 60 + ":" +
                        String.format("%02d", playlist.get(i).getSongDuration() % 60);
                System.out.printf("%-3d %-25s %-10s%n", (i + 1), playlist.get(i).getSongTitle(), duration);
            }
        }
    }

    public void addSong(Song song) {
        if (lookupSong(song)) {
            System.out.println(song.getSongTitle() + " already in the playlist");
        } else {
            playlist.add(song);
            System.out.println(song.getSongTitle() + " added to the playlist");
        }
    }

    private boolean lookupSong(Song song) {
        for (Song value : playlist) {
            if (value.equals(song)) return true;
        }

        return false;
    }
}
