// TestBloodData.java

/**
 * Exercise 4:
 * 
 * Create an application named TestBloodData that declares two objects.
 * Prompt the user for values for one, and use the default constructor values for the other.
 * Display the details of both objects.
 * Then change the values in the default object so it uses the user’s values, and display the details for the object again to confirm the changes are made correctly.
 * Save the application as TestBloodData.java.
 */

import java.util.Scanner;

public class TestBloodData {
	public static void main(String[] args) {
		// Prompt the user for input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a blood type: ");
		String bloodType = input.nextLine();

		System.out.print("Enter an Rh factor: ");
		String rhFactor = input.nextLine();

		// Create two BloodData objects
		BloodData blood1 = new BloodData(bloodType, rhFactor);
		BloodData blood2 = new BloodData();

		// Display the values of the two objects
		System.out.println("\nBlood 1:");
		DisplayBloodData(blood1);

		System.out.println("\nBlood 2:");
		DisplayBloodData(blood2);

		// Change the values of the second object
		blood2.setBloodType(bloodType);
		blood2.setRhFactor(rhFactor);

		// Display the values of the two objects again
		System.out.println("\nBlood 2:");
		DisplayBloodData(blood2);
	}

	public static void DisplayBloodData(BloodData blood) {
		System.out.println("Blood Type: " + blood.getBloodType());
		System.out.println("Rh Factor: " + blood.getRhFactor());
	}
}
