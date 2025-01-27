// TestLease.java

/**
 * Exercise 2:
 * 
 * #DONE Create a class named TestLease whose main() method declares four Lease objects named lease1, lease2, lease3, and lease4.
 *
 * #DONE Create a getData() method that prompts a user for values for each field for a Lease, and return a newly constructed Lease object to the main() method, where it is assigned to one of main()’s first three Lease objects.
 *
 * #DONE Do not prompt the user for values for the fourth Lease object, but let it hold the default values.
 * 
 * #DONE After the four Lease objects have been assigned values, pass the lease1 object to a showValues() method that displays the data.
 * 
 * #DONE Then call the addPetFee() method with the lease1 object, and confirm that the fee explanation statement is displayed.
 * 
 * #DONE Next, call the showValues() method for the lease1 object again and confirm that the pet fee has been added to the rent.
 * 
 * #DONE Finally, call the showValues() method with each of the other three objects.
 * 
 * #DONE Confirm that three hold the values you supplied as input and one holds the constructor default values. Save the application as TestLease.java.
 * 
 */

import java.util.Scanner;

public class TestLease {
	public static void main(String[] args) {
		// Lease objects
		Lease leases[] = new Lease[4];

		for (int i = 0; i < leases.length -1; i++) {
			leases[i] = getData();
		}
		leases[3] = new Lease();

		showValues(leases[0]);
		leases[0].addPetFee();
		leases[0].explainPetPolicy();
		showValues(leases[0]);

		for (int i = 1; i < leases.length; i++) {
			showValues(leases[i]);
		}

	}

	public static Lease getData() {
		Scanner input = new Scanner(System.in);

		Lease lease = new Lease();

		System.out.print("Enter name: ");
		lease.setName(input.nextLine());
		
		System.out.print("Enter apartment number: ");
		lease.setAptNum(input.nextInt());
		
		System.out.print("Enter monthly rent: ");
		lease.setRent(input.nextDouble());
		
		System.out.print("Enter term: ");
		lease.setTerm(input.nextInt());

		return lease;
	}

	public static void showValues(Lease lease) {
		System.out.println(lease.getName() + " " + lease.getAptNum() + " " + lease.getRent() + " " + lease.getTerm());
	}
}