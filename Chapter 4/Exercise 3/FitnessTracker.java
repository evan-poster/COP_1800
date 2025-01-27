// FitnessTracker.java

/**
 * Exercise 3:
 * 
 * Create a FitnessTracker class that includes three data fields for a fitness activity:
 *  a String for the name of the activity
 *  an int for the number of minutes spent participating
 *  a LocalDate for the date.
 * The class includes methods to get each field.
 * Create a default constructor that automatically sets the activity to running, the minutes to 0, and the date to January 1 of the current year.
 * Overload the constructor that receives parameters for each of the fields and assigns them appropriately.
 * Save the file as FitnessTracker.java.
 */

import java.time.LocalDate;

public class FitnessTracker {
	private String activity;
	private int minutes;
	private LocalDate date;
	
	public FitnessTracker() {
		activity = "running";
		minutes = 0;
		date = LocalDate.of(java.time.LocalDate.now().getYear(), 1, 1);
	}
	
	public FitnessTracker(String activity, int minutes, LocalDate date) {
		this.activity = activity;
		this.minutes = minutes;
		this.date = date;
	}
	
	public String getActivity() {
		return activity;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public LocalDate getDate() {
		return date;
	}
}
