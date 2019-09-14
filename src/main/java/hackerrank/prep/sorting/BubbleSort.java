package hackerrank.prep.sorting;

import java.util.Scanner;

public class BubbleSort {
  static void countSwaps(int[] a) {
    System.out.println(getResult(a));
  }

  public static String getResult(int[] a) {
    int n = a.length;
    int count = 0;
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (a[j] > a[j + 1]) {
          swap(a, j, j+1);
          count++;
        }
      }

    }
    return String.format("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d",count, a[0], a[a.length-1]);
  }

  private static void swap(int[] a, int j, int i) {
    int temp = a[j];
    a[j]=a[i];
    a[i]=temp;
  }


}
