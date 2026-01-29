package com.OOPS.Threads;

import javax.swing.plaf.TableHeaderUI;

public class ThreadUsingRunnable {

    public static void main(String[] args) {

        // Threads can be created using Runnable interface

        Task obj1 = new Task();
        Tasks obj2 = new Tasks();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}

class
Task implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=200; i++) {
            System.out.println(i);
        }
    }
}

class Tasks implements Runnable {
    @Override
    public void run() {
        for(int i=1;i<=200; i++) {
            System.out.println(i);
        }
    }
}