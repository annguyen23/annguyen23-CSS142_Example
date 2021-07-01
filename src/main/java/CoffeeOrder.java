/**
 * Write a description of class CoffeeOrder here.
 *
 * sizes Tall, Grande 
 * Americano 2.65 2.95 
 * Latte 3.35 3.95 
 * Mocha 3.85 4.45 
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class CoffeeOrder
{

    public static double getPrice(int coffeeType, int size) {
        if (coffeeType == 1) {
            if (size == 1) {
                return 2.65; // Americano, Tall
            }else {
                return 2.95; // Americano, Grande
            }
        } else if (coffeeType == 2){
            if (size == 1){
                return 3.35; // Latte, Tall
            }else{
                return 3.95; // Latte, Grande
            }
        }else if (coffeeType == 3) {
            if (size == 1) {
                return 3.85; // Mocha , Tall 
            } else {
                return 4.45; // Mocha , Grande
            }
        }
        assert ((coffeeType > 0) && (coffeeType < 4));
        return 0;
    }

    public static int getIntegerWPrompt(String prompt)
    {
        Scanner keyboard =  new Scanner(System.in);
        System.out.print(prompt);
        return keyboard.nextInt();
    }

    public static void getOrder()
    {
        System.out.println("Welcome to CoffeeOrder 3000");
        int coffees = getIntegerWPrompt("How many espresso drinks would you like today (0-3): ");
        double total = 0.0;
        assert (coffees < 4);
        for (int i = 1; i <= coffees; i++)
        {
            System.out.format("Getting order for espresso drink #%d\n", i);
            int coffeeType = getIntegerWPrompt("What type (1: Americano, 2: Latte, 3: Mocha): ");
            int size = getIntegerWPrompt("What size (1: Tall, 2: Grande): ");
            total = total + getPrice(coffeeType, size);
        } if (total > 0) {
            System.out.format("Your total is %.2f\n", total);
        } else {
           System.out.println("OK, so you do not want any espressos today!");
        }
        System.out.println("Thank you for using CoffeeOrder 3000");
    }


    public static void main(String[] args)
    {
        getOrder();
    }
}
