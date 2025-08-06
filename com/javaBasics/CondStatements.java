package com.javaBasics;

public class CondStatements {
    public static void main (String[] args) {
        //Conditional statements include if, if else, if, else if, else
        // These checks for true or false
        int a = 50;
        int b = 60;
        int c = 90;
        if (a>b && a>c)
            System.out.println(a);
        else if (b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
