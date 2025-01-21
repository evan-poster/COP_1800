// JobPricing.java

/**
 * Exercise 9:
 * 
 * Herbert's Home Repair estimates each job cost as the cost of materials plus $35 per hour while on the job, plus $12 per hour for travel time to the job site. Create a class that contains a main() method that prompts the user for the name of a job (for example, Smith bathroom remodel), the cost of materials, the number of hours of work required, and the number of hours travel time. Pass the numeric data to a method that computes estimate for the job and returns the computed value to the main() method where the job name and estimated price are displayed. Save the program as JobPricing.java.
 */

import java.util.Scanner;

public class JobPricing {
	public static void main(String[] args) {
		// Define rates
		int hourlyRate = 35;
		int travelRate = 12;

		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the name of the job: ");
		String jobName = input.nextLine();
		System.out.print("Enter the cost of materials: ");
		double materials = input.nextDouble();
		System.out.print("Enter the number of hours of work required: ");
		double hoursWork = input.nextDouble();
		System.out.print("Enter the number of hours travel time: ");
		double hoursTravel = input.nextDouble();
		
		// Calculate price
		double price = calculatePrice(materials, hoursWork, hoursTravel, hourlyRate, travelRate);
		
		// Print results
		System.out.println("Job name: " + jobName);		
		System.out.println("Materials: $" + materials);		
		System.out.println("Hours of work: " + hoursWork);		
		System.out.println("Hours of travel: " + hoursTravel);		
		System.out.println("Price: $" + price);		
	}

	static double calculatePrice(double materials, double hoursWork, double hoursTravel, int hourlyRate, int travelRate) {
		return materials + (hoursWork * hourlyRate) + (hoursTravel * travelRate);
	}
}
