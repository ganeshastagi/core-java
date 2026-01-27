package com.OOPS.LambdaExpression;

public class LambdaBasics {
    public static void main(String[] args) {

        // Lambda expression is used to reduce the code instead of using an anonymous class for the interface.
        // It is only used on Functional Interface.

        // Without Lambda Expression
        A obj = new A() {
            @Override
            public void display() {
                System.out.println("Using anonymous class");
            }
        };
        obj.display();

        // Using Lambda expression(->)
        A obj1 = () -> System.out.println("Using Lambda expression");
        obj1.display();
    }
}

@FunctionalInterface
interface A {
    void display();
}