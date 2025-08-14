package com.OOPS.Constructors;

public class DefaultParam {
    public static void main(String[] args) {
        // By Default, the JVM will create a constructor when an object is created.
        // We can also parameterize constructor
        // A constructor can be overloaded.

        Human h = new Human();
        h.display();
        Human h1 = new Human("Haha", 35);
        h1.display();

    }
}

class Human {
    String name;
    int age;

    Human() {
        System.out.println("Default Constructor");
        name = "Human";
        age = 34;
    }

    Human(String name, int age) {
        System.out.println("Parameterized Constructor");
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + " Age: " + age);
    }
}
