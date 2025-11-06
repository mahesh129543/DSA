package extraLeetcode.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class maxnumofballon {
    public static void maxnumofballon(String t) {

      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
      String b="balloon";
      for (int i = 0; i < t.length(); i++) {
          if(b.contains(String.valueOf(t.charAt(i)))) {
              map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
          }

      }
        System.out.println(map);
      if(map.size() <5) {
          System.out.println("0");
      }
        map.put('l', map.getOrDefault('l', 0) / 2);
        map.put('o', map.getOrDefault('o', 0) / 2);

        // Find the minimum count among all required letters
        int min = Integer.MAX_VALUE;
        for (char c : "balon".toCharArray()) {
            min = Math.min(min, map.getOrDefault(c, 0));
        }

        System.out.println(min);
    }
    public static void main(String[] args) {
        String text = "loonbalxballpon";
        maxnumofballon(text);
    }
}
