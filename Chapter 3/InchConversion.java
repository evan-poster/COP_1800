// InchConversion.java

/**
 * Exercise 7:
 * 
 * There are 12 inches in a foot and 3 feet in a yard. Create a class named InchConversion. Its main() method accepts a value in inches from a user at the keyboard, and in turn passes the entered value to two methods. One converts the value from inches to feet, and the other converts the same value from inches to yards. Each method displays the results with appropriate explanation. Save the application as InchConversion.java.
 * 
 */

import java.util.Scanner;

public class InchConversion {
	public static void main(String[] args) {
		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of inches: ");
		int inches = input.nextInt();
		
		// Convert to feet
		int feet = inches / 12;
		int remainingInches = inches % 12;
		
		// Convert to yards
		int yards = feet / 3;
		int remainingFeet = feet % 3;
		
		// Print results	
		System.out.println("Inches: " + inches);
		System.out.println("Feet: " + feet);
		System.out.println("Yards: " + yards);
		System.out.println("Remaining inches: " + remainingInches);
		System.out.println("Remaining feet: " + remainingFeet);
	}
}

