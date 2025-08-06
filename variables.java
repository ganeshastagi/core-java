public class variables {
    public static void main(String[] args) {
        int a;              // Declare a variable
        a = 200;            // Initialize a variable
        System.out.println(a);

        VarTypes v = new VarTypes();
        v.num = 10;
        v.num1 = 12;
        v.display(2);
        System.out.println(v.num);
        System.out.println(v.num1);
    }
}

class VarTypes {
    int num;            // Instance Variables - These are inside a class but outside the method.
    static int num1;    // Static Variables are also inside a class, but they have static keyword in them, these are only belong to
                        // class not the objects. These can be accessed with a class name

    void display(int s) {
        System.out.println(s);
    }

}
