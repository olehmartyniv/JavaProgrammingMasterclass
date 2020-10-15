package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Song> playlist = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        albums.add(new Album("Toxicity"));
        albums.get(0).addSong(new Song("Chop Suey!", 210));
        albums.get(0).addSong(new Song("Needles", 192));
        albums.get(0).addSong(new Song("Toxicity", 220));
        albums.add(new Album("Vol. 3"));
        albums.get(1).addSong(new Song("Duality", 252));
        albums.get(1).addSong(new Song("Before I Forget", 278));
        albums.get(1).addSong(new Song("Vermilion", 316));
        albums.add(new Album("Nevermind"));
        albums.get(2).addSong(new Song("Smells Like Teen Spirit", 301));
        albums.get(2).addSong(new Song("Lithium", 257));
        albums.get(2).addSong(new Song("Lounge Act", 156));
    }

    public static void main(String[] args) {
        boolean showMenu = true;
        while (showMenu) {
            printOptions();
            switch (scanner.nextLine()) {
                case "0":
                    showMenu = false;
                    break;
                case "1":
                    playOptions();
                    break;
                case "2":
                    printPlaylistSongs();
                    break;
                case "3":
                    addSongs();
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.print("\nPress\n" +
                "1 - start playing\n" +
                "2 - print playlist songs\n" +
                "3 - add songs to playlist\n" +
                "0 - quit\n");
    }

    public static void printPlaylistSongs() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            System.out.printf("%-3s %-25s %-10s%n", "#", "Title", "Duration");
            for (int i = 0; i < playlist.size(); i++) {
                String duration = playlist.get(i).getSongDuration() / 60 + ":" +
                        String.format("%02d", playlist.get(i).getSongDuration() % 60);
                System.out.printf("%-3d %-25s %-10s%n", (i + 1), playlist.get(i).getSongTitle(), duration);
            }
        }
    }

    public static void playOptions() {
        if (playlist.isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            System.out.print("\nPress\n" +
                    "1 - next song\n" +
                    "2 - previous song\n" +
                    "3 - replay song\n" +
                    "4 - remove song\n" +
                    "0 - quit\n");
        }
    }

    public static void addSongs() {
        if (albums.isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        }

        while (true) {
            System.out.println("\nChoose album");
            for (int i = 0; i < albums.size(); i++) {
                System.out.println((i + 1) + " - " + albums.get(i).getAlbumTitle());
            }
            System.out.println("0 - go back");

            int selectedAlbum = Integer.parseInt(scanner.nextLine());
            if (selectedAlbum == 0) {
                break;
            } else if (selectedAlbum > albums.size() || selectedAlbum < 0) {
                System.out.println("Incorrect value");
                continue;
            } else {
                Album album = albums.get(selectedAlbum - 1);
                while (true) {
                    System.out.print("\nChoose song");
                    album.printAlbumSongs();
                    System.out.println("0\tgo back");

                    int selectedSong = Integer.parseInt(scanner.nextLine());
                    if (selectedSong == 0) {
                        break;
                    } else if (selectedSong > album.getSongs().size() || selectedSong < 0) {
                        System.out.println("Incorrect value");
                        continue;
                    } else {
                        Song song = album.getSong(selectedSong - 1);
                        playlist.add(song);
                        System.out.println("'" + song.getSongTitle() + "' added");
                    }
                }
            }
        }
    }
}
