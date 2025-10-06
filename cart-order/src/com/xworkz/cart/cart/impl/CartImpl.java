package com.xworkz.cart.cart.impl;

import com.xworkz.cart.cart.Cart;
import com.xworkz.cart.dto.OrderDto;


public class CartImpl implements Cart {

    private OrderDto[] orders;
    int index;

    public CartImpl(int size) {
        orders = new OrderDto[size];
    }

    @Override
    public boolean addOrder(OrderDto dto) {
        if (dto != null && dto.getOrderId() > 0 && dto.getProductName() != null) {
            orders[index++] = dto;
            return true;
        }
        System.out.println("Invalid order details");
        return false;
    }

    @Override
    public void getAllOrders() {
        for (OrderDto dto : orders) {
            if (dto != null) {
                System.out.println(dto);
            }
        }
    }

    @Override
    public double getOrderPriceByProductName(String productName) {
        for (OrderDto dto : orders) {
            if (dto != null && dto.getProductName().equalsIgnoreCase(productName)) {
                return dto.getPrice();
            }
        }
        return 0.0;
    }

    @Override
    public String getCustomerNameByOrderId(int orderId) {
        for (OrderDto dto : orders) {
            if (dto != null && dto.getOrderId() == orderId) {
                return dto.getCustomerName();
            }
        }
        return null;
    }

    @Override
    public boolean updateOrderQuantityById(int orderId, int newQuantity) {
        for (OrderDto dto : orders) {
            if (dto != null && dto.getOrderId() == orderId) {
                dto.setQuantity(newQuantity);
                return true;
            }
        }
        return false;
    }

    @Override
    public String getProductNameByCustomerEmail(String email) {
        for (OrderDto dto : orders) {
            if (dto != null && dto.getEmail().equalsIgnoreCase(email)) {
                return dto.getProductName();
            }
        }
        return null;
    }

    @Override
    public boolean updateOrderStatusById(int orderId, String newStatus) {
        for (OrderDto dto : orders) {
            if (dto != null && dto.getOrderId() == orderId) {
                dto.setStatus(newStatus);
                return true;
            }
        }
        return false;
    }

    @Override
    public String getOrderStatusByProductName(String productName) {
        for (OrderDto dto : orders) {
            if (dto != null && dto.getProductName().equalsIgnoreCase(productName)) {
                return dto.getStatus();
            }
        }
        return null;
    }
}
