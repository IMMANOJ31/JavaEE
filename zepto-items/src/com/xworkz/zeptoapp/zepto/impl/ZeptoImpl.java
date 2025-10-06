package com.xworkz.zeptoapp.zepto.impl;

import com.xworkz.zeptoapp.dto.ItemDto;
import com.xworkz.zeptoapp.zepto.Zepto;


public class ZeptoImpl implements Zepto {

    private ItemDto[] items;
    private int index;

    public ZeptoImpl(int size) {
        items = new ItemDto[size];
    }

    @Override
    public boolean addItem(ItemDto dto) {
        if (dto != null && dto.getId() > 0 && dto.getName() != null) {
            items[index++] = dto;
            return true;
        }
        System.out.println("Invalid item data!");
        return false;
    }

    @Override
    public void getAllItems() {
        System.out.println("---- Zepto Items List ----");
        for (ItemDto item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public double getPriceByItemName(String name) {
        for (ItemDto item : items) {
            if (item != null && item.getName().equalsIgnoreCase(name)) {
                return item.getPrice();
            }
        }
        return 0;
    }

    @Override
    public String getCategoryByItemName(String name) {
        for (ItemDto item : items) {
            if (item != null && item.getName().equalsIgnoreCase(name)) {
                return item.getCategory();
            }
        }
        return null;
    }

    @Override
    public String getItemNameByIdOrBarcode(String idOrBarcode) {
        String itemName = null;
        if (idOrBarcode != null && !idOrBarcode.isEmpty()) {
            for (ItemDto itemDto : items) {
                if(itemDto.getBarcode().equalsIgnoreCase(idOrBarcode)){
                    itemName = itemDto.getName();
                }
                else if (itemDto.getId() == Long.parseLong(idOrBarcode)) {
                    itemName = itemDto.getName();
                }

            }
        }else System.out.println("Invalid Details!!!!!!!");
        return itemName;
    }

    @Override
    public boolean updatePriceById(int id, double newPrice) {
        for (ItemDto item : items) {
            if (item != null && item.getId() == id) {
                item.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    @Override
    public int getStockByItemName(String name) {
        for (ItemDto item : items) {
            if (item != null && item.getName().equalsIgnoreCase(name)) {
                return item.getStock();
            }
        }
        return 0;
    }

    @Override
    public boolean updateStockById(int id, int newStock) {
        for (ItemDto item : items) {
            if (item != null && item.getId() == id) {
                item.setStock(newStock);
                return true;
            }
        }
        return false;
    }
}

