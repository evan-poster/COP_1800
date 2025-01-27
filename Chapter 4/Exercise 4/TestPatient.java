// TestPatient.java

/**
 * Exercise 4:
 * 
 * Create an application that declares three Patient objects.
 * Use all default values for one Patient object
 * Prompt the user for values for the second Patient object
 * For the third object, prompt the user for Patient data but use default values for that Patient’s BloodData.
 * Save the file as TestPatient.java.
 * 
 */

import java.util.Scanner;

public class TestPatient {
	public static void main(String[] args) {
		// Prompt the user for input
		Scanner input = new Scanner(System.in);

		// Create three Patient objects
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		Patient patient3 = new Patient();

		// Change the values of the second object
		System.out.print("Enter a patient ID: ");
		patient2.setId(input.nextInt());

		System.out.print("Enter a patient age: ");
		patient2.setAge(input.nextInt());
		input.nextLine();

		System.out.print("Enter a blood type: ");
		String bloodType = input.nextLine();

		System.out.print("Enter an Rh factor: ");
		String rhFactor = input.nextLine();

		patient2.getBlood().setBloodType(bloodType);
		patient2.getBlood().setRhFactor(rhFactor);

		// Prompt the values of the third object
		System.out.print("Enter a patient ID: ");
		patient3.setId(input.nextInt());

		System.out.print("Enter a patient age: ");
		patient3.setAge(input.nextInt());

		// Display the values of the three objects
		System.out.println("\nPatient 1:");
		DisplayPatient(patient1);

		System.out.println("\nPatient 2:");
		DisplayPatient(patient2);

		System.out.println("\nPatient 3:");
		DisplayPatient(patient3);
	}

	public static void DisplayPatient(Patient patient) {
		System.out.println("ID: " + patient.getId());
		System.out.println("Age: " + patient.getAge());
		System.out.println("Blood Type: " + patient.getBlood().getBloodType());
		System.out.println("Rh Factor: " + patient.getBlood().getRhFactor());
	}
}
