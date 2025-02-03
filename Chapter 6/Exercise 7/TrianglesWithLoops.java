/**
 * 
 * Accept a digit from the user, then display a seven-line triangle pattern
that uses the digit. Figure 6-33 shows a typical execution. The
program can contain no more than three output statements. Save the
file as TriangleWithLoops.java.
 *
 */

import java.util.Scanner;

public class TrianglesWithLoops {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a digit >> ");
		int digit = input.nextInt();
		for (int i = 1; i <= 7; i++) {
			for (int j = 7; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print(digit);
			}
			System.out.println();
		}
	}
}
