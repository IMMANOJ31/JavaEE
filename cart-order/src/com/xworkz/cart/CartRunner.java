package com.xworkz.cart;

import com.xworkz.cart.cart.Cart;
import com.xworkz.cart.cart.impl.CartImpl;
import com.xworkz.cart.dto.OrderDto;

import java.util.Scanner;

public class CartRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of orders to place: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        Cart cart = new CartImpl(size);

        for (int i = 0; i < size; i++) {
            OrderDto dto = new OrderDto();

            System.out.println("\nEnter details for Order " + (i + 1));

            System.out.print("Order ID: ");
            dto.setOrderId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Customer Name: ");
            dto.setCustomerName(scanner.nextLine());

            System.out.print("Email: ");
            dto.setEmail(scanner.nextLine());

            System.out.print("Product Name: ");
            dto.setProductName(scanner.nextLine());

            System.out.print("Quantity: ");
            dto.setQuantity(scanner.nextInt());

            System.out.print("Price: ");
            dto.setPrice(scanner.nextDouble());
            scanner.nextLine();

            System.out.print("Order Status: ");
            dto.setStatus(scanner.nextLine());

            boolean added = cart.addOrder(dto);
            if (!added) {
                System.out.println("Failed to add order!");
            }
        }

        String choice;
        do {
            System.out.println("\n--- Cart Menu ---");
            System.out.println("1. View All Orders");
            System.out.println("2. Get Price by Product Name");
            System.out.println("3. Get Customer Name by Order ID");
            System.out.println("4. Update Order Quantity by ID");
            System.out.println("5. Get Product by Customer Email");
            System.out.println("6. Update Order Status by ID");
            System.out.println("7. Get Order Status by Product Name");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    cart.getAllOrders();
                    break;
                case 2:
                    System.out.print("Enter Product Name: ");
                    System.out.println("Price: " + cart.getOrderPriceByProductName(scanner.nextLine()));
                    break;
                case 3:
                    System.out.print("Enter Order ID: ");
                    System.out.println("Customer: " + cart.getCustomerNameByOrderId(scanner.nextInt()));
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.print("Enter Order ID: ");
                    int orderId = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Updated: " + cart.updateOrderQuantityById(orderId, quantity));
                    break;
                case 5:
                    System.out.print("Enter Customer Email: ");
                    System.out.println("Product: " + cart.getProductNameByCustomerEmail(scanner.nextLine()));
                    break;
                case 6:
                    System.out.print("Enter Order ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Status: ");
                    System.out.println("Updated: " + cart.updateOrderStatusById(id, scanner.nextLine()));
                    break;
                case 7:
                    System.out.print("Enter Product Name: ");
                    System.out.println("Status: " + cart.getOrderStatusByProductName(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Invalid option!");
            }

            System.out.print("Do you want to Continue? (Y/N): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));

        System.out.println("Thank you........");
        scanner.close();
    }
}
