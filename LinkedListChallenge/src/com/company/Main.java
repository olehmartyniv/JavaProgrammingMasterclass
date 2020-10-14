package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static LinkedList<Song> playlist = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    {
        Album toxicity = new Album("Toxicity");
        toxicity.addSong(new Song("Chop Suey!", 210));
        toxicity.addSong(new Song("Needles", 192));
        toxicity.addSong(new Song("Toxicity", 220));
        Album vol_3 = new Album("Vol. 3");
        vol_3.addSong(new Song("Duality", 252));
        vol_3.addSong(new Song("Before I Forget", 278));
        vol_3.addSong(new Song("Vermilion", 316));
        Album nevermind = new Album("Nevermind");
        nevermind.addSong(new Song("Smells Like Teen Spirit", 301));
        nevermind.addSong(new Song("Lithium", 257));
        nevermind.addSong(new Song("Lounge Act", 156));
        albums.add(toxicity);
        albums.add(vol_3);
        albums.add(nevermind);
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
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty");
                    } else {
                        System.out.printf("%-3s %-15s %-10s%n", "#", "Title", "Duration");
                        for (int i = 0; i < playlist.size(); i++) {
                            String duration = playlist.get(i).getSongDuration() / 60 + ":" +
                                    String.format("%02d", playlist.get(i).getSongDuration() % 60);
                            System.out.printf("%-3d %-15s %-10s%n", (i + 1), playlist.get(i).getSongTitle(), duration);
                        }
                    }
                    break;
                case "3":

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
}
