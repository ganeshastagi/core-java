package com.OOPS.Threads;

import javax.swing.plaf.TableHeaderUI;

public class RunnableWithAnonymousClass {
    public static void main(String[] args) {

        // Instead of creating a new class for thread to implement, we can use anonymous class in the main method
        Runnable obj1 = () -> {
                for(int i=1;i<=200; i++) {
                    System.out.println(i);
                }
            };
        Runnable obj2 = () -> {
                for(int i=1;i<=200; i++) {
                    System.out.println(i);
                }
            };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();


    }
}
