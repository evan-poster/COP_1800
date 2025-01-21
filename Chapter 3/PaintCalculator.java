// PaintCalculator.java

/**
 * Exercise 8:
 * 
 * Assume that a gallon of paint covers about 350 square feet of wall space. Create
an application with a main() method that prompts the user for the length, width,
and height of a rectangular room. Pass these three values to a method that does
the following:

* Calculates the wall area for a room
* Passes the calculated wall area to another method that calculates and returns
the number of gallons of paint needed
* Displays the number of gallons needed
* Computes the price based on a paint price of $32 per gallon, assuming that
the painter can buy any fraction of a gallon of paint at the same price as a
whole gallon
* Returns the price of the main() method

The main() method displays the final price. For example, the cost to paint a 15-by-20-foot room with 10-foot ceilings is $64. Save the application as PaintCalculator.java.
 */

import java.util.Scanner;

public class PaintCalculator {
	public static void main(String[] args) {
		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of the room: ");
		int length = input.nextInt();
		System.out.print("Enter the width of the room: ");
		int width = input.nextInt();
		System.out.print("Enter the height of the room: ");
		int height = input.nextInt();
		
		// Calculate wall area
		int wallArea = 2 * (length * height) + 2 * (width * height);

		// Calculate gallons of paint
		int gallons = wallArea / 350;
		
		// Calculate price
		double price = 32 * gallons;
		
		// Print results
		System.out.println("Wall area: " + wallArea);
		System.out.println("Gallons of paint: " + gallons);
		System.out.println("Price: $" + price);
	}
}
