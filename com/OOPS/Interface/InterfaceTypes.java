package com.OOPS.Interface;

public class InterfaceTypes {
    public static void main(String[] args) {

        // There are 3 types of interface
        // Normal - Which has 2 or more methods
        // Functional (Single Abstract method) - Which has only one method
        // Marker - Which doesn't have any methods, it is blank interface


    }
}

// Normal
interface ABC {
    void A();
    void B();
    void C();
}

// Functional Interface
@FunctionalInterface
interface AB {
    void A();
}

// Marker
interface Blank {

}