public class Loops {
    public static void main (String[] args) {
        // Repeating the same statements until the condition is met but in an efficient way.
        // Both for loop and while loop are same functional wise, but they differ in syntax.
        // For loop is used when we already know the number of iterations. For ex: A classroom students
        // While loop is used when we don't know the number of iterations initially. For Ex: User password until they
        // enter correct password
        // Do while is used when at least the loop should execute once.

        //While
        int i = 1;
        while(i<=5)
        {
           System.out.println("Wrong password: Try again");
            i++;
        }
        //For
        for(int j = 1; j<=5; j++) {
            System.out.println("Access Granted");
        }
        //Do while
        int k = 6;
        do{
            System.out.println("You're stupid!");
        }while(k<=5);
    }
}
