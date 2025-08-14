package com.OOPS;

public class Encapsulation {
    public static void main(String[] args) {
        // Encapsulation means hiding the data in the class and providing the controlled access through methods.
        // Make the instance variables private
        // provide public getter and setter methods.


        // Example without encapsulation
//        Human h1 = new Human();
//        h1.name = "Ganesh";
//        h1.age = 23;
//
//        System.out.println("Name : " + h1.name + " Age: " + h1.age);
//
//        // Anybody can just update the age directly
//        h1.age = 28;
//        System.out.println("Name : " + h1.name + " Age: " + h1.age);

        // With Encapsulation
        Human h2 = new Human();
        h2.getName();
        h2.getAge();
        System.out.println(h2.getName() + " " + h2.getAge());

        // Set the values of variables through set methods.

        h2.setName("Harsoor");
        h2.setAge(25);
        System.out.println(h2.getName() + " " + h2.getAge());

    }
}

class Human{
    private String name;        // By making the instance variables private, we can restrict the access outside of class
    private int age;

    // To get the above variable values, one have to access through get methods.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}