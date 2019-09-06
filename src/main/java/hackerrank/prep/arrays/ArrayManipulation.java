package hackerrank.prep.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayManipulation {

  long arrayManipulation(int n, int[][] queries) {
    List<Point> startList = new ArrayList<>();
    List<Point> endList = new ArrayList<>();
    for(int[] intSet: queries){
      startList.add(new Point(intSet[0], intSet[2]));
      endList.add(new Point(intSet[1], intSet[2]));
    }
    startList.sort(Comparator.comparing(p -> p.position));
    endList.sort(Comparator.comparing(p -> p.position));
    if(startList.isEmpty()){
      return 0;
    }
    long value = 0;
    long valueMax = 0;
    int startIndex = 0;
    int endIndex = 0;
    while(endIndex < endList.size()) {
      if ((startIndex < startList.size()) && (startList.get(startIndex).position <= endList.get(endIndex).position)) {
        value += startList.get(startIndex).value;
        if(value > valueMax){
          valueMax=value;
        }
        startIndex++;

      }
      if ((endIndex < endList.size()) && (startIndex >= endList.size() || startList.get(startIndex).position > endList.get(endIndex).position)) {
        value -= endList.get(endIndex).value;
        endIndex++;
      }
    }
    return valueMax;
  }

  class Point {
    private Integer position;
    private int value;

    public Point(Integer position, int value) {
      this.position = position;
      this.value = value;
    }
  }

}
