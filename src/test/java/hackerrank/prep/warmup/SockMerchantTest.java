package hackerrank.prep.warmup;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SockMerchantTest {
  private SockMerchant subject;

  @BeforeEach
  void setUp() {
    subject = new SockMerchant();
  }

  @Test
  void sockMerchant1() {
    int result = subject.sockMerchant(9, new int[]{10,20,20,10,10,30,50,10,20});
    assertEquals(3, result);
  }

  @Test
  void sockMerchant2() {
    int result = subject.sockMerchant(7, new int[]{1,2,1,2,1,3,2});
    assertEquals(2, result);
  }
}