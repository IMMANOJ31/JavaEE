package com.xworkz.amazonapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductDto {

    private int id;
    private String name;
    private String brand;
    private String category;
    private double price;
    private int stockCount;
    private String description;


}
