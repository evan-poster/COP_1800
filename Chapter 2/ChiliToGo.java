// ChiliToGo.java

/**
 * Exercise 12:
 * 
 * The Huntington Boys and Girls Club is conducting a fundraiser by selling chili dinners to go. The price is $7 for an adult meal and $4 for a child’s meal. Write a program that accepts the number of each type of meal ordered and display the total money collected for adult meals, children’s meals, and all meals. Save the program as ChiliToGo.java.
 */

import java.util.Scanner;

public class ChiliToGo {
	public static void main(String[] args) {
		// Get input from user
		Scanner input = new Scanner(System.in);

		// Get number of meals
		System.out.print("Enter the number of adult meals: ");
		int adults = input.nextInt();
		System.out.print("Enter the number of children meals: ");
		int children = input.nextInt();
		
		// Calculate total
		double total = 7 * adults + 4 * children;
		
		// Print results
		System.out.println("Adults: " + adults);
		System.out.println("Children: " + children);
		System.out.println("Total: $" + total);
	}
}
