public class ClassObjectFirst {
    public static void main (String[] a) {
        //Creating an object for the class car
        Car myCar = new Car();

        //Setting fields
        myCar.brand = "Honda";
        myCar.speed = 100;

        //Calling method
        myCar.drive();

    }
}

class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println("The car "+brand+" is driving at the speed "+speed+ " kmh.");
    }
}