package extraLeetcode.Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class uncommonWord {
    public static void uncommonWord(String s1, String s2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        String[] words1 = s1.toLowerCase().split("\\s+");
        String[] words2 = s2.toLowerCase().split("\\s+");
        for (int i = 0; i < words1.length; i++) {
            map1.put(words1[i], map1.getOrDefault(words1[i], 0) + 1);

        }
        System.out.println(map1);
        for (int i = 0; i < words2.length; i++) {
            map1.put(words2[i], map1.getOrDefault(words2[i], 0) + 1);
        }
        System.out.println(map1);
        for(String word : map1.keySet()){
            if(map1.get(word) == 1){
                list1.add(word);

            }
        }
        System.out.println(list1);
    }
    public static void main(String[] args) {
      String  s1 = "this apple is sweet", s2 = "this apple is sour";
      uncommonWord(s1, s2);
    }
}
