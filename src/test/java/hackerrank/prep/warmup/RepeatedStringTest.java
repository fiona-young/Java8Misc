package hackerrank.prep.warmup;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RepeatedStringTest {
private final RepeatedString subject = new RepeatedString();
@Test
  public void test1(){
  assertEquals(7,subject.repeatedString("aba",10));
}

  @Test
  public void test2(){
    assertEquals(2,subject.repeatedString("aba",3));
  }

  @Test
  public void test3(){
    assertEquals(1000000000000L,subject.repeatedString("a",1000000000000L));
  }
}