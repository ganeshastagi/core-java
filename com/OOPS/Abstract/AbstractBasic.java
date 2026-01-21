package com.OOPS.Abstract;

public class AbstractBasic {
    public static void main(String[] args) {

        // An abstract is a keyword used to represent the unfinished method or incomplete method.

        Car obj = new toyotaTundra();
        obj.drive();
        obj.playMusic();

    }
}

abstract class Car {                                    // abstract class can only have abstract methods
    private int price;
    private String model;

    public abstract void drive();                       // An abstract method

    public void playMusic() {
        System.out.println("Playing music....");
    }
}

class toyotaTundra extends Car{

    public void drive() {                                  // You have to define the abstract method first
        System.out.println("Driving....");
    }

}