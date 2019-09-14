package hackerrank.prep.sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleSortTest {
  @Test
  public void test1(){
    assertEquals("Array is sorted in 3 swaps.\n"
        + "First Element: 1\n"
        + "Last Element: 6", BubbleSort.getResult(new int[]{6,4,1}));
  }
  @Test
  public void test2(){
    assertEquals("Array is sorted in 0 swaps.\n"
        + "First Element: 1\n"
        + "Last Element: 3", BubbleSort.getResult(new int[]{1,2,3}));
  }


}