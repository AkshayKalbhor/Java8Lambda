package test.java.Chapter1;

import main.java.Chapter1.Album;
import org.junit.Test;

import java.util.Collections;

public class Chapter1Test {

    @Test
    public void testAllMembers() {
        Album album = new Album("Doorie", Collections.emptyList(), Collections.singletonList(theBeatles));
    }
}
