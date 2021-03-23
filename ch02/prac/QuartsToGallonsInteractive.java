import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int quartNeeded,gallonNeeded, extraQuartNeeded;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter quarts needed >> ");
        quartNeeded = input.nextInt();
        gallonNeeded = quartNeeded / QUARTS_IN_GALLON;
        extraQuartNeeded = quartNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " +quartNeeded+ " quarts requires "+gallonNeeded+" gallons plus "+extraQuartNeeded+" quarts.");
    }
}
