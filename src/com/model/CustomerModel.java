package com.model;

import com.interfaces.Customer;

public class CustomerModel implements Customer {

    private final String firstName;
    private final String lastName;
    private final String city;
    private final String email;
    private final String phoneNumber;

    public CustomerModel(String firstName, String lastName, String city, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

}

