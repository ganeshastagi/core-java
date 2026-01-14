package com.javaBasics;
import java.util.Scanner;

public class TernaryOp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a = sc.nextInt();
        String result;
        result = a%2==0 ? "Even" : "Odd";  // Condition ? - if true  : - if false ;
        System.out.println(result);
    }
}
