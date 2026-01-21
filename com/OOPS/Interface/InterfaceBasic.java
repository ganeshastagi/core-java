package com.OOPS.Interface;

public class InterfaceBasic {
    public static void main(String[] args) {

        // An interface is a design for a class on how a class must not how it works.

        Animal obj;

        obj = new Dog();
        obj.sound();
        obj.type();
        System.out.println(Animal.age);

        obj = new Cat();
        obj.sound();
        obj.type();
        System.out.println(Animal.age);
    }
}

interface Animal {
    int age = 13;                                   // By default, it is final and static.
    void sound();                                   // By default, it is public and abstract
    void type();

}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark!");
    }

    @Override
    public void type() {
        System.out.println("Golden Retriever");
    }
}

class Cat implements Animal {


    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void type() {
        System.out.println("English kitty");
    }
}
