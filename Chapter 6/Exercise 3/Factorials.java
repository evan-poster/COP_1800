/**
 * 
 * Write an application that displays the factorial for every integer value from 1 to a user-entered limit.
 * A factorial of a number is the product of that number multiplied by each positive integer lower than it.
 * For example, 4 factorial is 4 * 3 * 2 * 1, or 24. (You can use the int data type for the factorial, but if you enter a number greater
than 16, the results will be unexpected because the factorial value exceeds the largest value that can be stored
in an int.)
Save the file as Factorials.java.
 *
 */
/**
 * A class that calculates the factorial for every integer value from 1 to a user-entered limit
 */
import java.util.Scanner;

public class Factorials {
	/**
	 * Main entry point
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Prompt the user for input
		System.out.print("Enter the upper limit for factorial calculation: ");
		int limit = scanner.nextInt();
		
		// Calculate the factorial for every integer value from 1 to the limit
		for (int i = 1; i <= limit; i++) {
			long factorial = calculateFactorial(i);
			System.out.println(i + "! = " + factorial);
		}
		
		scanner.close();
	}
	
	/**
	 * Calculates the factorial of n
	 * @param n The number to calculate the factorial of
	 * @return The factorial of n
	 */
	public static long calculateFactorial(int n) {
		if (n == 0 || n == 1) {
			// Base case
			return 1;
		}
		
		// Recursive case
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
}
