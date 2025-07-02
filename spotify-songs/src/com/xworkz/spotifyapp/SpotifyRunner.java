package com.xworkz.spotifyapp;

import com.xworkz.spotifyapp.dto.SongDto;
import com.xworkz.spotifyapp.spotify.Spotify;
import com.xworkz.spotifyapp.spotify.impl.SpotifyImpl;

import java.util.Scanner;

public class SpotifyRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of songs to add: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Spotify spotify = new SpotifyImpl(size);

        for (int i = 0; i < size; i++) {
            SongDto dto = new SongDto();

            System.out.println("\nEnter details for Song " + (i + 1));

            System.out.print("ID: ");
            dto.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Song Name: ");
            dto.setName(scanner.nextLine());

            System.out.print("Artist: ");
            dto.setArtist(scanner.nextLine());

            System.out.print("Album: ");
            dto.setAlbum(scanner.nextLine());

            System.out.print("Genre: ");
            dto.setGenre(scanner.nextLine());

            System.out.print("Duration (in seconds): ");
            dto.setDuration(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Release Date: ");
            dto.setReleaseDate(scanner.nextLine());

            boolean added = spotify.addSong(dto);
            if (!added) {
                System.out.println("Failed to add song.");
            }
        }

        String input;
        do {
            System.out.println("\n--- Spotify Menu ---");
            System.out.println("1. View All Songs");
            System.out.println("2. Get Artist by Song Name");
            System.out.println("3. Get Duration by Song Name");
            System.out.println("4. Get Genre by Song Name");
            System.out.println("5. Get Song Name by Album or Artist");
            System.out.println("6. Update Song Duration by ID");
            System.out.println("7. Get Album by Song Name");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    spotify.getAllSongs();
                    break;
                case 2:
                    System.out.print("Enter Song Name: ");
                    System.out.println("Artist: " + spotify.getArtistBySongName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter Song Name: ");
                    System.out.println("Duration: " + spotify.getDurationBySongName(scanner.nextLine()) + " seconds");
                    break;
                case 4:
                    System.out.print("Enter Song Name: ");
                    System.out.println("Genre: " + spotify.getGenreBySongName(scanner.nextLine()));
                    break;
                case 5:
                    System.out.print("Enter Album or Artist: ");
                    System.out.println("Song Name: " + spotify.getSongNameByAlbumOrArtist(scanner.nextLine()));
                    break;
                case 6:
                    System.out.print("Enter Song ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter New Duration (in seconds): ");
                    int newDuration = scanner.nextInt();
                    scanner.nextLine();
                    boolean updated = spotify.updateSongDurationById(id, newDuration);
                    System.out.println("Duration updated: " + updated);
                    break;
                case 7:
                    System.out.print("Enter Song Name: ");
                    System.out.println("Album: " + spotify.getAlbumBySongName(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("Y"));

        System.out.println("Thank you........");
        scanner.close();
    }
}
