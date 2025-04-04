public class Operators {
    public static void main (String[] args) {
        // Arithmetic Operators - +, -, *, /, %, +=, -=, *=, /=, ++, --
        int a = 15;
        int b = 20;
        int result = a+b;
        System.out.println(result);
        result += 12;
        System.out.println(result);

        // Pre-Increment and Post-Increment - They behave different when you try to fetch the value.
        //int pre_incre = ++a;
        int post_incre = a++;
        //System.out.println(pre_incre);
        System.out.println(post_incre);
        for(int i=0; i<5; i++) {
            System.out.print(i);
        }
        System.out.println();
        for(int i=0; i<5; ++i)
        {
            System.out.print(i);
        }
        System.out.println();

        //Relational Operators - ==, !=, <, >, <=, >=
        int x = 10;
        int y = 20;
        boolean z = x != y;
        System.out.println(z);

        //Bitwise Operators - &, |, &&, ||, !

    }
}
