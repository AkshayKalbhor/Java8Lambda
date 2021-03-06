package main.java.Chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static java.util.Collections.unmodifiableList;

public final class Artist {
    private String name;
    private List<Artist> members;
    private String nationality;

    public Artist(String name, String nationality) {
        this(name, Collections.emptyList(), nationality);
    }

    public Artist(String name, List<Artist> members, String nationality) {
        Objects.requireNonNull(members);
        Objects.requireNonNull(name);
        Objects.requireNonNull(nationality);

        this.name = name;
        this.members = new ArrayList<>(members);
        this.nationality = nationality;
    }

    public List<Artist> getMembers() {
        return unmodifiableList(members);
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }
}
