// TestFitnessTracker.java

/**
 * Exercise 3:
 * 
 * Create an application that instantiates two FitnessTracker objects.
 * Prompt the user for values for one object, and pass those values to the three constructor parameters.
 * Retain the default constructor values for the other object.
 * Display the values for each object.
 * Save the program as TestFitnessTracker.java.
 */

import java.time.LocalDate;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        // Get user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter activity: ");
        String activity = input.nextLine();
        
        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();
        input.nextLine(); // Consume the newline left-over
        
        System.out.print("Enter date (yyyy-mm-dd): ");
        String dateString = input.nextLine();
        LocalDate date = LocalDate.parse(dateString);

        // Create two FitnessTracker objects
        FitnessTracker tracker1 = new FitnessTracker(activity, minutes, date);
        FitnessTracker tracker2 = new FitnessTracker();

        // Display the values for each object
        System.out.println("\nTracker 1:");
        displayTrackerInfo(tracker1);

        System.out.println("\nTracker 2 (default values):");
        displayTrackerInfo(tracker2);

        input.close();
    }

    private static void displayTrackerInfo(FitnessTracker tracker) {
        System.out.println("Activity: " + tracker.getActivity());
        System.out.println("Minutes: " + tracker.getMinutes());
        System.out.println("Date: " + tracker.getDate());
    }
}
