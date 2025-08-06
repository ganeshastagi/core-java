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

        // Pre-Increment and Post-Increment - They behave different when you try to fetch the value.
        int pre_incre = ++a;        //a is fetched and incremented first & then assigned to the variable.
        int post_incre = a++;       //a is fetched and assigned to variable, then the variable is incremented.
        System.out.println(pre_incre);
        System.out.println(post_incre);
//        for(int i=0; i<5; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        for(int i=0; i<5; ++i)
//        {
//            System.out.print(i);
//        }
//        System.out.println();

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
