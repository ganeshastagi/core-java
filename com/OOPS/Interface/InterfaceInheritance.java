package com.OOPS.Interface;

public class InterfaceInheritance {
    public static void main (String[] args) {


        // An interface can inherit from another interface.
        Child obj;
        obj = new Assets();

        obj.childName();
        obj.names();
        obj.property();

    }
}

interface Parent {

    void names();
    void property();
}

interface Child extends Parent {

    void childName();
}

class Assets implements Child {
    @Override
    public void childName() {
        System.out.println("Child Name is");
    }

    @Override
    public void names() {
        System.out.println("Parent Name is");
    }

    @Override
    public void property() {
        System.out.println("Property details");
    }
}