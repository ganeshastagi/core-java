package com.OOPS.ExceptionHandling;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {

        // We can define our own exceptions in Java instead of using the standard exception class.

        Scanner sc = new Scanner(System.in);
        int num = 0;
        try {
            System.out.println("Please enter a number > 0: ");
             num = sc.nextInt();
             if(num == 0) {
                 throw new InvalidInput("Please enter a number greater than zero.");
             }

        } catch (Exception e) {
            num = 1;
            System.out.println("Default value set to 1" + e);
        }
        System.out.println(num);
    }
}

class InvalidInput extends Exception {
    InvalidInput(String string) {           // Constructor of the customized exception
        super(string);                      // To call the super class of the parent class
    }
}