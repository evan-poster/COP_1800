/**
 * 
 * Modify the RetirementGoal application to display the amount of money the user will have if the user
earns 4 percent interest on the balance every year. Save the file as RetirementGoal2.java.
 */

import java.util.Scanner;

public class RetirementGoal2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt until valid values are entered
		int years = 0;
		while (years <= 0) {
			System.out.print("Enter the number of years until retirement: ");
			years = input.nextInt();
		}

		System.out.print("Enter the amount of money you can save annually: ");
		double savings = input.nextDouble();
		double balance = 0;
		for (int i = 0; i < years; i++) {
			balance += savings;
			balance *= 1.04;
		}
		System.out.println("You will have $" + balance + " at retirement.");
	}
}