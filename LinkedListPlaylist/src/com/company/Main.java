package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {

        System.out.println("hello playlist");

        Album album = new Album("Collage", "Chainsmoker");
        album.addSong("Setting Fires", 4.6);
        album.addSong("All We Know", 3.5);
        album.addSong("Closer", 4.8);
        album.addSong("Inside Out", 3.4);
        album.addSong("Don't Let Me Down", 4.1);
        albums.add(album);

        album = new Album("A Head Full of Dreams", "Coldplay");

        album.addSong("A Head Full of Dreams", 4.5 );
        album.addSong("Birds", 4.7);
        album.addSong("Hymn For The Weekend", 3.2);
        album.addSong("Fun", 3.8 );
        album.addSong("Colour Spectrum", 4.9 );
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<Song>();
        albums.get(0).addToPlaylist("All We Know", playlist);
        albums.get(0).addToPlaylist("Closer", playlist);
        albums.get(0).addToPlaylist("Setting Fires", playlist);
        albums.get(0).addToPlaylist("A Sky Full of Stars", playlist); // Not in album
        albums.get(0).addToPlaylist(5, playlist);

        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(10, playlist); // There is no track with that number

        play(playlist);



    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No Songs in the PlayList");
            return;
        } else{
            System.out.println("Now Playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();


            switch(action){

                case 0:
                    System.out.println("Getting out of the playlist.");
                    quit = true;
                    break;

                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing : " + listIterator.next().toString());
                    } else {
                        System.out.println("We Have Reached the End of the Playlist.");
                        forward = false;
                    }
                    break;

                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }

                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing : " + listIterator.previous().toString());
                    } else {
                        System.out.println("We Are At the Start of the Playlist.");
                        forward = true;
                    }
                    break;
                case 3 :
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying : " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("At the start of the list.");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying : " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("End of the list.");
                        }
                    }
                    break;

                case 4:
                    printList(playlist);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playlist.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
//                        listIterator.next();
                    }
                    break;

            }
        }

    }

    private static void printMenu(){
        System.out.println("Welcome to MyPlaylist.");
        System.out.println("0 - quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song \n" +
                "3 - to replay the current song\n" +
                "4 - list the songs in the playlist.\n" +
                "5 - print the available songs\n" +
                "6 - delete current song from playlist\n"
        );
    }


//  Method to print the playlist
    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("====================");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("====================");
    }





}

