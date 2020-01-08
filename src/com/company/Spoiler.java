package com.company;

public class Spoiler extends CarDecorator {

    Car mCar;

    Spoiler(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + " Со спойлером";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 1;
    }
}
