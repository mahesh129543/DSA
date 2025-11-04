package extraLeetcode.Strings;

import java.util.HashMap;

public class wordpattern {
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> mp = new HashMap<>();
        HashMap<String, Character> reverse = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String w = words[i];

            // check forward mapping
            if (mp.containsKey(ch)) {
                if (!mp.get(ch).equals(w)) return false;
            } else {
                mp.put(ch, w);
            }

            // check reverse mapping
            if (reverse.containsKey(w)) {
                if (reverse.get(w) != ch) return false;
            } else {
                reverse.put(w, ch);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s)); // ✅ true
    }
}
