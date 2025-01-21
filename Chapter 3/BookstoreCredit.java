// BookstoreCredit.java

/**
 * Exercise 5:
 * 
 * To encourage good grades, Hermosa High School has decided to award each ­student a bookstore credit that is 10 times the student’s grade point average. In other words, a student with a 3.2 grade point average receives a $32 credit. ­Create a class that prompts a student for a name and grade point average, and then passes the values to a method that displays a descriptive message. The ­message uses the student’s name, echoes the grade point average, and computes and displays the credit. Save the application as BookstoreCredit.java.
 * 
 */

import java.util.Scanner;

public class BookstoreCredit {
	public static void main(String[] args) {
		// Get input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = input.nextLine();
		System.out.print("Enter your grade point average: ");
		double gpa = input.nextDouble();

		// Limit to 4.0 max
		gpa = Math.min(gpa, 4.0);
		
		// Calculate credit
		double credit = 10 * gpa;
		
		// Print results
		System.out.println("Name: " + name);
		System.out.println("GPA: " + gpa);
		System.out.println("Credit: $" + credit);
	}
}
