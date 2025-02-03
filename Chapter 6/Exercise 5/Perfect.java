/**
 * 
 * Write an application that displays every perfect number from 1 through a user-supplied limit.
 * A perfect number is one that equals the sum of all the numbers that divide evenly into it.
 * For example, 6 is perfect because 1, 2, and 3 divide evenly into it, and their sum is 6;
 * however, 12 is not a perfect number because 1, 2, 3, 4, and 6 divide evenly into it, and their sum is greater than 12.
 * Save the file as Perfect.java.
 * 
 */

import java.util.Scanner;

public class Perfect {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("Enter the upper limit for perfect number calculation: ");
		int limit = scanner.nextInt();
		
		// Calculate the perfect numbers for every integer value from 1 to the limit
		for (int i = 1; i <= limit; i++) {
			if (isPerfect(i)) {
				System.out.println(i + " is a perfect number.");
			} else {
				System.out.println(i + " is not a perfect number.");
			}
		}
		
		scanner.close();
	}

	public static boolean isPerfect(int number) {
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		return sum == number;
	}
}
