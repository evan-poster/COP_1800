// FormLetterWriter.java

/**
 * Exercise 10:
 * 
 * Create a class named FormLetterWriter that includes two overloaded methods named displaySalutation().
 * 
 * The first method takes one String parameter that represents a customer’s first name, and it displays the salutation Dear followed by the first name.
 * 
 * The second method accepts two String parameters that represent a first and last name, and it displays the greeting Dear followed by the first name, a space, and the last name.
 * 
 * After each salutation, display the rest of a short business letter: Thank you for your recent order. Write a main() method that prompts the user for a first and last name and tests each overloaded method. Save the file as FormLetterWriter.java.
 */

import java.util.Scanner;

public class FormLetterWriter {
	public static void main(String[] args) {
		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String firstName = input.nextLine();
		System.out.print("Enter your last name: ");
		String lastName = input.nextLine();
		
		// Call methods
		System.out.println("\n========================\n");
		displaySalutation(firstName);

		System.out.println("\n========================\n");
		displaySalutation(firstName, lastName);
	}
	
	public static void displaySalutation(String firstName) {
		System.out.println("Dear " + firstName + ",\n");
		displayBusinessLetter();
	}
	
	public static void displaySalutation(String firstName, String lastName) {
		System.out.println("Dear " + firstName + " " + lastName + ",\n");
		displayBusinessLetter();
	}

	public static void displayBusinessLetter() {
		System.out.println("Thank you for your recent order.");
	}
}
