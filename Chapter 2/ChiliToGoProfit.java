// ChiliToGoProfit.java

/**
 * Exercise 12:
 * 
 * In the ChiliToGo program in Exercise 12, the costs to produce an adult meal and a child’s meal are $4.35 and $3.10, respectively. Modify the ChiliToGo program to display the total profit for each type of meal as well as the grand total profit. Save the program as ChiliToGoProfit.java.
 */

import java.util.Scanner;

public class ChiliToGoProfit {
	public static void main(String[] args) {
		// Get input from user
		Scanner input = new Scanner(System.in);

		// Get number of meals
		System.out.print("Enter the number of adult meals: ");
		int adults = input.nextInt();
		System.out.print("Enter the number of children meals: ");
		int children = input.nextInt();
		
		// Calculate revenue
		double adultRevenue = 7 * adults;
		double childRevenue = 4 * children;
		double totalRevenue = adultRevenue + childRevenue;
		
		// Calculate costs
		double adultCost = 4.35 * adults;
		double childCost = 3.10 * children;
		double totalCost = adultCost + childCost;
		
		// Calculate profits
		double adultProfit = adultRevenue - adultCost;
		double childProfit = childRevenue - childCost;
		double totalProfit = totalRevenue - totalCost;

		// Print results
		System.out.println("Adults: " + adults);
		System.out.println("Children: " + children);
		System.out.println("Total Revenue: $" + totalRevenue);
		System.out.println("Adult Profit: $" + adultProfit);
		System.out.println("Child Profit: $" + childProfit);
		System.out.println("Total Profit: $" + totalProfit);
	}
}
