/**
 * 
 * Write an application that prompts a user for two integers and displays every integer between them.
 * Display a message if there are no integers between the entered values. Make sure the program works regardless of which entered value is larger.
 * Save the file as Inbetween.java.
 * 
 */

import java.util.Scanner;

public class Inbetween {
	public static void main(String[] args) {
		// Create a scanner object to read the user's input
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for two integers
		System.out.print("Enter the first integer: ");
		int first = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int second = input.nextInt();
		
		// Swap the values if the first is larger than the second
		if (first > second) {
			int temp = first;
			first = second;
			second = temp;
		}
		
		// Check if there are any numbers between the two entered numbers
		if (second - first > 1) {
			// Loop through the numbers between the two entered numbers and print them
			for (int i = first + 1; i < second; i++) {
				System.out.println(i);
			}
		} else {
			// If there are no numbers between the two entered numbers, print a message
			System.out.println("There are no integers between the two entered values.");
		}
	}
}
