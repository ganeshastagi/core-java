package com.javaBasics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main (String[] args) {
        // Switch is used when the user input is between a range. i.e 1-7.
        //We can use conditional statements too but switch statement is more efficient than conditional statements in this case.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 1-7");
        int num = sc.nextInt();
        switch(num) {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thursday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("Please enter a valid number between 1 - 7");
                    break;
        }
    }
}
