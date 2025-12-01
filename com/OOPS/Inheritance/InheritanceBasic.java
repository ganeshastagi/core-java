package com.OOPS.Inheritance;

import java.util.Scanner;

public class InheritanceBasic {
    public static void main(String[] args) {
        // Inheritance is acquiring the properties and methods of another class.
        // The child class can only acquire public and protected members of the parent class.
        //

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        AdvCalc c = new AdvCalc();
        System.out.println(c.add(num1, num2));
        System.out.println(c.sub(num1, num2));
        System.out.println(c.multi(num1, num2));
        System.out.println(c.div(num1, num2));
    }
}

class Calc {

    int add(int n1, int n2) {
        return n1 + n2;
    }

    int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc {

    int multi(int n1, int n2) {
        return n1 * n2;
    }

    int div (int n1, int n2) {
        return n1 / n2;
    }
}