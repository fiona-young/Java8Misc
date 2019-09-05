package hackerrank.prep.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumBribesTest {

  @Test
  public void test1(){
    assertEquals("3", MinimumBribes.getMinimumBribes(new int[]{2, 1, 5, 3, 4}));
  }

  @Test
  public void test2(){
    assertEquals("Too chaotic", MinimumBribes.getMinimumBribes(new int[]{2, 5, 1, 3, 4}));
  }

  @Test
  public void test3(){
    assertEquals("Too chaotic", MinimumBribes.getMinimumBribes(new int[]{5,1,2,3,7,8,6,4}));
  }

  @Test
  public void test4(){
    assertEquals("7", MinimumBribes.getMinimumBribes(new int[]{1, 2, 5, 3 ,7, 8, 6, 4}));
  }

}