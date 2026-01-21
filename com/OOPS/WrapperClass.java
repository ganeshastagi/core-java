package com.OOPS;

public class WrapperClass {
    public static void main(String[] args) {

        // Wrapper class is used mainly in Collections and Generics frameworks because these frameworks only store
        // objects not primitive types.

        int a = 10;         // Primitive data type
        Integer b = 20;     // Wrapper class

        Integer c = a;         // Autoboxing - Converting primitive into wrapper
        int d = b;            // Unboxing    - Converting wrapper into primitive.

        // Methods that can used to wrapper classes

        String str = "12";
        System.out.println(Integer.parseInt(str));          // Converts string into int but the string has to be number
        System.out.println(Integer.valueOf("46"));
    }
}
