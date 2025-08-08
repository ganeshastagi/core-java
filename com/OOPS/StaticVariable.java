package com.OOPS;

 class StaticVariable {
    public static void main(String[] args) {
        // Static variable only belongs to class, not to any objects of that class.
        // It can be accessed by using class name or even by an object but the value remains the same for all objects.
        // Once declared and Initialized, it will not change to any objects for that class.

        Student s1 = new Student();
        Student.section = "Sec 1";
        s1.name = "Sheldon";
        s1.marks = 90;
                                             // Section is different

        Student s2 = new Student();
        s2.name = "Leonard";
        s2.marks = 85;
                                            // Section is different

        s1.display();                                      // Output: Sec 2
        s2.display();                                      // Output: Sec 2

    }
}

class Student {
    String name;
    int marks;
    static String section;

    void display() {
        System.out.println("Name :" + name + " , " + " Marks " + marks +  " , " +  " Section " + section);
    }
}