package hackerrank.prep.arrays;

public class MinimumBribes {

  public static void minimumBribes(int[] q) {
    System.out.println(getMinimumBribes(q));

  }

  public static String getMinimumBribes(int[] q) {
    long swaps = 0;
    for(int i=0; i<q.length-1; i++){
      int me = q[i];
      int next = q[i+1];
      if (me > next) {
        swaps++;
        q[i]=next;
        q[i+1]=me;
      }
      if(q[i] != i+1){
        return "Too chaotic";
      }
    }
    return String.valueOf(swaps);
  }

}
