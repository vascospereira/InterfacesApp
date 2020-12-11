package com.controller;

import com.interfaces.Customer;
import com.interfaces.DigitalProduct;
import com.interfaces.ProductModel;
import com.model.CustomerModel;
import com.model.DigitalProductModel;
import com.model.PhysicalProductModel;
import com.view.CustomerCart;

import java.util.ArrayList;

public class DataController {

    public static void processCustomerData(Customer customer, ArrayList<ProductModel> cart) {
        for (ProductModel prod : cart){
            prod.ShipItem(customer);
            CustomerCart.show(prod.getShippingInfo());
            if (prod instanceof DigitalProduct && !prod.isOrderCompleted()){
                DigitalProduct digitalProduct = (DigitalProduct) prod;
                CustomerCart.show("for the '" + digitalProduct.getTitle() + "' you have " + digitalProduct.getTotalDownloadsLeft() + " downloads left.");
            }
        }
    }

    public static Customer getCustomer(){
        return new CustomerModel("Vasco", "Pereira", "Dresden", "vp@iwu.de", "912448312");
    }

    public static ArrayList<ProductModel> loadData() {
        ArrayList<ProductModel> output = new ArrayList<>();
        //output.add(new PhysicalProductModel("Spider-man T-Shirt"));
        output.add(new PhysicalProductModel("Hulk sweatshirt"));
        ProductModel pp = new PhysicalProductModel("Batman Polo");
        output.add(pp);
        output.add(pp);
        //output.add(new DigitalProductModel("Beat series"));
        DigitalProduct dp = new DigitalProductModel("Java classes");
        output.add(dp);
        output.add(dp);
        output.add(dp);
        //output.add(new DigitalProductModel("Taxes application"));
        return output;
    }

}
