/**
 * 
 * Write an application that asks a user to enter an integer.
 * Pass the integer to a method that determines whether the number is even and returns a Boolean value.
 * Display a statement that indicates whether the integer is even or odd.
 * 
 * Save the file as EvenOdd.java.
 * 
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Create a Scanner object for reading user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        
        // Determine if the number is even
        boolean result = isEven(number);
        
        // Display the result
        System.out.println(number + " is " + (result ? "even" : "odd"));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
