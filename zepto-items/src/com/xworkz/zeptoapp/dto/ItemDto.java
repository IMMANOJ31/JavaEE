package com.xworkz.zeptoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class ItemDto {

    private int id;
    private String name;
    private String category;
    private double price;
    private int stock;
    private String barcode;


}
