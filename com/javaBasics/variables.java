package com.javaBasics;

public class variables {
    public static void main(String[] args) {
        int a;              // Declare a variable
        a = 200;            // Initialize a variable
        System.out.println(a);

        VarTypes.num1 = 10;
        VarTypes v = new VarTypes();
        v.num1 = 11;
        System.out.println(v.num1);
        VarTypes v2 = new VarTypes();
        v2.num1 = 12;
        System.out.println(v2.num1);
        VarTypes v3 = new VarTypes();
        System.out.println(v3.num1);

    }
}

class VarTypes {
    int num;            // Instance Variables - These are inside a class but outside the method.
    static int num1;    // Static Variables are also inside a class, but they have static keyword in them, these are only belong to
                        // class not the objects. These can be accessed with a class name

    void display(int s) {
        System.out.println(s);
    }
}