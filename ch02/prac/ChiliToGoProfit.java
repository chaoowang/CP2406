import java.util.Scanner;

public class ChiliToGoProfit {
    public static void main(String[] args) {
        final float PRICE_OF_ADULT = 7;
        final float PRICE_OF_CHILD = 4;
        final float COST_OF_ADULT = 4.35F;
        final float COST_OF_CHILD = 3.1F;
        final float PROFIT_OF_ADULT = PRICE_OF_ADULT - COST_OF_ADULT;
        final float PROFIT_OF_CHILD = PRICE_OF_CHILD - COST_OF_CHILD;
        int numOfAdult, numOfChild;
        float adultProfit, childProfit, totalProfit;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of adult's meal >>");
        numOfAdult = input.nextInt();
        System.out.println("Enter number of child's meal");
        numOfChild = input.nextInt();
        adultProfit = numOfAdult * PROFIT_OF_ADULT;
        childProfit = numOfChild * PROFIT_OF_CHILD;
        totalProfit = adultProfit + childProfit;

        System.out.println("Profit for total adult's meal: $" + adultProfit + "\nProfit for total child's meal: $" + childProfit + "\nTotal profit: $" + totalProfit);
    }
}
