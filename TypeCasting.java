public class TypeCasting {
    public static void main (String[] args) {

        // Implicit conversion or Type conversion - If both the types are compatible, then JVM will automatically convert them.
        byte b = 124;
        int a;
        a = b;
        System.out.println(a);

        /*  Explicit conversion - Even though c = 23, it can be converted to byte but JVM doesn't understand since c's datatype is Int
        * and d's byte. We have to explicitly inform JVM that first convert it to byte then initialize */
        //  Narrowing conversion
        int c = 23;
        byte d;
        d = (byte) c;
        System.out.println(d);

        /* In the above example, int value is 23, but what if its value is 300 which exceeds the byte limit. When this occurs
        *  it will be converted into modulo  */
        int e = 60000;
        byte f;
        f = (byte) e;
        int z = e % 256;
        System.out.println(z);      // O/p = 96; 6000 % 256
        System.out.println(f);      // O/p = 44; byte range = 128 + 128 = 256 ; 300 - 256 = 44

        // When a floating point number is converted into a int value, it loses its decimal value
        float y = 3.14f;
        int x = (int) y;
        System.out.println(x);

        /* When handling operators while converting, the Java automatically promotes integers operands into int when
        * evaluating an expression */
        byte g = 12;
        byte h = 12;
        // byte i = h * 2; //Error - During calculation the * operand is converted into int
        byte i = (byte) (h * 2);
        
    }
}
