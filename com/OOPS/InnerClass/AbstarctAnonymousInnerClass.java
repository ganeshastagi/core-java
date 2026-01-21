package com.OOPS.InnerClass;

public class AbstarctAnonymousInnerClass {
    public static void main(String[] args) {

        // Defining the content of the abstract class via anonymous inner class

        Computer obj = new Computer() {
            public void Laptop() {
                System.out.println("This is a Laptop");
            }
        };
        obj.Laptop();

    }
}

abstract class Computer {

    public abstract void Laptop();
}