import java.util.Scanner;

public class MultiDimenArrays {
    public static void main(String[] args) {
        // The Multi-dimensional arrays are used when we want to store multi data in rows and columns.

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Please enter the number of columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        // User input
        for(int i=0; i<a.length; i++) {
            for(int j=0;j<a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Display values
        for(int i=0; i<a.length;i++) {
            for(int j=0;j<a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
