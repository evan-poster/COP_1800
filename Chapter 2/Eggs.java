// Eggs.java

/**
 * Exercise 11:
 * 
 * Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of eggs in the order and then display the amount owed with a full explanation. For example, typical ­output might be, You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85. Save the program as Eggs.java.
 */

import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs: ");
        int eggs = input.nextInt();
        int dozen = eggs / 12;
        int loose = eggs % 12;
        double total = 3.25 * dozen + 0.45 * loose;
        System.out.println("You ordered " + eggs + " eggs.");
        System.out.println("That's " + dozen + " dozen at $3.25 per dozen and " + loose + " loose eggs at 45 cents each for a total of $" + total);
    }
}
