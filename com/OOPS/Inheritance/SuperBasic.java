package com.OOPS.Inheritance;

public class SuperBasic {
    public static void main(String[] args) {

        // Super() keyword is used to call the parent class members like variables, methods, constructors, etc.
        //  Even if you don't mention, by default every constructor will have a super()

//        B obj = new B();
//        obj.display();

        Child obj = new Child(5);

    }
}


// Example 1: When parent and child has similar variables then super is used to call the parent class.

class A {
    int a = 10;
}

class B extends A {
    int a = 20;

    void display() {
        System.out.println(super.a);
    }
}

// Example 2: Super() using constructor

class Parent {

    Parent() {
        System.out.println("Parent constructor");
    }

    Parent(int n) {
        System.out.println("Parent Constructor with parameter.");
    }

}

class Child extends Parent {

    Child () {
        super(5);
        System.out.println("Child Constructor");
    }

    Child(int n) {
        System.out.println("Child Constructor with Parameter.");
    }
}