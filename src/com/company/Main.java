package com.company;

public class Main {

    public static void main(String[] args) {
        Car Nissan = new Nissan();
        Nissan = new Spoiler(Nissan);
        Nissan = new Air_intake(Nissan);

        Car Toyota = new Toyota();
        Toyota = new Air_intake(Toyota);

        System.out.println(Nissan.getCarInfo() +" Цена: "+ Nissan.getPrice());
        System.out.println(Toyota.getCarInfo() +" Цена: "+ Toyota.getPrice());
    }
}
