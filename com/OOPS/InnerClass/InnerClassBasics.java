package com.OOPS.InnerClass;

public class InnerClassBasics {
    public static void main(String[] args) {

        // A class inside a class is called Inner class.

        A obj = new A();
        obj.display();

        // Inorder to access the class b, we need to go through class A

//        A.B obj1 = obj.new B();                 // To call the Non-static method because it needs object name to call
//        obj1.display();

        // If class B is static then
        A.B obj2 = new A.B();
        obj2.display();

    }
}

class A {
    int a = 20;

    public void display() {
        System.out.println(a);
    }

    static class B {                                                   // Class inside a class
        int b = 30;

        public void display(){
            System.out.println("In class B " + b);
        }
    }
}