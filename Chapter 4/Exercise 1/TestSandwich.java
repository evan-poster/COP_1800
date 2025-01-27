// TestSandwich.java

/**
 * Exercise 1:
 *
 * b. Create an application named TestSandwich that prompts the user for data, instantiates one Sandwich
object, and displays its values. Save the application as TestSandwich.java.
 */

import java.util.Scanner;

public class TestSandwich {
	public static void main(String[] args) {
		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the main ingredient: ");
		String mainIngredient = input.nextLine();
		System.out.print("Enter the bread type: ");
		String breadType = input.nextLine();
		System.out.print("Enter the price: ");
		double price = input.nextDouble();
		
		// Create object
		Sandwich mySandwich = new Sandwich(mainIngredient, breadType, price);
		
		// Display values
		System.out.println("\n========================\n");
		System.out.println("Main Ingredient: " + mySandwich.getMainIngredient());
		System.out.println("Bread Type: " + mySandwich.getBreadType());
		System.out.println("Price: " + mySandwich.getPrice());
		System.out.println("\n========================\n");
	}
}