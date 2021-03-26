import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        final float PRICE_OF_DOZEN_EGGS = 3.25F;
        final float PRICE_OF_LOOSE_EGGS = 0.45F;
        final int DOZEN = 12;
        int eggsOrdered, dozenOfEggs, looseEggs;
        float totalPrice;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of eggs >>");
        eggsOrdered = input.nextInt();
        dozenOfEggs = eggsOrdered / DOZEN;
        looseEggs = eggsOrdered % DOZEN;
        totalPrice = dozenOfEggs*PRICE_OF_DOZEN_EGGS + looseEggs*PRICE_OF_LOOSE_EGGS;
        System.out.println("You ordered "+eggsOrdered+" eggs. That's "+dozenOfEggs+" dozen at $"+PRICE_OF_DOZEN_EGGS+" per dozen and "+looseEggs+" loose eggs at $"+PRICE_OF_LOOSE_EGGS+" each for a total of $"+totalPrice+".");
    }
}
