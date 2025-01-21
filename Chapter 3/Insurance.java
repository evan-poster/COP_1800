// Insurance.java

/**
 * Exercise 8:
 * 
 * The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium is computed by taking the decade of the customer’s age, adding 15 to it, and ­multiplying by 20. For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15, and then multiplying by 20. Write an application that prompts a user for the current year and a birth year. Pass both to a method that calculates and returns the premium amount, and then display the returned amount. Save the application as Insurance.java.
 * 
 */

import java.util.Scanner;

public class Insurance {
	public static void main(String[] args) {
		// Get current year
		int currentYear = java.time.LocalDate.now().getYear();

		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the birth year: ");
		int birthYear = input.nextInt();
		
		// Calculate premium
		int premium = ((currentYear - birthYear) / 10) + 15;
		premium *= 20;
		
		// Print results
		System.out.println("Premium: $" + premium);
	}
}