import java.util.Scanner;

public class NumbersDemo {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer >> ");
        num1 = input.nextInt();
        System.out.println("Enter an Integer >> ");
        num2 = input.nextInt();
        System.out.println("The number is "+ num1);
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        System.out.println("The number is "+ num2);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int num){
        final int twiceNum = num * 2;
        System.out.println("Twice the number is "+twiceNum);
    }
    public static void displayNumberPlusFive(int num){
        final int numPlusFive = num + 5;
        System.out.println("Number plus five is "+numPlusFive);
    }
    public static void displayNumberSquared(int num){
        final int numSquared = num * num;
        System.out.println("Number Squared is "+numSquared);
    }
}
