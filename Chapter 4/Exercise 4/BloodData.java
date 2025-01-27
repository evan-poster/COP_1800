// BloodData.java

/**
 * Exercise 4:
 * 
 * Create a class named BloodData that includes String fields that hold a blood type (the four blood types are O, A, B, and AB) and an Rh factor (the factors are + and –).
 * Create a default constructor that sets the fields to O and + and an overloaded constructor that requires values for both fields.
 * Include get and set methods for each field.
 * Save this file as BloodData.java.
 */

public class BloodData {
	private String bloodType;
	private String rhFactor;
	
	public BloodData() {
		bloodType = "O";
		rhFactor = "+";
	}
	
	public BloodData(String bloodType, String rhFactor) {
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}
	
	//
	// Getters and Setters
	//

	// BloodType

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		if (bloodType.equalsIgnoreCase("O") || bloodType.equalsIgnoreCase("A") || bloodType.equalsIgnoreCase("B") || bloodType.equalsIgnoreCase("AB")) {
			this.bloodType = bloodType.toUpperCase();
		}
	}

	// RhFactor
	
	public String getRhFactor() {
		return rhFactor;
	}

	public void setRhFactor(String rhFactor) {
		if (rhFactor.equals("+") || rhFactor.equals("-")) {
			this.rhFactor = rhFactor;
		}
	}
}
