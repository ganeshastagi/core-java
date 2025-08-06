package com.javaBasics;

public class EnhancedForLoop {
    public static void main (String [] args) {
        // Enhanced for loop or For each loop is used when we want to work directly with the data or the values in the array
        // not with its index.
        // If you want to work with index, you can use normal for loop.
        // You can't modify the data, you can just access the data and display it.

        int a[] = new int[4];
        a[0] = 4;
        a[1] = 3;
        a[2] = 2;
        a[3] = 1;

        for(int n : a) {                    // int n is just a variable given to store the value
            System.out.println(n);
        }
    }
}
