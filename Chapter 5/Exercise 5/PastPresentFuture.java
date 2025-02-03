/**
 * 
 * Write an application that uses the LocalDate class to access the current date.
 * Prompt a user for a month, day, and year.
 * Display a message that specifies whether the entered date is
 *  (1) not this year
 *  (2) in an earlier month this year
 *  (3) in a later month this year
 *  (4) this month
 * 
 * Save the file as PastPresentFuture.java.
 * 
 */

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture {
	public static void main(String[] args) {
		// get current date
		LocalDate now = LocalDate.now();
		
		// get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month (1-12): ");
		int month = input.nextInt();
		
		System.out.print("Enter a day (1-31): ");
		int day = input.nextInt();
		
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		
		// create date object
		LocalDate date = LocalDate.of(year, month, day);
		
		// are we this year?
		if (date.getYear() != now.getYear()) {
			System.out.println("The date is not this year.");
		}

		// are we in an earlier month?
		if (date.getMonthValue() < now.getMonthValue()) {
			System.out.println("The date is in an earlier month.");
		} else if (date.getMonthValue() > now.getMonthValue()) {
			System.out.println("The date is in a later month.");
		} else {
			System.out.println("The date is this month.");
		}
		
		input.close();
	}
}
