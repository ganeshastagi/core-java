package com.OOPS.Interface;

public class MultipleInterface {
    public static void main(String[] args) {

        // A single class can implement multiple interfaces
        Men obj1;
        Women obj2;
        Animals obj3;

        obj1 = new Walkaton();
        obj1.run();


    }
}

interface Men {
    void walk();
    void run();

}

interface Women {
    void jog();
}

interface Animals {
    void support();
}

class Walkaton implements Men, Women, Animals {
    @Override
    public void support() {
        System.out.println("Support animal");
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }

    @Override
    public void jog() {
        System.out.println("Jogging...");
    }
}

class Participants implements Men {
    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void run() {
        System.out.println("Running...");
    }
}