/**
 * 
 * Write an application for the Shady Rest Hotel;
 * the program determines the price of a room.
 * Ask the user to choose 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch.
 * The output echoes the input and displays the price of the room:
 * 	$125 for queen
 * 	$139 for king
 * 	$165 for a suite with a king bed and a pullout couch.
 * If the user enters an invalid code, display an appropriate message and set the price to 0.
 * 
 * Save the file as ShadyRestRoom.java.
 *
 */

import java.util.Scanner;

public class ShadyRestRoom {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a bed type
		System.out.print("Enter 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch: ");
		int bedType = input.nextInt();
		
		// Initialize price variable
		double price = 0;

		// Determine the price based on bed type
		if (bedType == 1) {
			price = 125; // Price for queen bed
		} else if (bedType == 2) {
			price = 139; // Price for king bed
		} else if (bedType == 3) {
			price = 165; // Price for suite with king bed and pullout couch
		} else {
			System.out.println("Invalid code"); // Handle invalid input
		}

		// Display the bed type and price
		System.out.println("Bed type: " + bedType);
		System.out.println("Price: $" + price);
	}
}
