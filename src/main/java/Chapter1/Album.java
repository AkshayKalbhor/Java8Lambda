package main.java.Chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

import static java.util.Collections.unmodifiableList;

/**
 * @author kalbhor
 */
public final class Album {
    private String name;
    private List<Track> tracks;
    private List<Artist> musicians;

    public Album(String name, List<Track> tracks, List<Artist> musicians) {

        //Check if the parameters are not null
        Objects.requireNonNull(name);
        Objects.requireNonNull(tracks);
        Objects.requireNonNull(musicians);

        this.name = name;
        this.tracks = new ArrayList<>(tracks);
        this.musicians = new ArrayList<>(musicians);
    }


    public String getName() {
        return name;
    }

    public Stream<Track> getTracks() {
        return tracks.stream();
    }

    public List<Track> getTrackList() {
        return unmodifiableList(tracks);
    }

    public List<Artist> getMusiciansList() {
        return unmodifiableList(musicians);
    }

    public Stream<Artist> getMusicians() {
        return musicians.stream();
    }

    public Artist getMusician() {
        return musicians.get(0);
    }

}