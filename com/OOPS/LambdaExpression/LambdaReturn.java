package com.OOPS.LambdaExpression;

public class LambdaReturn {
    public static void main(String[] args) {

        // Lambda expression with return

        // Without using Lambda expression
        ABC obj = new ABC() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        int res = obj.add(3, 4);
        System.out.println(res);

        // With using Lambda expression
        ABC obj1 = (a, b) -> a + b;
        int res1 = obj1.add(5, 4);
        System.out.println(res1);
    }
}


@FunctionalInterface
interface ABC {
    int add(int a, int b);
}