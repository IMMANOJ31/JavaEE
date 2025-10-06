package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazon.impl.AmazonImpl;
import com.xworkz.amazonapp.dto.ProductDto;

import java.util.Scanner;


public class AmazonRunner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of products to add: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Amazon amazon = new AmazonImpl(size);

        for (int i = 0; i < size; i++) {
            ProductDto product = new ProductDto();

            System.out.println("\nEnter details for Product " + (i + 1));

            System.out.print("ID: ");
            product.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Name: ");
            product.setName(scanner.nextLine());

            System.out.print("Brand: ");
            product.setBrand(scanner.nextLine());

            System.out.print("Category: ");
            product.setCategory(scanner.nextLine());

            System.out.print("Price: ");
            product.setPrice(scanner.nextDouble());

            System.out.print("Stock Count: ");
            product.setStockCount(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Description: ");
            product.setDescription(scanner.nextLine());

            boolean added = amazon.addProduct(product);
            if (!added) {
                System.out.println("Product could not be added.");
            }
        }

        String input;
        do {
            System.out.println("\n--- Amazon Product Menu ---");
            System.out.println("1. View All Products");
            System.out.println("2. Get Product Price by Name");
            System.out.println("3. Get Product Category by Name");
            System.out.println("4. Get Product Name by ID or Brand");
            System.out.println("5. Update Product Price by ID");
            System.out.println("6. Get Stock Count by Product Name");
            System.out.println("7. Get Brand by Product Name");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    amazon.getAllProducts();
                    break;
                case 2:
                    System.out.print("Enter Product Name: ");
                    System.out.println("Price: " + amazon.getProductPriceByName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter Product Name: ");
                    System.out.println("Category: " + amazon.getProductCategoryByName(scanner.nextLine()));
                    break;
                case 4:
                    System.out.print("Enter Product ID or Brand: ");
                    System.out.println("Product Name: " + amazon.getProductNameByIdOrBrand(scanner.nextLine()));
                    break;
                case 5:
                    System.out.print("Enter Product ID: ");
                    int id = scanner.nextInt();
                    System.out.print("Enter New Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    boolean updated = amazon.updateProductPriceById(id, price);
                    System.out.println("Price updated: " + updated);
                    break;
                case 6:
                    System.out.print("Enter Product Name: ");
                    System.out.println("Stock: " + amazon.getStockCountByProductName(scanner.nextLine()));
                    break;
                case 7:
                    System.out.print("Enter Product Name: ");
                    System.out.println("Brand: " + amazon.getBrandByProductName(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Invalid Option");
            }

            System.out.print("\nDo you want to continue? (Y/N): ");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("Y"));

        System.out.println("Thank you......");
        scanner.close();
    }
}
