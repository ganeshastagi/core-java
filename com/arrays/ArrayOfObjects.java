package com.arrays;

class Student {
    String name;
    int age;
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        // In Java, an array of objects means a regular array that stores references to instances of a class.
        // This is useful when you want to manage multiple entities of the same type.

        Student s1 = new Student();
        s1.name = "Jim";
        s1.age = 30;

        Student s2 = new Student();
        s2.name = "Dwight";
        s2.age = 30;

        Student s3 = new Student();
        s3.name = "Andy";
        s3.age = 32;


        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++) {
            System.out.println("Name: "+ students[i].name + " Age: " + students[i].age);
        }

        // Enhanced For loop
        for(Student s : students) {
            System.out.println("Name: " + s.name + " Age: " + s.age);
        }

    }
}

