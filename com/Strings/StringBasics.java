package com.Strings;

public class StringBasics {
    public static void main(String[] args) {
        // String is a collection of characters. Since String is a non-primitive data type, it has a capital letter.
        // String is also a class which also means an object can be created, and it has some methods.
        // Strings are immutable by default, meaning once created it cannot be changed.

        String s = "Ganesh";     // This will create an object in the string constant pool in the heap memory with value "Ganesh"
                                // and s will be stored in Stack with the heap memory address.

        s = s + " Astagi";      // This won't change the original s value, instead it will create a new object in the heap memory
                                // and the new address will be updated to the s in the stack memory

        System.out.println(s);

        //Example:
        String org = "Hello";
        org.concat("World");
        System.out.println(org);      // Output: Hello, because it is immutable, if you store the concat in the diff variable
                                      // it will create a new object with the updated value.

        String str1 = "Ganesh";
        String str2 = "Ganesh";

        System.out.println(str1 == str2);               // This one will compare the address
        System.out.println(str1.equals(str2));          // This one will compare the string value

        String a = "hello";
        String b = "hello";
        String c = new String("hello");         // This will create a different object in the memory.

        System.out.println(a == b);                  // true (same memory location)
        System.out.println(a == c);                 // false (different memory)
        System.out.println(a.equals(c));            // true (same content)


    }
}
