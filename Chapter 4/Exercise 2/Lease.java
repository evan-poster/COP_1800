// Lease.java

/**
 * Exercise 2:
 * 
 * Create a class named Lease with fields that hold an apartment tenant’s name, apartment number,
monthly rent amount, and term of the lease in months. Include a default constructor that initializes the
name to XXX, the apartment number to 0, the rent to 1000, and the term to 12. Also include methods to
get and set each of the fields. Include a nonstatic method named addPetFee() that adds $10 to the
monthly rent value and calls a static method named explainPetPolicy() that explains the pet fee.
Save the class as Lease.java.
 */

public class Lease {
	private String name;
	private int aptNum;
	private double rent;
	private int term;
	
	public Lease() {
		name = "XXX";
		aptNum = 0;
		rent = 1000.0f;
		term = 12;
	}

	//
	// Get/Set for name
	//
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//
	// Get/Set for aptNum
	//
	
	public int getAptNum() {
		return aptNum;
	}

	public void setAptNum(int aptNum) {
		this.aptNum = aptNum;
	}

	//
	// Get/Set for rent
	//
	
	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}

	//
	// Get/Set for term
	//
	
	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	// 
	// Other methods
	//

	public void addPetFee() {
		rent += 10.0f;
	}
	
	public static void explainPetPolicy() {
		System.out.println("Pets incur a $10 per month fee.");
	}
}
