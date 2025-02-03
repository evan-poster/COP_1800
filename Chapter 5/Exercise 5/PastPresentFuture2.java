/**
 * 
 * Use the Web to learn how to use the LocalDate Boolean methods isBefore(), isAfter(), and
equals(). Use your knowledge to write a program that prompts a user for a month, day, and year, and
then displays a message specifying whether the entered day is in the past, the current date, or in the
future. Save the file as PastPresentFuture2.java.
 *
 */

import java.time.LocalDate;
import java.util.Scanner;

public class PastPresentFuture2 {
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
		
		if (date.isBefore(now)) {
			System.out.println("The date is in the past.");
		} else if (date.isAfter(now)) {
			System.out.println("The date is in the future.");
		} else {
			System.out.println("The date is today.");
		}
		
		input.close();
	}
}
