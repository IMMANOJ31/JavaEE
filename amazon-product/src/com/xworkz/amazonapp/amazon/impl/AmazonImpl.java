package com.xworkz.amazonapp.amazon.impl;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.dto.ProductDto;



public class AmazonImpl implements Amazon {

    private ProductDto[] products;
    int index;

    public AmazonImpl(int size) {
        products = new ProductDto[size];
    }

    @Override
    public boolean addProduct(ProductDto dto) {
        if (dto != null && dto.getId() > 0 && dto.getName() != null) {
            products[index++] = dto;
            return true;
        }
        System.out.println("Invalid Product Details");
        return false;
    }

    @Override
    public void getAllProducts() {
        System.out.println("----- All Available Products -----");
        for (ProductDto product : products) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }

    @Override
    public double getProductPriceByName(String name) {
        for (ProductDto product : products) {
            if (product != null && product.getName().equalsIgnoreCase(name)) {
                return product.getPrice();
            }
        }
        System.out.println("Product not found");
        return 0;
    }

    @Override
    public String getProductCategoryByName(String name) {
        for (ProductDto product : products) {
            if (product != null && product.getName().equalsIgnoreCase(name)) {
                return product.getCategory();
            }
        }
        return null;
    }

    @Override
    public String getProductNameByIdOrBrand(String idOrBrand) {
        String productName =  null;
        if (idOrBrand != null && !idOrBrand.isEmpty())
        for (ProductDto product : products) {
            if(product.getBrand().equalsIgnoreCase(idOrBrand)){
                productName = product.getName();
            }
            else if (product.getId() == Long.parseLong(idOrBrand)) {
                productName = product.getName();
            }
        }else System.out.println("Invalid Details!!!!!!!");
        return productName;
    }

    @Override
    public boolean updateProductPriceById(int id, double newPrice) {
        for (ProductDto product : products) {
            if (product != null && product.getId() == id) {
                product.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    @Override
    public int getStockCountByProductName(String name) {
        for (ProductDto product : products) {
            if (product != null && product.getName().equalsIgnoreCase(name)) {
                return product.getStockCount();
            }
        }
        return 0;
    }

    @Override
    public String getBrandByProductName(String name) {
        for (ProductDto product : products) {
            if (product != null && product.getName().equalsIgnoreCase(name)) {
                return product.getBrand();
            }
        }
        return null;
    }
}
