package hackerrank.prep.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumSwapsTest {
  MinimumSwaps subject = new MinimumSwaps();
  @Test
  public void test1(){
    assertEquals(3, subject.getMinimumSwaps(new int[]{4,3,1,2}));
  }

  @Test
  public void test2(){
    assertEquals(3, subject.getMinimumSwaps(new int[]{2,3,4,1,5}));
  }
}