package com.OOPS.Enum;

public class EnumBasic {
    public static void main(String[] args) {

        // Enums are group of constants. They are public static final by default.

        Day d = Day.Monday;
        System.out.println(d);
        d.a = 34;
        System.out.println(d.number());

        switch(d) {
            case Monday:  System.out.println("Business open");
                            break;
            case Tuesday:  System.out.println("Business closed");
                            break;
            case Wednesday:  System.out.println("Business open");
                            break;
            case Thursday:  System.out.println("Business closed");
                            break;
            case Friday:  System.out.println("Business open");
                            break;
             default:  System.out.println("Business closed");
                            break;
        }
    }
}


enum Day {
    Monday,  Tuesday, Wednesday, Thursday, Friday;

    int a = 12;

    public int number () {
        return a;
    }
}

