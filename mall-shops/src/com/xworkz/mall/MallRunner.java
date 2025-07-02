package com.xworkz.mall;

import com.xworkz.mall.dto.ShopDto;
import com.xworkz.mall.mall.Mall;
import com.xworkz.mall.mall.impl.MallImpl;

import java.util.Scanner;

public class MallRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of shops to add: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Mall mall = new MallImpl(size);

        for (int i = 0; i < size; i++) {
            ShopDto dto = new ShopDto();

            System.out.println("\n--- Enter Shop Details ---");
            System.out.print("ID: ");
            dto.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Shop Name: ");
            dto.setShopName(scanner.nextLine());

            System.out.print("Owner Name: ");
            dto.setOwnerName(scanner.nextLine());

            System.out.print("Owner Contact: ");
            dto.setOwnerContact(scanner.nextLine());

            System.out.print("Shop Type: ");
            dto.setShopType(scanner.nextLine());

            System.out.print("Floor Number: ");
            dto.setFloorNumber(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Opening Time: ");
            dto.setOpeningTime(scanner.nextLine());

            boolean added = mall.addShop(dto);
            if (!added) {
                System.out.println("Failed to add shop!");
            }
        }

        String input;
        do {
            System.out.println("\n--- Mall---");
            System.out.println("1. Show all shops");
            System.out.println("2. Get shop owner by name");
            System.out.println("3. Get shop type by name");
            System.out.println("4. Get shop floor by name");
            System.out.println("5. Get shop name by owner contact");
            System.out.println("6. Update floor by ID");
            System.out.println("7. Get opening time by shop name");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    mall.getAllShops();
                    break;
                case 2:
                    System.out.print("Enter shop name: ");
                    System.out.println("Owner: " + mall.getShopOwnerByShopName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter shop name: ");
                    System.out.println("Type: " + mall.getShopTypeByName(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Enter shop name: ");
                    System.out.println("Floor: " + mall.getShopFloorByName(scanner.nextLine()));
                    break;
                case 5:
                    System.out.print("Enter owner contact: ");
                    System.out.println("Shop Name: " + mall.getShopNameByOwnerContact(scanner.nextLine()));
                    break;
                case 6:
                    System.out.print("Enter shop ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter new floor number: ");
                    int floor = scanner.nextInt();
                    scanner.nextLine();
                    boolean updated = mall.updateShopFloorById(id, floor);
                    System.out.println("Floor updated: " + updated);
                    break;
                case 7:
                    System.out.print("Enter shop name: ");
                    System.out.println("Opening Time: " + mall.getOpeningTimeByShopName(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Do you want to Continue? (Y/N): ");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("Y"));

        System.out.println("Thank you...........");
        scanner.close();
    }
}
