// MovieQuoteInfo.java

/**
 * Exercise 7:
 * Write, compile, and test a class that displays your favorite movie quote, the movie it comes from, the character who said it, and the year of the movie. Save the class as MovieQuoteInfo.java.
 */

public class MovieQuoteInfo {
    private String quote;
    private String movie;
    private String character;
    private int year;

    public MovieQuoteInfo(String quote, String movie, String character, int year) {
        this.quote = quote;
        this.movie = movie;
        this.character = character;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Favorite Movie Quote: " + quote);
        System.out.println("From the movie: " + movie);
        System.out.println("Character who said it: " + character);
        System.out.println("Year of the movie: " + year);
    }

    public static void main(String[] args) {
        MovieQuoteInfo quoteInfo = new MovieQuoteInfo("Here's looking at you, kid.", "Casablanca", "Humphrey Bogart", 1942);
        quoteInfo.displayInfo();
    }
}
