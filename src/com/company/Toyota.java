package com.company;

public class Toyota extends Car {

    public Toyota() {
        carInfo = "Toyota";
    }

    @Override
    public int getPrice() {
        return 200;
    }
}