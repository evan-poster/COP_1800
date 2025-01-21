// Triangle.java

/** 
 * Exercise 9:
 * 
 * Write, compile, and test a class that displays the pattern shown in Figure 1-26. Save the class as Triangle.java.
 */

public class Triangle {

	public static String print_chars(int i, String s) {
		String value = "";
		for (int j = 0; j < i; j++) {
			value += s;
		}
		return value;
	}

	public static void main(String[] args) {
		String symbol = "T";
		int rows = 7;
		String[] row_data = new String[rows];

		for (int i = 0; i < rows; i++) {
			// Not initializing row string results in 'null' output on each row
			row_data[i] = "";

			// Add our left spacing
			row_data[i] += print_chars(rows-i-1, " ");

			// Add our triangle
			row_data[i] += print_chars(2*i+1, symbol);

			// Add our right spacing
			row_data[i] += print_chars(rows-i-1, " ");
		}

		boolean reverse = false;
		if (args.length > 0 && args[0].equals("-i")) {
			for (int i = rows - 1; i >= 0; i--) {
				System.out.println(row_data[i]);
			}
		} else {
			for (int i = 0; i < rows; i++) {
				System.out.println(row_data[i]);
			}
		}
	}
}
