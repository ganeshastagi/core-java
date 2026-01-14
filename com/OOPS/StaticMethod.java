package com.OOPS;

public class StaticMethod {
    public static void main(String[] args) {
        // Static methods in a class belongs to the class and can be accessed by using class name.
        // You don't have to create an object to access static methods.
        // By default, static methods accept only static variables and won't accept instance variables
        // If you want to access instance variables, then have to pass the object to the static method to recognize the instance
        // variables, because object holds the values of instance variables.

        Students s1 = new Students();
        s1.name = "Sheldon";
        s1.marks = 95;

        Students s2 = new Students();
        s2.name = "Leonard";
        s2.marks = 98;

        Students.sec = " Sec 2";
        Students.display(s1);
        Students.display(s2);
    }
}

class Students {
    String name;
    int marks;
    static String sec;

    static void display(Students obj) {
        System.out.println("Name: "+ obj.name + " Marks: "+ obj.marks + " Section: " + sec);
    }
}