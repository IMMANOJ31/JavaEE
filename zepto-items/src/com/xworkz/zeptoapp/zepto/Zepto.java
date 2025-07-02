package com.xworkz.zeptoapp.zepto;


import com.xworkz.zeptoapp.dto.ItemDto;


public interface Zepto {

    boolean addItem(ItemDto dto);

    void getAllItems();

    double getPriceByItemName(String name);

    String getCategoryByItemName(String name);

    String getItemNameByIdOrBarcode(String idOrBarcode);

    boolean updatePriceById(int id, double newPrice);

    int getStockByItemName(String name);

    boolean updateStockById(int id, int newStock);
}

