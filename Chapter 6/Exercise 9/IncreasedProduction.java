/**
 * 
 * The Freemont Automobile Factory has set a goal that each worker will
eventually produce 10,000 parts per month. The company has discovered
that the longer a worker has been on the job, the more parts the worker can
produce. Write an application that prompts for the number of parts a worker
currently produces. Then compute and display a worker’s anticipated output
each month for 24 months, assuming the worker’s production increases by 6 percent each month. Also display a
message that shows the month number in which production exceeds 10,000 parts or a message indicating that the
worker will not reach the goal within 24 months. Save the file as IncreasedProduction.java.
 */

import java.util.Scanner;

public class IncreasedProduction {
	public static void main(String[] args) {
		// prompt the user for data
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of parts produced per month: ");
		int parts = input.nextInt();

		// compute the production for each month
		int[] production = new int[24];
		for (int i = 0; i < 24; i++) {
			production[i] = (int) (parts * (1 + i * 0.06));
		}	

		// display the production for each month
		for (int i = 0; i < 24; i++) {
			System.out.println("Month " + (i + 1) + ": " + production[i] + " parts");
		}
		
		input.close();
	}
}
