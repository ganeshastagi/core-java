package com.javaBasics;

public class PrePostIncrement {
    public static void main(String[] args) {
        //Pre- and Post-Increment

        //Post-Increment
        int stamp = 5;
        int buy_coffee = stamp++;

        System.out.println(buy_coffee);         // You buy coffee first before updating the stamp value.
        System.out.println(stamp);              // You update the stamp value, now stamp is 6.


        //Pre-Increment
        int stamp1 = 5;
        int buy_coffee1 = ++stamp1;

        System.out.println(buy_coffee1);         // You enter coffee shop and update the stamp first and stand in line
        System.out.println(stamp1);              // You buy coffee later so both value is same.

    }
}
