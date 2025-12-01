package com.javaBasics;

public class Operators {
    public static void main (String[] args) {
        // Arithmetic com.javaBasics.Operators - +, -, *, /, %, +=, -=, *=, /=, ++, --
        int a = 15;
        int b = 20;
        int result = a+b;
        System.out.println(result);
        result += 12;
        System.out.println(result);

        //Relational com.javaBasics.Operators - ==, !=, <, >, <=, >=
        int x = 10;
        int y = 20;
        boolean z = x != y;
        System.out.println(z);

        //Bitwise com.javaBasics.Operators - &, |, &&, ||, !
        if(x > 5 || y > 7)
        {
            System.out.println("Ohoo! I started");
        }

        if(x < 5 && y > 7)
        {
            System.out.println("Thank you!");
        }
    }
}
