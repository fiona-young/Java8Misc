package hackerrank.prep.hashmaps;

import static java.util.stream.Collectors.joining;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FrequencyQueries {

  static List<Integer> freqQuery(List<int[]> queries) {
    HashMap<Integer, Integer> forwardMap = new HashMap<>();
    HashMap<Integer, Integer> backMap = new HashMap<>();
    List<Integer> result = new ArrayList<>();
    int action;
    int value;
    Integer times;
    Integer freq;
    Integer newFreq;
    for (int[] query : queries) {
      action = query[0];
      value = query[1];
      if(action == 3){
        result.add(backMap.get(value) == null ? 0:1);
      }
      else {
        times = forwardMap.get(value);
        times = times == null ? 0 : times;
        freq = backMap.get(times);
        freq = freq == null ? 0 : freq;

        if (freq > 1) {
          backMap.put(times, freq - 1);
        }
        else if(freq == 1){
          backMap.remove(times);
        }
        if (action == 1) {
          times++;
        } else {
          times--;
        }
        if(times >= 0){
          if(times==0){
            forwardMap.remove(value);
          }else {
            forwardMap.put(value,times);
            newFreq = backMap.get(times);
            newFreq = newFreq == null ? 1 : newFreq + 1;
            backMap.put(times, newFreq);
          }
        }
      }
    }
    return result;
  }

  public static void main(String[] args) throws IOException {
    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
      int q = Integer.parseInt(bufferedReader.readLine().trim());
      List<int[]> queries = new ArrayList<>(q);
      Pattern p  = Pattern.compile("^(\\d+)\\s+(\\d+)\\s*$");
      for (int i = 0; i < q; i++) {
        int[] query = new int[2];
        Matcher m = p.matcher(bufferedReader.readLine());
        if (m.matches()) {
          query[0] = Integer.parseInt(m.group(1));
          query[1] = Integer.parseInt(m.group(2));
          queries.add(query);
        }
      }
      List<Integer> ans = freqQuery(queries);
      try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))) {
        bufferedWriter.write(
            ans.stream()
                .map(Object::toString)
                .collect(joining("\n"))
                + "\n");
      }
    }
  }

}
