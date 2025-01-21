// Dollars.java

/**
 * Exercise 14:
 * 
 * Write a program that calculates and displays the conversion of an entered number of dollars into currency denominations—20s, 10s, 5s, and 1s. Save the program as Dollars.java.
 */

public class Dollars {
	public static void main(String[] args) {
		int dollars = 0;
		int twenties = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		
		System.out.print("Enter the number of dollars: ");
		dollars = Integer.parseInt(System.console().readLine());
		
		twenties = dollars / 20;
		dollars = dollars % 20;
		
		tens = dollars / 10;
		dollars = dollars % 10;
		
		fives = dollars / 5;
		dollars = dollars % 5;
		
		ones = dollars;
		
		System.out.println("20s: " + twenties);
		System.out.println("10s: " + tens);
		System.out.println("5s: " + fives);
		System.out.println("1s: " + ones);
	}
}
