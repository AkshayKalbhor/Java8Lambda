package main.java.Chapter1;

/**
 * Class to represent an individual track.
 * a Single piece of music
 * @author kalbhor
 */
public final class Track {
    private final String name;
    private final int length;

    public Track(String name, int length) {
        this.name = name;
        this.length = length;
    }

    /**
     * @return {@link String} name of the track
     */
    public String getName() {
        return name;
    }

    /**
     * @return int length for which it plays.
     */
    public int getLength() {
        return length;
    }
}
