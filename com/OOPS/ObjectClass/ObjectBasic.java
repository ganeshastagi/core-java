package com.OOPS.ObjectClass;

public class ObjectBasic {
    public static void main(String[] args) {

        // Object class is the root class of all classes in Java. Every class in Java automatically inherit Object class
        // even if you don't mention it.

        Laptop obj = new Laptop();
        obj.price = 1000;
        obj.model = "MacBook";

        Laptop obj1 = new Laptop();
        obj1.price = 1000;
        obj1.model = "MacBook";

        System.out.println(obj.toString());    // A method in Object class to return the string of an object.
                                                // It returns the hashcode of the object.
        System.out.println(obj.equals(obj1));   //  Compare object content if override otherwise memory reference.
        System.out.println(obj == obj1);        // Compare memory reference
    }
}


class Laptop {
        int price;
        String model;

        public Boolean equals (Laptop that) {
            return this.price == that.price && this.model.equals(that.model);
        }
}

