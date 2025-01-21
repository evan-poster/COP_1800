// TableAndChairs.java

/**
 * Exercise 8:
 * Write, compile, and test a class that displays the pattern shown inFigure 1-25. Save the class as TableAndChairs.java.
 */

public class TableAndChairs {
	private static final String[] CHAIR_RIGHT = {
		"X    ",
		"X    ",
		"X    ",
		"XXXXX",
		"X   X",
		"X   X"
	};

	private static final String[] TABLE = {
		"          ",
		"          ",
		"XXXXXXXXXX",
		"X        X",
		"X        X",
		"X        X"
	};

	private static final String[] CHAIR_LEFT = {
		"    X",
		"    X",
		"    X",
		"XXXXX",
		"X   X",
		"X   X"
	};

    public static void main(String[] args) {
		printTableAndChairs();
	}

	public static void printTableAndChairs() {
		for (int i = 0; i < 6; i++) {
			System.out.print(CHAIR_RIGHT[i] + " " + TABLE[i] + " " + CHAIR_LEFT[i]);
			System.out.println();
		}
	}
}