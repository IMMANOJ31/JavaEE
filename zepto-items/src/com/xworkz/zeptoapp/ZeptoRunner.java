package com.xworkz.zeptoapp;

import com.xworkz.zeptoapp.dto.ItemDto;
import com.xworkz.zeptoapp.zepto.Zepto;
import com.xworkz.zeptoapp.zepto.impl.ZeptoImpl;

import java.util.Scanner;

public class ZeptoRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items to add: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Zepto zepto = new ZeptoImpl(size);

        for (int i = 0; i < size; i++) {
            ItemDto item = new ItemDto();

            System.out.println("\nEnter details for item " + (i + 1));
            System.out.print("ID: ");
            item.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Name: ");
            item.setName(scanner.nextLine());

            System.out.print("Category: ");
            item.setCategory(scanner.nextLine());

            System.out.print("Price: ");
            item.setPrice(scanner.nextDouble());

            System.out.print("Stock: ");
            item.setStock(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Barcode: ");
            item.setBarcode(scanner.nextLine());

            boolean added = zepto.addItem(item);
            if (!added) {
                System.out.println("Failed to add item.");
            }
        }

        String input;
        do {
            System.out.println("\n--- Zepto Menu ---");
            System.out.println("1. View All Items");
            System.out.println("2. Get Price by Item Name");
            System.out.println("3. Get Category by Item Name");
            System.out.println("4. Get Item Name by ID/Barcode");
            System.out.println("5. Update Price by ID");
            System.out.println("6. Get Stock by Item Name");
            System.out.println("7. Update Stock by ID");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    zepto.getAllItems();
                    break;
                case 2:
                    System.out.print("Enter Item Name: ");
                    System.out.println("Price: " + zepto.getPriceByItemName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter Item Name: ");
                    System.out.println("Category: " + zepto.getCategoryByItemName(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Enter ID or Barcode: ");
                    System.out.println("Item Name: " + zepto.getItemNameByIdOrBarcode(scanner.nextLine()));
                    break;
                case 5:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    boolean updatedPrice = zepto.updatePriceById(id, price);
                    System.out.println("Price Updated: " + updatedPrice);
                    break;
                case 6:
                    System.out.print("Enter Item Name: ");
                    System.out.println("Stock: " + zepto.getStockByItemName(scanner.nextLine()));
                    break;
                case 7:
                    System.out.print("Enter ID: ");
                    int stockId = scanner.nextInt();
                    System.out.print("Enter New Stock: ");
                    int stock = scanner.nextInt();
                    scanner.nextLine();
                    boolean updatedStock = zepto.updateStockById(stockId, stock);
                    System.out.println("Stock Updated: " + updatedStock);
                    break;
                default:
                    System.out.println("Invalid Option.");
            }

            System.out.print("Do you want to Continue? (Y/N): ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("Y"));

        System.out.println("Thank you........");
        scanner.close();
    }
}
