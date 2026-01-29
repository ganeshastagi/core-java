package com.OOPS.Threads;

public class ThreadPriority {
    public static void main(String[] args) {

        // We can provide the information to the CPU about which Thread can have the highest priority.
        //The priority is decided by the CPU scheduler, we are just suggesting the scheduler that a thread has more priority than others.
        //It can be achieved by using sleep(), it will make the thread to wait for other thread to execute first.

        Task1 obj1 = new Task1();
        Task2 obj2 = new Task2();

        obj1.start();
        obj2.start();
    }
}

class Task1 extends Thread {

    public void run() {
        for(int i=1; i<=200; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Task2 extends Thread {

    public void run() {
        for(int i=1; i<=200; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

