package com.Strings;

public class StringBufferBasics {
    public static void main(String[] args) {
        // StringBuffer is used when we want to change the string after creating it. By default, it will have 16 bits stored
        // for allocation.

        StringBuffer sb1 = new StringBuffer();              // Empty Buffer
        System.out.println(sb1.capacity());                 // Output: 16
        // sb1.concat("World");                             // StringBuffer doesn't have concat() method instead have append()
        sb1.append("Hello");
        System.out.println(sb1);


        StringBuffer sb2 = new StringBuffer("Hello ");       // Initialized StringBuffer
        sb2.append("World");
        System.out.println(sb2);


        StringBuffer sb3 = new StringBuffer(50);     // With capacity 50 bits
        sb3.append("John Wick");
        System.out.println(sb3);
        System.out.println(sb3.capacity());                  //

    }
}
