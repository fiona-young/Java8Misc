package hackerrank.prep.hashmaps;

import java.util.HashMap;

public class RansomNote {
  static void checkMagazine(String[] magazine, String[] note) {
   System.out.println(RansomNote.getCheckMagazine(magazine, note));
  }

  static String getCheckMagazine(String[] magazine, String[] note) {
    HashMap<String, Integer> magMap = new HashMap<>();
    for(String magWord: magazine){
      magMap.put(magWord, magMap.getOrDefault(magWord,0)+1);
    }

    for(String noteWord: note){
      Integer currentCount = magMap.get(noteWord);
      if(currentCount==null || currentCount.equals(0)){
        return "No";
      }
      magMap.put(noteWord, currentCount-1);
    }
    return "Yes";
  }
}
