import java.util.Scanner;

public class JaggedArray {
    public static void main (String[] args) {
        // When we don't know the size of columns and its value, we can we use the jagged arrays. We don't have to mention
        // the size of array when declaring.

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][];

        a[0] = new int[4];
        a[1] = new int[2];
        a[2] = new int[3];

        System.out.println("Please enter the values of the array: ");
        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<a.length; i++) {
            for(int j = 0; j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
