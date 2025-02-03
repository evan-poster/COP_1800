/**
 * 
 * Write an application that asks a user to type an even number or the sentinel value 999 to stop. When the user
types an even number, display the message Good job! and then ask for another input. When the user types an
odd number, display an error message and then ask for another input. When the user types the sentinel value
999, end the program. Save the file as EvenEntryLoop.java.
 *
 */

import java.util.Scanner;

public class EvenEntryLoop {
	public static void main(String[] args) {
		// Create a Scanner object to read user input
		Scanner input = new Scanner(System.in);

		// Prompt the user for input
		System.out.print("Enter an even number or 999 to quit: ");
		int num = input.nextInt();

		// Loop until user enters 999
		while (num != 999) {
			// Check if the number is even
			if (num % 2 == 0) {
				System.out.println("Good job!");
			} else {
				System.out.println("Error! Try again.");
			}

			// Prompt the user for input again
			System.out.print("Enter an even number or 999 to quit: ");
			num = input.nextInt();
		}
	}
}

