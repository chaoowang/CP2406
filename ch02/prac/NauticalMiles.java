public class NauticalMiles {
    public static void main(String[] args) {
        final float KILOMETERS_IN_NAUTICAL = 1.852F;
        final float MILES_IN_NAUTICAL = 1.150779F;
        float nauticalMiles = 200;
        float km, miles;
        km = nauticalMiles * KILOMETERS_IN_NAUTICAL;
        miles = nauticalMiles * MILES_IN_NAUTICAL;
        System.out.println(nauticalMiles + " nautical mile equals " + km + " kilometers or " + miles + " miles.");
    }
}
