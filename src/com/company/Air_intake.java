package com.company;

public class Air_intake extends CarDecorator {

    Car mCar;

    Air_intake(Car car) {
        mCar = car;
    }

    @Override
    public String getCarInfo() {
        return mCar.getCarInfo() + " с воздухозаборником";
    }

    @Override
    public int getPrice() {
        return mCar.getPrice() + 3;
    }
}
