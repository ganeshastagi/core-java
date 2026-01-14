package com.OOPS.Inheritance;

public class OverRiding {
    public static void main(String[] args) {

        // Overriding a method is redefining or editing the method in child that is already present in the parent class
        // and has same name, parameters, and same return type.

        Dog d = new Dog();
        System.out.println(d.name);
        d.makeSound();
    }
}

class Animal {
    String name;

    public void makeSound() {
        System.out.println("Make sound!");
    }
}

class Dog extends Animal{
    String type;
    String name;

    Dog() {
        name = "Tommy";
    }
    public void makeSound() {
        System.out.println("Bark!");
    }
}