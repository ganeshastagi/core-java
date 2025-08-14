package com.OOPS;

public class ThisKeyword {
    public static void main(String[] args) {
        // this keyword is used to refer to the current object of the class
        // Sometimes instance variables and local variables have same name, JVM gets confused and give the
        // first preference to the local variable


        HumanBeing h = new HumanBeing();
        h.setName("Ganesh");
        h.setAge(24);

        System.out.println(h.getName() + " " + h.getAge());
    }
}

class HumanBeing {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;                       // this refers to the current object that is setting this value
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}