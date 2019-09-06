package hackerrank.prep.hashmaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
  private CountTriplets(){}
  static long countTriplets(List<Long> arr, long r) {
    Map<Long, Long> firstVal = new HashMap<>();
    Map<Long, Long> secondVal = new HashMap<>();
    long count = 0;
    for (long val: arr) {
      if(secondVal.containsKey(val/r)){
        count+=secondVal.get(val/r);
      }
      if(firstVal.containsKey(val/r)){
        secondVal.put(val, secondVal.getOrDefault(val,0L)+firstVal.get(val/r));
      }
      firstVal.put(val, 1+firstVal.getOrDefault(val,0L));
    }
    return count;
  }
}
