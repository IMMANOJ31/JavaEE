package com.xworkz.mall.mall.impl;

import com.xworkz.mall.dto.ShopDto;
import com.xworkz.mall.mall.Mall;



public class MallImpl implements Mall {

    private ShopDto[] shops;
    int index;

    public MallImpl(int size) {
        shops = new ShopDto[size];
    }

    @Override
    public boolean addShop(ShopDto dto) {
        if (dto != null && dto.getId() > 0) {
            shops[index++] = dto;
            return true;
        }
        return false;
    }

    @Override
    public void getAllShops() {
        for (ShopDto dto : shops) {
            if (dto != null) {
                System.out.println(dto);
            }
        }
    }

    @Override
    public String getShopOwnerByShopName(String shopName) {
        for (ShopDto dto : shops) {
            if (dto != null && dto.getShopName().equalsIgnoreCase(shopName)) {
                return dto.getOwnerName();
            }
        }
        return null;
    }

    @Override
    public String getShopTypeByName(String shopName) {
        for (ShopDto dto : shops) {
            if (dto != null && dto.getShopName().equalsIgnoreCase(shopName)) {
                return dto.getShopType();
            }
        }
        return null;
    }

    @Override
    public int getShopFloorByName(String shopName) {
        for (ShopDto dto : shops) {
            if (dto != null && dto.getShopName().equalsIgnoreCase(shopName)) {
                return dto.getFloorNumber();
            }
        }
        return -1;
    }

    @Override
    public String getShopNameByOwnerContact(String contact) {
        for (ShopDto dto : shops) {
            if (dto != null && dto.getOwnerContact().equals(contact)) {
                return dto.getShopName();
            }
        }
        return null;
    }

    @Override
    public boolean updateShopFloorById(int id, int newFloor) {
        for (ShopDto dto : shops) {
            if (dto != null && dto.getId() == id) {
                dto.setFloorNumber(newFloor);
                return true;
            }
        }
        return false;
    }

    @Override
    public String getOpeningTimeByShopName(String shopName) {
        for (ShopDto dto : shops) {
            if (dto != null && dto.getShopName().equalsIgnoreCase(shopName)) {
                return dto.getOpeningTime();
            }
        }
        return null;
    }
}

