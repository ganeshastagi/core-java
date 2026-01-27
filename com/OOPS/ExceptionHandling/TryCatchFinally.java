package com.OOPS.ExceptionHandling;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        // finally is used after try-catch block, it is mainly used to close the resources like database,
        // files, scanner class, many more.

        // finally block executes no matter what.


        Scanner sc = new Scanner(System.in);
        int num = 0;

        try {
            num = sc.nextInt();

        } catch (Exception e) {
            System.out.println("Please enter a number.");
        } finally {
            sc.close();
        }
    }
}
