package hackerrank.prep.hashmaps;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class RansomNoteTest {
  @Test
  public void test1() {
    assertEquals("Yes", RansomNote.getCheckMagazine("give me one grand today night".split(" "),
        "give one grand today".split(" ")));
  }
  @Test
  public void test2() {
    assertEquals("No", RansomNote.getCheckMagazine("ive got a lovely bunch of coconuts".split(" "),
        "ive got some coconuts".split(" ")));
  }


}