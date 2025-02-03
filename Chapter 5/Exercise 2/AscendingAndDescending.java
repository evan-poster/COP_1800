/**
 * 
 * Write an application that asks a user to enter three integers. Display them in ascending and descending order.
 * 
 * Save the file as AscendingAndDescending.java.
 * 
 */

import java.util.Scanner;
import java.util.Arrays;

public class AscendingAndDescending {
	public static void main(String[] args) {
		// prompt user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three integers: ");

		// store the input in three variables
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();

		int[] numbers = {num1, num2, num3};
		Arrays.sort(numbers);

		// print the numbers in ascending order
		System.out.println("In ascending order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);

		// print the numbers in descending order
		System.out.println("In descending order: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);
	}
}
