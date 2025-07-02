package com.xworkz.amazonapp.amazon;


import com.xworkz.amazonapp.dto.ProductDto;


public interface Amazon {

    boolean addProduct(ProductDto dto);

    void getAllProducts();

    double getProductPriceByName(String name);

    String getProductCategoryByName(String name);

    String getProductNameByIdOrBrand(String idOrBrand);

    boolean updateProductPriceById(int id, double newPrice);

    int getStockCountByProductName(String name);

    String getBrandByProductName(String name);
}
