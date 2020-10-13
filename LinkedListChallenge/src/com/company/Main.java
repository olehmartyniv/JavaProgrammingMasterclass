package com.company;

public class Main {

    public static void main(String[] args) {
	    Album album = new Album("Toxicity");
	    album.printAlbumSongs();
	    album.addSong(new Song("Chop Sue", 240));
        album.addSong(new Song("Spiders", 305));
        album.addSong(new Song("Toxicity", 280));
        album.addSong(new Song("Toxicity", 280));
        album.printAlbumSongs();
        System.out.println(album.getSong("Spiders").getSongTitle());
        System.out.println(album.getSong("test").getSongTitle());
    }
}
