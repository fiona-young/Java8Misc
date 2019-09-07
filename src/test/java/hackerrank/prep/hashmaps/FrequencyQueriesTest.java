package hackerrank.prep.hashmaps;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

class FrequencyQueriesTest {

  @Test
  void freqQuery1() {
    assertEquals(Arrays.asList(0,1), FrequencyQueries.freqQuery(Arrays
        .asList(new int[]{1, 5}, new int[]{1, 6}, new int[]{3,2}, new int[]{1, 10},
            new int[]{1, 10}, new int[]{1,6}, new int[]{2,5}, new int[]{3,2})));
  }
  @Test
  void freqQuery2() {
    Random r = new Random();
    List<int[]> a = Stream.generate(() -> new int[]{r.nextInt(3)+1, r.nextInt(50)+1})
        .limit(100000).collect(toList());
    assertEquals(1,1);
  }

  @Test
  public void testLongFile() throws IOException {
    BufferedReader bufferedReader =  new BufferedReader(new FileReader( "src/test/java/hackerrank/prep/hashmaps/FrequencyQueriesTestIn.txt"));
    BufferedReader bufferedReaderOutput = new BufferedReader(new FileReader( "src/test/java/hackerrank/prep/hashmaps/FrequencyQueriesTestOut.txt"));

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

    List<Integer> expectedResult = new ArrayList<>();
    while(true){
      String line = bufferedReaderOutput.readLine();
      if(line==null){
        break;
      }
      expectedResult.add(Integer.parseInt(line.trim()));
    }
    assertEquals(expectedResult, FrequencyQueries.freqQuery(queries));
  }
}