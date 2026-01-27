package com.OOPS.ExceptionHandling;

import java.util.Scanner;

public class MultipleCatches {
    public static void main(String[] args) {

        // A single try can have multiple catches if the try has multiple statements that can cause different
        // exception.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int a[] = new int[5];

        try {
            int num = sc.nextInt();
            System.out.println(a[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array is out of limit." + e);
        }
        catch (Exception e) {
            System.out.println("Please enter a number." + e);
        }
    }
}
