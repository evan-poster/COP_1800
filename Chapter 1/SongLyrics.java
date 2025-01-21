// SongLyrics.java

/**
 * Exercise 6:
 * Write, compile, and test a class that displays the first few lines of the lyrics of your favorite song. Save the class as SongLyrics.java.
 */

public class SongLyrics {
    private static final String[] LYRICS = {
        "Off we go into the wild blue yonder,",
        "Climbing high into the sun;",
        "Here they come zooming to meet our thunder,",
        "At 'em boys, give 'er the gun (give 'er the gun now!)",
        "Down we dive spouting our flame from under",
        "Off with one helluva roar!",
        "We live in fame or go down in flame, hey!",
        "Nothing'll stop the U.S. Air Force!"
    };

    public static void main(String[] args) {
        for (int i = 0; i < LYRICS.length; i++) {
            System.out.println(LYRICS[i]);
        }
    }

}
