/**
 * 
 * Write a program for Horizon Phones, a provider of cellular phone service.
 * 
 * Prompt a user for maximum monthly values for:
 * 		talk minutes needed
 * 		text messages needed
 * 		gigabytes of data needed
 * then display a recommendation for the best plan for the customer’s needs.
 * A customer who needs fewer than 500 minutes of talk and no text or data should buy Plan A at $49 per month.
 * A customer who needs fewer than 500 minutes of talk and any text messages should buy Plan B at $55 per month.
 * A customer who needs 500 or more minutes of talk and no data should buy either Plan C for up to 100 text messages at $61 per month or Plan D for 100 text messages or more at $70 per month.
 * A customer who needs any data should buy Plan E for up to 3 gigabytes at $79 per month or Plan F for 3 gigabytes or more at $87 per month.
 * 
 * Save the file as CellPhoneService.java.
 *
 */

import java.util.Scanner;

public class CellPhoneService {
	public static void main(String[] args) {
		// prompt the user for data
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of minutes of talk needed: ");
		int minutes = input.nextInt();

		System.out.print("Enter the number of text messages needed: ");
		int text = input.nextInt();

		System.out.print("Enter the number of gigabytes of data needed: ");
		int data = input.nextInt();

		input.close();

		// determine which plan the user should buy
		if (minutes < 500 && text == 0 && data == 0) {
			System.out.println("You should buy Plan A at $49 per month.");
		} else if (minutes < 500 && text != 0 && data == 0) {
			System.out.println("You should buy Plan B at $55 per month.");
		} else if (minutes >= 500 && data == 0) {
			if (text <= 100) {
				System.out.println("You should buy Plan C at $61 per month.");
			} else {
				System.out.println("You should buy Plan D at $70 per month.");
			}
		} else {
			if (data < 3) {
				System.out.println("You should buy Plan E at $79 per month.");
			} else {
				System.out.println("You should buy Plan F at $87 per month.");
			}
		}
	}
}
