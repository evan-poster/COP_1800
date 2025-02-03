/**
 * 
 * Add a prompt to the ShadyRestRoom application to ask the user to specify a (1) lake view or a (2) park
view, but ask that question only if the bed size entry is valid. Add $15 to the price of any room with a lake
view. If the view value is invalid, display an appropriate message and assume that the price is for a room
with a lake view.
 *
 Save the file as ShadyRestRoom2.java.
 *
 */
import java.util.Scanner;

public class ShadyRestRoom2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a bed type
		System.out.print("Enter 1 for a queen bed, 2 for a king, or 3 for a king and a pullout couch: ");
		int bedType = input.nextInt();
		
		// Initialize variables
		double price = 0;
		int viewType = 0;

		// Prompt the user to enter a view type
		if (bedType >= 1 && bedType <= 3) {
			System.out.print("Enter 1 for a lake view or 2 for a park view: ");
			viewType = input.nextInt();

			// Add $15 to the price of any room with a lake view
			if (viewType == 1) {
				price += 15; // Add $15 to the price of any room with a lake view
			} else if (viewType != 2) {
				System.out.println("Invalid view type. Lake view will be assumed.");
				viewType = 1;
				price += 15;
			}
		}

		// Determine the price based on bed type
		if (bedType == 1) {
			price += 125; // Price for queen bed
		} else if (bedType == 2) {
			price += 139; // Price for king bed
		} else if (bedType == 3) {
			price += 165; // Price for suite with king bed and pullout couch
		} else {
			System.out.println("Invalid code"); // Handle invalid input
		}

		// Display the bed type, view type and price
		System.out.println("Bed type: " + bedType);
		System.out.println("View type: " + viewType);
		System.out.println("Price: $" + price);
	}
}

