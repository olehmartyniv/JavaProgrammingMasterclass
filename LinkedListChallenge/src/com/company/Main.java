package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();
    private static Playlist playlist = new Playlist("Tim's playlist");
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
                    playlist.printPlaylistSongs();
                    break;
                case "3":
                    addSongs();
                    break;
            }
        }
    }

    public static void printOptions() {
        System.out.print("\n" + playlist.getPlaylistName() + " menu. Press:\n" +
                "1 - to start playing\n" +
                "2 - to print playlist songs\n" +
                "3 - to add songs to playlist\n" +
                "0 - to quit\n");
    }

    public static void playOptions() {
        if (playlist.getPlaylist().isEmpty()) {
            System.out.println("Playlist is empty");
        } else {
            ListIterator<Song> listIterator = playlist.getPlaylist().listIterator();
            Song currentSong = listIterator.next();
            boolean goingForward = true;
            while (currentSong != null) {
                System.out.println("\n'" + currentSong.getSongTitle() + "' is playing");
                System.out.print("\nPress\n" +
                        "1 - next song\n" +
                        "2 - previous song\n" +
                        "3 - replay song\n" +
                        "4 - remove song\n" +
                        "0 - quit\n");
                switch (scanner.nextLine()) {
                    case "0":
                        System.out.println("Stop playing");
                        return;
                    case "1":
                        if (!goingForward) {
                            listIterator.next();
                            goingForward = true;
                        }

                        if (listIterator.hasNext()) currentSong = listIterator.next();
                        else System.out.println("Reached the end of the playlist");

                        break;
                    case "2":
                        if (goingForward) {
                            listIterator.previous();
                            goingForward = false;
                        }

                        if (listIterator.hasPrevious()) currentSong = listIterator.previous();
                        else System.out.println("We are at the start of the playlist");

                        break;
                    case "3":
                        if (goingForward) currentSong = listIterator.previous();
                        listIterator.next();
                        goingForward = true;
                        break;
                    case "4":
                        listIterator.remove();
                        if (listIterator.hasNext()) currentSong = listIterator.next();
                        else if (listIterator.hasPrevious()) currentSong = listIterator.previous();
                        else currentSong = null;

                        break;
                }
            }
        }
    }

    public static void addSongs() {
        if (albums.isEmpty()) {
            System.out.println("Playlist is empty");
            return;
        }

        while (true) {
            System.out.println();
            for (int i = 0; i < albums.size(); i++) {
                System.out.println((i + 1) + " - " + albums.get(i).getAlbumTitle());
            }
            System.out.println("0 - go back");
            System.out.print("Choose album: ");

            int selectedAlbum = Integer.parseInt(scanner.nextLine());
            if (selectedAlbum == 0) {
                break;
            } else if (selectedAlbum > albums.size() || selectedAlbum < 0) {
                System.out.println("Incorrect value");
            } else {
                Album album = albums.get(selectedAlbum - 1);
                while (true) {
                    album.printAlbumSongs();
                    System.out.println("0\tgo back");
                    System.out.print("Choose song: ");
                    int selectedSong = Integer.parseInt(scanner.nextLine());
                    if (selectedSong == 0) {
                        break;
                    } else if (selectedSong > album.getSongs().size() || selectedSong < 0) {
                        System.out.println("Incorrect value");
                    } else {
                        playlist.addSong(album.getSongs().get((selectedSong - 1)));
                    }
                }
            }
        }
    }
}
