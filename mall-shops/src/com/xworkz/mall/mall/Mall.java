package com.xworkz.mall.mall;

import com.xworkz.mall.dto.ShopDto;

public interface Mall {

    boolean addShop(ShopDto dto);

    void getAllShops();

    String getShopOwnerByShopName(String shopName);

    String getShopTypeByName(String shopName);

    int getShopFloorByName(String shopName);

    String getShopNameByOwnerContact(String contact);

    boolean updateShopFloorById(int id, int newFloor);

    String getOpeningTimeByShopName(String shopName);
}

