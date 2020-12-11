package com.model;

import com.interfaces.Customer;
import com.interfaces.DigitalProduct;

public class DigitalProductModel implements DigitalProduct {

    private final String title;
    private int totalDownloadsLeft = 2;
    private boolean isOrderCompleted;
    private String shippingInfo;

    public DigitalProductModel(String title) {
        this.title = title;
    }

    public void ShipItem(Customer customer) {
        StringBuilder sb = new StringBuilder();
        if (!isOrderCompleted){
            sb.append("simulating emailing '").append(title).append("' to ").append(customer.getEmail());
            totalDownloadsLeft--;
            if (totalDownloadsLeft < 1){
                isOrderCompleted = true;
                totalDownloadsLeft = 0;
            }
        }else{
            sb.append("your '").append(title).append("' order is completed. You have ").append(totalDownloadsLeft).append(" downloads left.");
        }
        shippingInfo = sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public int getTotalDownloadsLeft() {
        return totalDownloadsLeft;
    }

    public boolean isOrderCompleted() {
        return isOrderCompleted;
    }

    public String getShippingInfo() {
        return shippingInfo;
    }
}
