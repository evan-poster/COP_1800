/**
 * 
 * Modify the CountByFives application so that the user enters the value to count by. Start each new line
after 10 values have been displayed. Save the file as CountByAnything.java.
 *
 */

import java.util.Scanner;

public class CountByAnything {
	public static void main(String[] args) {
		// Get count by value from user
		Scanner input = new Scanner(System.in);

		System.out.print("Count by: ");
		int countBy = input.nextInt();

		// Keep track of how many numbers have been printed
		int num_counter = 0;

		// Loop through numbers from 5 to 500
		for (int i = 5; i <= 500; i += countBy) {
			System.out.print(i + " ");

			// Increment counter
			num_counter++;

			// Print a new line after every 10 numbers
			if (num_counter == 10) {
				System.out.println();
				// Reset counter
				num_counter = 0;
			}
		}
	}
}
