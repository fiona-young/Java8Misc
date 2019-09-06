package hackerrank.prep.hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplets {
  static long countTriplets(List<Long> arr, long r) {
    Map<Long, List<Integer>> progressionMap = new HashMap<>();
    for (int i = 0; i < arr.size(); i++) {
      progressionMap.putIfAbsent(arr.get(i), new ArrayList<>());
      progressionMap.get(arr.get(i)).add(i);
    }
    long count = 0;
    for (Map.Entry<Long, List<Integer>> entry : progressionMap.entrySet()) {
      List<Integer> arr1 = entry.getValue();
      List<Integer> arr2 = progressionMap.get(entry.getKey() * r);
      List<Integer> arr3 = progressionMap.get(entry.getKey() * r * r);
      if (arr2 == null || arr3 == null) {
        continue;
      }

      long[] temp2 = new long[arr2.size()];
      long lastVal = 0;
      int i3 = arr3.size() - 1;
      for (int i2 = arr2.size() - 1; i2 >= 0; i2--) {
        while (i3 > 0 && arr3.get(i3 - 1) > arr2.get(i2)) {
          i3--;
        }
        if (arr2.get(i2) < arr3.get(i3)) {
          temp2[i2] = arr3.size() - i3 + lastVal;
          lastVal = temp2[i2];
        }
      }

      long[] temp1 = new long[arr1.size()];
      lastVal = 0;
      int i2 = temp2.length - 1;
      for (int i1 = arr1.size() - 1; i1 >= 0; i1--) {
        while (i2 > 0 && arr2.get(i2 - 1) > arr1.get(i1)) {
          i2--;
        }
        if (arr1.get(i1) < arr2.get(i2)) {
          temp1[i1] = temp2[i2] + lastVal;
          lastVal = temp1[i1];
        }
      }
      count += lastVal;
    }

    return count;
  }
}

/*  static long countTriplets(List<Long> arr, long r) {
    Map<Long, List<Integer>> progressionMap = new HashMap<>();
    for(int i = 0; i<arr.size();i++){
      progressionMap.putIfAbsent(arr.get(i), new ArrayList<>());
      progressionMap.get(arr.get(i)).add(i);
    }
    long count = 0;
    for (Map.Entry<Long, List<Integer>> entry : progressionMap.entrySet()) {
      List<Integer> arr1 = entry.getValue();
      List<Integer> arr2 = progressionMap.get(entry.getKey() * r);
      List<Integer> arr3 = progressionMap.get(entry.getKey() * r * r);
      if (arr2 == null || arr3 == null) {
        continue;
      }

      Map<Integer, Integer> map2 = new HashMap<>();
      for (int key2 : arr2) {
        for (int j = 0; j < arr3.size(); j++) {
          if (key2 < arr3.get(j)) {
            map2.put(key2, arr3.size()-j);
            break;
          }
        }
      }

      for (int key1 : arr1) {
        for (int key2 : arr2) {
          if (key1 >= key2) {
            continue;
          }
          count+=map2.getOrDefault(key2,0);
        }
      }
    }
    return count;
  }*/

