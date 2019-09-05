package hackerrank.prep.arrays;

public class MinimumSwaps {

  public int getMinimumSwaps(int[] q) {
    int swaps = 0;
    int[] posReverse = new int[q.length];
    for(int i=0; i<q.length; i++){
      q[i]--;
      posReverse[q[i]]= i;
    }
    for (int i = 0; i < q.length; i++) {
      int posOfi = posReverse[i];
      if (posOfi != i) {
        int k = q[i];
        q[posOfi] = k;
        q[i] = i;
        swaps++;
        posReverse[k] = posOfi;
        posReverse[i] = i;
      }
    }
    return swaps;
  }
}
