package hackerrank.prep.arrays;

public class LeftRotation {
  static int[] rotLeft(int[] a, int d) {
    int[] result =new int[a.length];
    if(a.length==0){
      return result;
    }
    d=d%a.length;
    for(int i = 0; i<a.length;i++){
      int j = i-d;
      if(j<0){
        j+=a.length;
      }
      result[j]=a[i];
    }
    return result;
  }
}
