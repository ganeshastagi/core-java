public class JumpStatements {
    public static void main (String[] args) {
        // Java provides 3 Jump statements : break, continue, and return
        // break statement: Stop the execution of the loop: should only use inside the loop, a single loop can have multiple break statements.
        for (int i=1; i<=4; i++) {
            if (i==3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Loop completed");

        // continue statement: It is used to skip the iteration in the loop.
        for (int j=1; j<=5; j++) {
            if (j==3) {
                continue;
            }
            System.out.println(j);
        }
        System.out.println("Loop completed");


        // return statement: It is used to explicitly return from a method.
        boolean t = true;
        System.out.println ("Before return statement.");
        if(t)
            return;
        System.out.println ("After return statement."); // Not printed
    }
}

