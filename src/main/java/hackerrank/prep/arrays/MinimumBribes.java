package hackerrank.prep.arrays;

import java.util.HashMap;
import java.util.Map;

public class MinimumBribes {

  public static void minimumBribes(int[] q) {
    System.out.println(getMinimumBribes(q));
  }

  public static String getMinimumBribes(int[] q) {
    long swaps = 0;
    int[] posReverse = new int[q.length];
    int[] swapCount = new int[q.length];
    for(int i=0; i<q.length; i++){
      q[i]--;
      posReverse[q[i]]= i;
    }
    for(int i=0; i<q.length; i++){
      int posOfi = posReverse[i];
      while(posOfi!=i){
        while(posOfi>i){
          int k = q[posOfi-1];
          q[posOfi]=k;
          q[posOfi-1]=i;
          swaps++;
          posReverse[k]=posOfi;
          posReverse[i]=posOfi-1;
          swapCount[k]++;
          if(swapCount[k]>2){
            return "Too chaotic";
          }
          posOfi--;
        }
      }
    }
    return String.valueOf(swaps);
  }

}
