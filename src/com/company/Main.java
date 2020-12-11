package com.company;

import com.controller.DataController;
import com.interfaces.Customer;
import com.interfaces.ProductModel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ProductModel> cart = DataController.loadData();
        Customer customer = DataController.getCustomer();
        DataController.processCustomerData(customer, cart);
    }
}
