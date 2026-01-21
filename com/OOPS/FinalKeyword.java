package com.OOPS;

public class FinalKeyword {

    public static void main(String[] args) {

        // final is keyword used to restrict the modification or change of the values of a variable,
        // or restricting the use of a class to not use for inheritance.
        // or restricting the use of a method to not override it in a child class

        Child obj = new Child();
        System.out.println(obj.show());
    }
}


class Parent {
    final int tax = 10;

    final public int display() {
        return tax;
    }
}

final class Child extends Parent{

     public int show() {
         return tax;
    }
}