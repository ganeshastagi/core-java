package com.OOPS.InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        //An anonymous inner class is used once in an object directly instead of creating a new class and inheriting
        // a parent class.

        Laptop obj = new Laptop() {               // Anonymous inner class in the object creation.
            int price = 3000;
            public void display() {
                System.out.println(price);
            }
        };
        obj.display();
    }
}

class Laptop {
    int price = 1000;

    public void display() {
        System.out.println(price);
    }

}