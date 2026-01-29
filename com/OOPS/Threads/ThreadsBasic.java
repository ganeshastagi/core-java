package com.OOPS.Threads;

public class ThreadsBasic {
    public static void main(String[] args) {

        // A thread is a small and lightweight block of execution which runs
        // independently and parallel so that execution will be faster.

        TaskA obj1 = new TaskA();
        TaskB obj2 = new TaskB();

        obj1.start();
        obj2.start();

    }
}

class TaskA extends Thread {

    public void run() {
        for(int i=1; i<=200; i++) {
            System.out.println("Hi");
        }
    }
}

class TaskB extends Thread {

    public void run() {
        for(int i=1; i<=200; i++) {
            System.out.println("Hello");
        }
    }
}

