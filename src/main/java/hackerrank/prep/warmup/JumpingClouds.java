package hackerrank.prep.warmup;

public class JumpingClouds {
  int jumpingOnClouds(int[] c) {
    int index =0;
    int jumps = 0;
    while(true){
      jumps ++;
      index += 2;
      if(index >= c.length-1){
        break;
      }
      if(c[index] == 1){
        index--;
      }
    }
    return jumps;
  }
}
