// TestGame.java

/**
 * Exercise 5:
 * 
 * Write an application named TestGame to:
 *  instantiate a Game object
 *  prompt the user for the Game details
 *  pass the Game to a method that displays the details about the Game. (Note that in this program, depending on what the user enters, the two teams are not necessarily playing the same sport! You will be able to fix this logical flaw after you learn about decision making.)
 * Save the file as TestGame.java.
 */

import java.time.LocalTime;
import java.util.Scanner;

public class TestGame {
	public static void main(String[] args) {
		// Create initial teams with sample data
		Team team1 = new Team("Roosevelt High", "Basketball", "Dolphins");
		Team team2 = new Team("Roosevelt High", "Basketball", "Raptors");

		// Prompt the user for input
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the game time (24H)(HH:mm): ");
		String timeString = input.nextLine();
		LocalTime time = LocalTime.parse(timeString);

		// Create a Game object
		Game game = new Game(team1, team2, time);

		// Display the game details
		displayGameDetails(game);
	}

	public static void displayGameDetails(Game game) {
		System.out.println("Game details:");
		System.out.println("Team 1: " + game.getTeam1().getTeamName());
		System.out.println("Sport: " + game.getTeam1().getSport());
		System.out.println("Team 2: " + game.getTeam2().getTeamName());
		System.out.println("Sport: " + game.getTeam2().getSport());
		System.out.println("Game time: " + game.getTime());
	}
}
