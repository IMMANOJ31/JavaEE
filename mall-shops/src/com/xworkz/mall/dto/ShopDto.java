package com.xworkz.mall.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopDto {

    private int id;
    private String shopName;
    private String ownerName;
    private String ownerContact;
    private String shopType;
    private int floorNumber;
    private String openingTime;

}
