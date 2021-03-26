import java.util.Scanner;

public class MinutesConversion {
    public static void main(String[] args) {
        final double HOURS_IN_MIN=60;
        final double DAYS_IN_MIN=60*24;
        int minutes;
        double hours, days;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of minutes >>");
        minutes = input.nextInt();
        hours=minutes/HOURS_IN_MIN;
        days=minutes/DAYS_IN_MIN;
        System.out.println(minutes+" minutes equals "+hours+" and equals "+days+" days.");
    }
}
