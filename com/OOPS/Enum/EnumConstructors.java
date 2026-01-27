package com.OOPS.Enum;

public class EnumConstructors {
    public static void main(String[] args) {

        //enums can have constructors, variables, methods
        Laptop lap = Laptop.MacBook;

        // for single value in the enum
        System.out.println(lap + " :" + lap.getPrice());

        // for the whole enum
        for(Laptop lp : Laptop.values()) {
            System.out.println(lp + " :" + lp.getPrice());
        }

    }
}

enum Laptop {
    MacBook (1200), ThinkPad (800), Surface (1500);         // Objects of enums

    private int price;

    Laptop(int price) {                                         // Constructor for the objects
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
