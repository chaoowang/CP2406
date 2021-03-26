import java.util.Scanner;

public class NauticalMilesInteractive {
    public static void main(String[] args) {
        final float KILOMETERS_IN_NAUTICAL = 1.852F;
        final float MILES_IN_NAUTICAL = 1.150779F;
        float nauticalMiles;
        float km, miles;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of nautical miles >> ");
        nauticalMiles= input.nextFloat();
        km = nauticalMiles * KILOMETERS_IN_NAUTICAL;
        miles = nauticalMiles * MILES_IN_NAUTICAL;
        System.out.println(nauticalMiles + " nautical mile equals " + km + " kilometers or " + miles + " miles.");
    }
}
