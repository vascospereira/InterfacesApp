package com.model;

import com.interfaces.Customer;
import com.interfaces.ProductModel;

public class PhysicalProductModel implements ProductModel {

    private final String title;
    private boolean isOrderCompleted;
    private String shippingInfo;

    public PhysicalProductModel(String title) {
        this.title = title;
    }

    public void ShipItem(Customer customer) {
        StringBuilder sb = new StringBuilder();
        if (!isOrderCompleted){
            isOrderCompleted = true;
            sb.append("simulating shipping '").append(title).append("' to ").append(customer.getFirstName()).append(" in ").append(customer.getCity());
        }else{
            sb.append("your product order for '").append(title).append("' is completed.");
        }
        shippingInfo = sb.toString();
    }

    public String getShippingInfo() {
        return shippingInfo;
    }

    public String getTitle() {
        return title;
    }

    public boolean isOrderCompleted() {
        return isOrderCompleted;
    }
}
