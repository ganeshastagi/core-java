import java.util.Scanner;

public class ExceptionBasics {
    public static void main(String[] args) {

        // The runtime errors are called exceptions

        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Please enter a number");
            int n = sc.nextInt();
            System.out.println(n);
        } catch (Exception e) {
            System.out.println("Please enter a correct number.");
        }
    }
}
