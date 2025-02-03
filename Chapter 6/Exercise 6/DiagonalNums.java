/**
 * 
 * Write an application that prompts the user for a single-digit integer
and uses a loop to create the pattern shown in the example in
Figure 6-32. In the example, the user entered a 3, and 10 lines are
displayed; each 3 appears one additional space to the right. Save the
file as DiagonalNums.java.
 *
 */

import java.util.Scanner;

public class DiagonalNums {
	public static void main(String[] args) {
		// prompt the user for input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a single digit >> ");
		int num = input.nextInt();

		// loop to create the pattern
		for (int i = 1; i <= 10; i++) {
			// loop to print the elements of the pattern
			for (int j = 1; j <= 10; j++) {
				if (j == i) {
					System.out.print(num + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println(); // print a new line
		}
	}
}
