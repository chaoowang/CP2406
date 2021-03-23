public class QuartsToGallons {
    public static void main(String[] args) {
        final int QUARTS_IN_GALLON = 4;
        int quartNeeded = 18;
        int gallonNeeded, extraQuartNeeded;
        gallonNeeded = quartNeeded / QUARTS_IN_GALLON;
        extraQuartNeeded = quartNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " +quartNeeded+ " quarts requires "+gallonNeeded+" gallons plus "+extraQuartNeeded+" quarts.");
    }
}
