package hackerrank.prep.hashMaps;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class CountTripletsTest {
  @Test
  public void test1(){
    assertEquals(2, CountTriplets.countTriplets(Arrays.asList(1L,2L,2L,4L), 2));
  }

  @Test
  public void test2(){
    assertEquals(161700, CountTriplets.countTriplets(Stream.generate(()->1L).limit(100).collect(Collectors.toList()), 1));
  }

  @Test
  public void test3(){
    assertEquals(161700, CountTriplets.countTriplets(Stream.generate(()->1L).limit(5).collect(Collectors.toList()), 1));
  }
}