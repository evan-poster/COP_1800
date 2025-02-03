/*
 *
 * Write an application that includes final constants named START and STOP that are set to 5 and 500,
respectively. The application counts by five from 5 through 500 inclusive, and it starts a new line after every
multiple of 50 (50, 100, 150, and so on). Save the file as CountByFives.java.
 */

public class CountByFives {
	final static int START = 5;
	final static int STOP = 500;

	public static void main(String[] args) {
		// Count by 5 from 5 to 500
		for (int i = START; i <= STOP; i += 5) {
			System.out.print(i + " ");
			// Print a new line after every multiple of 50
			if (i % 50 == 0) {
				System.out.println();
			}
		}
	}
}
