package hackerrank.prep.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LeftRotationTest {

  @Test
  void rotLeft1() {
    assertArrayEquals(new int[]{5,1,2,3,4},LeftRotation.rotLeft(new int[]{1,2,3,4,5}, 4));
  }

  @Test
  void rotLeft2() {
    assertArrayEquals(new int[]{5,1,2,3,4},LeftRotation.rotLeft(new int[]{1,2,3,4,5}, 14));
  }

  @Test
  void rotLeft3() {
    assertArrayEquals(new int[]{},LeftRotation.rotLeft(new int[]{}, 14));
  }
}