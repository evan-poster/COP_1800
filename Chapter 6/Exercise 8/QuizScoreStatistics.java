/**
 * 
 * Write an application that allows a user to enter any number of student quiz scores until the user enters a sentinel 99.
 * If the score entered is less than 0 or greater than 10, display an appropriate message and do not use the score.
 * After all the scores have been entered, display the number of scores entered, the highest score, the lowest score, and the arithmetic average.
 * 
 * Save the file as QuizScoreStatistics.java.
 * 
 */

import java.util.Scanner;

public class QuizScoreStatistics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int count = 0;
		int highest = 0;
		int lowest = 11;
		int score;
		int average;
		do {
			System.out.print("Enter a score (or 99 to quit): ");
			score = input.nextInt();
			if (score >= 0 && score <= 10) {
				total += score;
				count++;
				if (score > highest) {
					highest = score;
				}
				if (score < lowest) {
					lowest = score;
				}
			} else {
				System.out.println("Score must be between 0 and 10.");
			}
		} while (score != 99);
		average = total / count;
		System.out.println("The total number of scores entered is " + count);
		System.out.println("The highest score is " + highest);
		System.out.println("The lowest score is " + lowest);
		System.out.println("The average score is " + average);
	}
}
