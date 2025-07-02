package com.xworkz.cart.cart;

import com.xworkz.cart.dto.OrderDto;


public interface Cart {

    boolean addOrder(OrderDto dto);

    void getAllOrders();

    double getOrderPriceByProductName(String productName);

    String getCustomerNameByOrderId(int orderId);

    boolean updateOrderQuantityById(int orderId, int newQuantity);

    String getProductNameByCustomerEmail(String email);

    boolean updateOrderStatusById(int orderId, String newStatus);

    String getOrderStatusByProductName(String productName);
}

