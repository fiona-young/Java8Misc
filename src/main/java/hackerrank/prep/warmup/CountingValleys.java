package hackerrank.prep.warmup;

public class CountingValleys {

  int countingValleys(int n, String s) {
    int valleys = 0;
    int height = 0;
    for(char character: s.toCharArray()){
      if(character == 'U'){
        height++;
      }else{
        height--;
      }
      if (height == 0 && character == 'U') {
        valleys++;
      }
    }
    return valleys;

  }

}
