package com.xworkz.netflixapp;

import com.xworkz.netflixapp.dto.NetflixSeriesDto;
import com.xworkz.netflixapp.service.Netflix;
import com.xworkz.netflixapp.service.impl.NetflixSeriesImpl;

import java.util.Scanner;

public class NetflixSeriesRunner {

    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("How many Netflix Series do you want to add?");
            int size = scanner.nextInt();
            scanner.nextLine();

            Netflix netflixSeries = new NetflixSeriesImpl(size);

            for (int i = 0; i < size; i++) {
                NetflixSeriesDto seriesDto = new NetflixSeriesDto();

                System.out.println("\n--- Enter Netflix Series Details ---");

                System.out.print("Enter Series Title: ");
                seriesDto.setTitle(scanner.nextLine());

                System.out.print("Enter Genre: ");
                seriesDto.setGenre(scanner.nextLine());

                System.out.print("Enter Number of Seasons: ");
                seriesDto.setSeasons(scanner.nextInt());
                scanner.nextLine();

                System.out.print("Enter Rating (0.0 to 10.0): ");
                seriesDto.setRating(scanner.nextDouble());
                scanner.nextLine();

                System.out.print("Enter Director's Name: ");
                seriesDto.setDirector(scanner.nextLine());

                boolean added = netflixSeries.addSeries(seriesDto);
                if (!added) {
                    System.out.println("Could not add series. Please check input.");
                }
            }

            String input = null;
            do {
                System.out.println("\n--- Netflix Series Menu ---");
                System.out.println("1. Display All Series");
                System.out.println("2. Get Genre by Title");
                System.out.println("3. Get Number of Seasons by Title");
                System.out.println("4. Get Rating by Title");
                System.out.println("5. Update Rating by Title");
                System.out.println("6. Get Series Title by Director");


                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine();

                switch (option) {

                    case 1:
                        netflixSeries.getAllSeries();
                        break;

                    case 2:
                        System.out.print("Enter Series Title: ");
                        System.out.println("Genre: " + netflixSeries.getGenreByTitle(scanner.nextLine()));
                        break;

                    case 3:
                        System.out.print("Enter Series Title: ");
                        System.out.println("Seasons: " + netflixSeries.getSeasonsByTitle(scanner.nextLine()));
                        break;

                    case 4:
                        System.out.print("Enter Series Title: ");
                        System.out.println("Rating: " + netflixSeries.getRatingByTitle(scanner.nextLine()));
                        break;

                    case 5:
                        System.out.print("Enter Series Title to Update Rating: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter New Rating: ");
                        double newRating = scanner.nextDouble();
                        scanner.nextLine();
                        boolean updated = netflixSeries.updateRatingByTitle(title, newRating);
                        System.out.println("Rating updated: " + updated);
                        break;

                    case 6:
                        System.out.print("Enter Director Name: ");
                        System.out.println("Series Title: " + netflixSeries.getSeriesTitleByDirector(scanner.nextLine()));
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }

                System.out.print("\nDo you want to continue? (Y/N): ");
                input = scanner.nextLine();

            } while (input.equalsIgnoreCase("Y"));

            System.out.println("Thank you for using Netflix Series Manager!");
            scanner.close();
        }
}


