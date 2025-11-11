package extraLeetcode.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class longestsubstring {
    public static void longestSubstring(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                max = Math.max(max, i-map.get(str.charAt(i)));
            }else if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), i);
            }

        }
        if (max == 0){
            System.out.println("No longest substring");{}
        }
        System.out.println(map);
        System.out.println(max-1);
    }
    public static void main(String[] args) {
        String s1 = "abaca";
        String s2 = "abc";
        longestSubstring(s1);
        longestSubstring(s2);
    }
}
