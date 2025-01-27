// Game.java

/**
 * Exercise 5:
 * 
 * Create a class named Game. Include two Team fields that hold data about the teams participating in the game.
 * Also include a field for game time (for example, 7 PM).
 * Include a constructor that takes parameters for two Team objects and a time.
 * Save the file as Game.java.
 */

import java.time.LocalTime;

public class Game {
	private Team team1;
	private Team team2;
	private LocalTime time;
	
	public Game(Team team1, Team team2, LocalTime time) {
		this.team1 = team1;
		this.team2 = team2;
		this.time = time;
	}

	//
	// Getters and Setters
	//

	// Team1
	public Team getTeam1() {
		return team1;
	}

	public void setTeam1(Team team1) {
		this.team1 = team1;
	}

	// Team2

	public Team getTeam2() {
		return team2;
	}

	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

	// Time

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}
}
