import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args) {
        final int PRICE_OF_ADULT = 7;
        final int PRICE_OF_CHILD = 4;
        int numOfAdult, numOfChild, adultPrice, childPrice, totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of adult's meal >>");
        numOfChild = input.nextInt();
        System.out.println("Enter number of child's meal");
        numOfAdult = input.nextInt();
        adultPrice = numOfAdult * PRICE_OF_ADULT;
        childPrice = numOfChild * PRICE_OF_CHILD;
        totalPrice = adultPrice + childPrice;
        System.out.println("Price for total adult's meal: $"+adultPrice+"\nPrice for total child's meal: $"+childPrice+"\nTotal price: $"+totalPrice);
    }
}
