package com.OOPS;

public class AnonymousObjects {
    public static void main(String[] args) {
        // Anonymous objects are useful only when you want to call it once.

        new Car().display();
        System.out.println(new Car().name);
    }
}

class Car {

    String name;

    Car() {
        name = "Honda";
    }

    void display() {
        System.out.println("Welcome to Japan");
    }
}
