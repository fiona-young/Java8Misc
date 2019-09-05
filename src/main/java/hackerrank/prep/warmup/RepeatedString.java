package hackerrank.prep.warmup;

public class RepeatedString {
  long repeatedString(String s, long n) {
    long fullTimes = n/s.length();
    long partialLength = n%s.length();
    int fullCount = 0;
    int partialCount = 0;
    for(int i=0; i<s.length();i++){
      if(s.charAt(i)=='a'){
        fullCount++;
      }
      if(i == (partialLength-1)){
        partialCount=fullCount;
      }
    }
    return fullTimes*fullCount+partialCount;

  }
}
