package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

    public int getPlaylistSize() {
        return playlist.size();
    }

    public ListIterator<Song> getPlaylistIterator() {
        return playlist.listIterator();
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

    public void printPlaylistSongs() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            Iterator<Song> iterator = playlist.iterator();
            System.out.println("\n" + playlistName + " songs:");
            System.out.printf("%-3s %-25s %-10s%n", "#", "Title", "Duration");
            for (int i = 0; iterator.hasNext(); i++) {
                System.out.printf("%-3d %s", (i + 1), iterator.next());
            }
        }
    }
}
