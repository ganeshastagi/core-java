import java.util.*;
public class UpdatedSwitch {
    public static void main (String[] args) {
        // This is the updated switch statement which was introduced in Java 12. Now we can stop using break after each case.
        // Instead, we can use -> in the case.
        // After Java 5, we can use string as an input to switch. Before it was only int value.

        String alarm;
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the day with 3 letters like Mon, Tue, Wed,..");
        String day = sc.next();
        switch(day) {
            case "Mon" -> alarm = "5 AM";
            case "Tues", "Wed" -> alarm = "7 AM";
            default -> alarm = "8 AM";
        }
        System.out.println("Alarm is set to " + alarm);
    }
}
