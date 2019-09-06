package hackerrank.prep.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayManipulationTest {
  ArrayManipulation subject = new ArrayManipulation();
  @Test
  public void test1(){
    assertEquals(200, subject.arrayManipulation(5,new int[][]{{1,2,100},{2,5,100},{3,4,100}}));
  }

  @Test
  public void test2(){
    assertEquals(10, subject.arrayManipulation(5,new int[][]{{1,5,3},{4,8,7},{6,9,1}}));
  }

}