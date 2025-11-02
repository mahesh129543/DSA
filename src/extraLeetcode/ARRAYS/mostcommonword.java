package extraLeetcode.ARRAYS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class mostcommonword {
    public static void mostCommonWord(String p, String[] b) {
        // Step 1: Normalize paragraph (remove punctuation and lowercase)
        p= p.replaceAll("[^a-zA-Z ]", " ").toLowerCase();

        // Step 2: Split into words
        String[] words = p.split("\\s+");

        // Step 3: Store banned words in a Set
        HashSet<String> bannedSet = new HashSet<>();
        for(int i=0; i<b.length; i++) {
            bannedSet.add(b[i]);
        }

        // Step 4: Count frequencies
        HashMap<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if (!bannedSet.contains(w) && !w.isEmpty()) {
                map.put(w, map.getOrDefault(w, 0) + 1);
            }
        }

        // Step 5: Find the most common word
        String mostCommon = "";
        int maxFreq = 0;
        for (String word : map.keySet()) {
            if (map.get(word) > maxFreq) {
                maxFreq = map.get(word);
                mostCommon = word;
            }
        }

        System.out.println("Word frequencies: " + map);
        System.out.println("Most common word (not banned): " + mostCommon);
    }
    public static void main(String[] args) {
       String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit";
       String[] banned = {"hit"};
       mostCommonWord(paragraph, banned);
    }
}
