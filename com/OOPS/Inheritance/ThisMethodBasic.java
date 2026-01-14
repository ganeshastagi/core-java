package com.OOPS.Inheritance;

public class ThisMethodBasic {
    public static void main(String[] args) {

        // this() is used to call the constructor of the same class while super() calls the constructor of parent class

        BC obj = new BC(6);

    }
}

class AB {
    AB() {
        System.out.println("Parent class default constructor.");
    }

    AB(int n) {
        System.out.println("Parent class parameterised constructor");
    }
}

class BC extends AB {
    BC() {
        System.out.println("Child class default constructor.");
    }

    BC(int n) {
        this();
        System.out.println("Child class parameterised constructor");
    }
}