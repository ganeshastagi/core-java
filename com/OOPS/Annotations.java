package com.OOPS;

public class Annotations {
    public static void main(String[] args) {

        // An annotations provide the meta-data (more information) to the code which helps the compiler.
        // They help in code maintainability, frameworks(Spring, JUnit, Hibernate)
        // Example: Sometimes the methods you want to override have a big name, you use @override to check the
        // correct method is being overridden.

        B obj = new B();
        obj.displayThisEnormousNameOfTheMethod();

    }
}

class A {

    public void displayThisEnormousNameOfTheMethod() {
        System.out.println("This is in class A");
    }
}

class B extends A {

    @Override
    public void displayThisEnormousNameOfTheMethod() {
        System.out.println("This is in class B");
    }
}