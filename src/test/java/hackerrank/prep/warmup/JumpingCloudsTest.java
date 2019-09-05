package hackerrank.prep.warmup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JumpingCloudsTest {
  JumpingClouds subject = new JumpingClouds();

  @Test
  void jumpingOnClouds1() {
    assertEquals(4, subject.jumpingOnClouds(new int[]{0,0,1,0,0,1,0}));
  }

  @Test
  void jumpingOnClouds2() {
    assertEquals(3, subject.jumpingOnClouds(new int[]{0,0,0,0,1,0}));
  }

  @Test
  void jumpingOnClouds3() {
    assertEquals(2, subject.jumpingOnClouds(new int[]{0,0,0,1,0}));
  }
}