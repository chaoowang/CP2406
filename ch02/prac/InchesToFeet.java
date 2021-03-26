public class InchesToFeet {
    public static void main(String[] args) {
        final int FEET_IN_INCHES = 12;
        int inches = 86;
        int feet = inches/FEET_IN_INCHES;
        int extraInches = inches%FEET_IN_INCHES;
        System.out.println(inches+" inches is "+ feet+" feet and "+extraInches+" inches.");
    }
}
