package com.xworkz.cart.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private int orderId;
    private String customerName;
    private String email;
    private String productName;
    private int quantity;
    private double price;
    private String status;

}
