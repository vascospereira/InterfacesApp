package com.interfaces;

public interface ProductModel {
    String getTitle();
    boolean isOrderCompleted();
    void ShipItem(Customer customer);
    String getShippingInfo();
}
