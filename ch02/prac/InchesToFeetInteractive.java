import java.util.Scanner;

public class InchesToFeetInteractive {
    public static void main(String[] args) {
        final int FEET_IN_INCHES = 12;
        int inches;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value in inches >> ");
        inches=input.nextInt();
        int feet = inches/FEET_IN_INCHES;
        int extraInches = inches%FEET_IN_INCHES;
        System.out.println(inches+" inches is "+ feet+" feet and "+extraInches+" inches.");
    }
}
