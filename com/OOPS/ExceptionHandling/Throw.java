package com.OOPS.ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {

        // throw is used to throw an exception manually

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = 0;
        int div;

        try {
            num = sc.nextInt();
            div = 20/num;        // If num=0 then, it will show an arithmetic exception, but I don't want to print the
                                // regular exception, instead I want to change the num to default value
            if(num == 0) {
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e) {
            num = 2;
            System.out.println("Default value has been set to 2.");
        } catch (Exception ex) {
            System.out.println("Something went wrong..." + ex);
        }
        System.out.println(20/num);
    }
}
