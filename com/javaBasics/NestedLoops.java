package com.javaBasics;

public class NestedLoops {
    public static void main (String[] args) {
        // Loop in a loop is called nested loops.

        int i = 1;
        while(i<=5) {
            System.out.println("Hey, Gorgeous!");
            int j=1;
            while(j<=3){
                System.out.println("How you doin!!");
                j++;
            }
            i++;
        }
    }
}
