package hackerrank.prep.warmup;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CountingValleysTest {
  private CountingValleys subject = new CountingValleys();

  @Test
  void countingValleys1() {
    int result = subject.countingValleys(8, "UDDDUDUU");
    assertEquals(1,result);
  }

  @Test
  void countingValleys2() {
    int result = subject.countingValleys(8, "DDUUDDUDUUUD");
    assertEquals(1,result);
  }

}