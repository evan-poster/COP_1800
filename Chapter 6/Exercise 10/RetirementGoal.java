/**
 * 
 * Write an application that prompts a user for the number of years the user has until retirement and the
amount of money the user can save annually. If the user enters 0 or a negative number for either value,
reprompt the user until valid entries are made. Assume that no interest is earned on the money. Display the
amount of money the user will have at retirement. Save the file as RetirementGoal.java.
 *
 */

import java.util.Scanner;

public class RetirementGoal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years until retirement: ");
		int years = input.nextInt();
		System.out.print("Enter the amount of money you can save annually: ");
		double savings = input.nextDouble();
		double balance = 0;
		for (int i = 0; i < years; i++) {
			balance += savings;
		}
		System.out.println("You will have $" + balance + " at retirement.");
	}
}
