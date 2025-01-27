// Team.java

/**
 * Exercise 5:
 * 
 * Create a class to hold data about a high school sports team.
 * The Team class holds data fields for:
 * 	high school name (such as Roosevelt High)
 *  sport (such as Basketball)
 *  team name (such as Dolphins)
 * Include a constructor that takes parameters for each field, and include get methods that return the values of the fields.
 * Also include a public final static String named MOTTO and initialize it to Sportsmanship!. Save the class as Team.java.
 */

public class Team {
	private String highSchoolName;
	private String sport;
	private String teamName;
	
	public Team(String highSchoolName, String sport, String teamName) {
		this.highSchoolName = highSchoolName;
		this.sport = sport;
		this.teamName = teamName;
	}
	
	// Getters and Setters

	//
	// highSchoolName
	//

	public String getHighSchoolName() {
		return highSchoolName;
	}

	public void setHighSchoolName(String highSchoolName) {
		this.highSchoolName = highSchoolName;
	}

	// sport
	
	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	// teamName
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}	
	
	public static final String MOTTO = "Sportsmanship!";
}
