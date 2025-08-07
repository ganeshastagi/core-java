package com.javaBasics;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // Scanner is a class of util, it is used to take the user inputs through console, files and strings

        Scanner sc = new Scanner(System.in);

//        byte b = sc.nextByte();
//        short s = sc.nextShort();
//        int i = sc.nextInt();
//        long l = sc.nextInt();
//
//        float f = sc.nextFloat();
//        double d = sc.nextDouble();
//
//        char c = sc.next().charAt(0);
//        boolean bool = sc.nextBoolean();
//

//        String s1 = sc.next();                  // For single word
        String s2 = sc.nextLine();              // For multiple words

        System.out.println(s2);


    }
}
