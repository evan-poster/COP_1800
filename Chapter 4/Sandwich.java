// Sandwich.java

/**
 * Exercise 1:
 * 
 * a. Create a class named Sandwich. Data fields include a String for the main ingredient (such as tuna), a
 * String for bread type (such as wheat), and a double for price (such as 4.99). Include methods to get	
 * and set values for each of these fields. Save the class as Sandwich.java.
 */

public class Sandwich {
	String mainIngredient;
	String breadType;
	double price;

	public Sandwich(String mainIngredient, String breadType, double price) {
		this.mainIngredient = mainIngredient;
		this.breadType = breadType;
		this.price = price;
	}

	//
	// Get/Set for mainIngredient
	//

	public String getMainIngredient() {
		return mainIngredient;
	}

	public void setMainIngredient(String newMainIngredient) {
		mainIngredient = newMainIngredient;
	}

	//
	// Get/Set for breadType
	//

	public String getBreadType() {
		return breadType;
	}

	public void setBreadType(String newBreadType) {
		breadType = newBreadType;
	}

	//
	// Get/Set for price
	//

	public double getPrice() {
		return price;
	}

	public void setPrice(double newPrice) {
		price = newPrice;
	}
}
