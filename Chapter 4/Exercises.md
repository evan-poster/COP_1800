1-5

# Exercise 1

a. Create a class named Sandwich. Data fields include a String for the main ingredient (such as tuna), a
String for bread type (such as wheat), and a double for price (such as 4.99). Include methods to get
and set values for each of these fields. Save the class as Sandwich.java.

b. Create an application named TestSandwich that prompts the user for data, instantiates one Sandwich
object, and displays its values. Save the application as TestSandwich.java.

# Exercise 2

a. Create a class named Lease with fields that hold an apartment tenant’s name, apartment number,
monthly rent amount, and term of the lease in months. Include a default constructor that initializes the
name to XXX, the apartment number to 0, the rent to 1000, and the term to 12. Also include methods to
get and set each of the fields. Include a nonstatic method named addPetFee() that adds $10 to the
monthly rent value and calls a static method named explainPetPolicy() that explains the pet fee.
Save the class as Lease.java.

b. Create a class named TestLease whose main() method declares four Lease objects named lease1,
lease2, lease3, and lease4. Create a getData() method that prompts a user for values for each
field for a Lease, and return a newly constructed Lease object to the main() method, where it is
assigned to one of main()’s first three Lease objects. Do not prompt the user for values for the fourth
Lease object, but let it hold the default values. After the four Lease objects have been assigned
values, pass the lease1 object to a showValues() method that displays the data. Then call the
addPetFee() method with the lease1 object, and confirm that the fee explanation statement is
displayed. Next, call the showValues() method for the lease1 object again and confirm that the pet
fee has been added to the rent. Finally, call the showValues() method with each of the other three
objects. Confirm that three hold the values you supplied as input and one holds the constructor default
values. Save the application as TestLease.java.

# Exercise 3

a. Create a FitnessTracker class that includes three data fields for a fitness activity: a String for the
name of the activity, an int for the number of minutes spent participating, and a LocalDate for the
date. The class includes methods to get each field. Create a default constructor that automatically sets
the activity to running, the minutes to 0, and the date to January 1 of the current year. Overload the
constructor that receives parameters for each of the fields and assigns them appropriately. Save the file
as FitnessTracker.java.

b. Create an application that instantiates two FitnessTracker objects. Prompt the user for values for one
object, and pass those values to the three constructor parameters. Retain the default constructor values
for the other object. Display the values for each object. Save the program as TestFitnessTracker.java.

# Exercise 4

a. Create a class named BloodData that includes String fields that hold a blood type (the four blood
types are O, A, B, and AB) and an Rh factor (the factors are + and –). Create a default constructor that
sets the fields to O and + and an overloaded constructor that requires values for both fields. Include get
and set methods for each field. Save this file as BloodData.java.

c. Create an application named TestBloodData that declares two objects. Prompt the user for values
for one, and use the default constructor values for the other. Display the details of both objects. Then
change the values in the default object so it uses the user’s values, and display the details for the object
again to confirm the changes are made correctly. Save the application as TestBloodData.java.

c.Create a class named Patient that includes an ID number, age, and BloodData. Provide a default
constructor that sets the ID number to 0, the age to 0, and the BloodData values to the default
BloodData values (O and +). Create an overloaded constructor that provides values for each field. Also
provide get methods for each field. Save the file as Patient.java.

d. Create an application that declares three Patient objects. Use all default values for one Patient object,
prompt the user for values for the second Patient object, and for the third object, prompt the user for
Patient data but use default values for that Patient’s BloodData. Save the file as TestPatient.java.

# Exercise 5

a. Create a class to hold data about a high school sports team. The Team class holds data fields for high
school name (such as Roosevelt High), sport (such as Basketball), and team name (such as Dolphins).
Include a constructor that takes parameters for each field, and include get methods that return the
values of the fields. Also include a public final static String named MOTTO and initialize it to
Sportsmanship!. Save the class as Team.java.

b. Write an application named TestTeam whose main() method declares three Team objects. For each
Team object, call a method named setTeamData() that declares a temporary Team object, prompts
the user for values for the fields, and returns the temporary object to one of the Teams in the main()
method. Display all the data, including the motto, for each Team object. Save the file as TestTeam.java.

c. Create a class named Game. Include two Team fields that hold data about the teams participating in the
game. Also include a field for game time (for example, 7 PM). Include a constructor that takes parameters
for two Team objects and a time. Save the file as Game.java.

d. Write an application named TestGame to instantiate a Game object, prompt the user for the Game details,
and then pass the Game to a method that displays the details about the Game. (Note that in this program,
depending on what the user enters, the two teams are not necessarily playing the same sport! You will be
able to fix this logical flaw after you learn about decision making.) Save the file as TestGame.java.