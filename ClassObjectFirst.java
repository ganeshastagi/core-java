public class ClassObjectFirst {
    public static void main (String[] a) {
        //Creating an object for the class car
        Car myCar = new Car();
        Car myCar2 = new Car();

        //Setting fields
        myCar.brand = "Honda";
        myCar.speed = 100;

        myCar2.brand = "Ford";
        myCar2.speed = 120;

        //Calling method
        myCar.drive();
        myCar2.drive();

    }
}

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println("The car "+brand+" is driving at the speed "+speed+ " kmh.");
    }
}