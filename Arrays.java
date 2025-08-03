import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // An Array is used when we want to store multiple values of same data type under single variable.

        //Method 1: When we know the values already.
        int a[] = {1, 2, 3, 4};

        // Method 2: When we know just the size, not the values
        int a1[] = new int[4];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;

        // Method 3: To get the values from the user and store in the array.
        int a2[] = new int[4];
        Scanner sc = new Scanner (System.in);
//        System.out.println("Please enter the values: ");
//
//        for(int i=0; i<a2.length; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for(int i=0; i<a2.length; i++) {
//            System.out.println("Value at " + i+ " is " + a[i]);
//        }

        // Method 4: To get the size and the values from the user.
        int n;
        System.out.println("Please enter the size of the array: ");
        n = sc.nextInt();
        int a3[] = new int[n];
        System.out.println("Please enter the values: ");
        for (int i=0; i<a3.length; i++) {
            a3[i] = sc.nextInt();
        }
        for(int i=0; i<a3.length; i++) {
           System.out.println("Value at " + i+ " is " + a3[i]);
        }
    }
}
