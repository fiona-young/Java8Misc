package hackerrank.prep.warmup;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {
  int sockMerchant(int n, int[] ar) {
    Map<Integer, Integer> sockCounter = new HashMap<>();
    for(int sockColor: ar){
      sockCounter.put(sockColor, sockCounter.getOrDefault(sockColor, 0)+1);
    }
    int colourPairs = 0;
    for(Integer sockOfColour: sockCounter.values()){
      colourPairs += sockOfColour/2;
    }
    return colourPairs;

  }
}
