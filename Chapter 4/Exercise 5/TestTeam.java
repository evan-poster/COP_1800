// TestTeam.java

/**
 * Exercise 5:
 * 
 * Write an application named TestTeam whose main() method declares three Team objects.
 * For each Team object:
 * 	call a method named setTeamData() that declares a temporary Team object
 *  prompts the user for values for the fields
 *  returns the temporary object to one of the Teams in the main() method.
 * Display all the data, including the motto, for each Team object.
 * Save the file as TestTeam.java.
 */

import java.util.Scanner;

public class TestTeam {
	public static void main(String[] args) {
		// Create 3 teams
		Team team1 = setTeamData();
		Team team2 = setTeamData();
		Team team3 = setTeamData();
		
		// Print out the data for each team
		printTeamData(team1);
		printTeamData(team2);
		printTeamData(team3);
	}

	public static Team setTeamData() {
		// Prompt the user for input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a high school name: ");
		String highSchoolName = input.nextLine();

		System.out.print("Enter a sport: ");
		String sport = input.nextLine();

		System.out.print("Enter a team name: ");
		String teamName = input.nextLine();

		// Create a temporary object
		Team temp = new Team(highSchoolName, sport, teamName);

		return temp;
	}

	public static void printTeamData(Team team) {
		// Print out the data for each team
		System.out.println("Team: " + team.getHighSchoolName() + ", " + team.getSport() + ", " + team.getTeamName());	
	}
}
