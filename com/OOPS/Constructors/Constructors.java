package com.OOPS.Constructors;

public class Constructors {
    public static void main(String[] args) {
        // A Constructor is a special method in Java which is mainly used for initializing the object's data without initializing
        // in the main method.
        Student s = new Student();
        Student s1 = new Student();
        System.out.println(s.name + " " + s.age);
        System.out.println(s1.name + " " + s1.age);
        s1.name = "Ganesh";
        s1.age = 40;
        System.out.println(s1.name + " " + s1.age);


    }
}

class Student {
    String name;
    int age;

    Student() {
        System.out.println("Default constructor");
        name = "Boss";
        age = 30;
    }
}
