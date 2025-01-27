// Patient.java

/**
 * Exercise 4:
 * 
 * Create a class named Patient that includes an ID number, age, and BloodData.
 * Provide a default constructor that sets the ID number to 0, the age to 0, and the BloodData values to the default BloodData values (O and +).
 * Create an overloaded constructor that provides values for each field.
 * Also provide get methods for each field.
 * Save the file as Patient.java.
 */

public class Patient {
	private int id;
	private int age;
	private BloodData blood;

	public Patient() {
		id = 0;
		age = 0;
		blood = new BloodData();
	}
	public Patient(int id, int age, BloodData blood) {
		this.id = id;
		this.age = age;
		this.blood = blood;
	}

	//
	// Getters and Setters
	//

	// ID

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	// Age

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// Blood
	
	public BloodData getBlood() {
		return blood;
	}
	
	public void setBlood(BloodData blood) {
		this.blood = blood;
	}
}
