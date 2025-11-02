package extraLeetcode.ARRAYS;

import java.util.HashMap;

public class shotcompletingword {
    public static void shortest(String word, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: build frequency map from licensePlate
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("License Plate Map: " + map);

        String shortestWord = null;

        // Step 2: check each word
        for (String s : words) {
            // copy the map for this word
            HashMap<Character, Integer> temp = new HashMap<>(map);

            for (int i = 0; i < s.length(); i++) {
                char ch = Character.toLowerCase(s.charAt(i));
                if (temp.containsKey(ch)) {
                    int val = temp.get(ch);
                    if (val == 1)
                        temp.remove(ch);
                    else
                        temp.put(ch, val - 1);
                }
            }

            // if temp is empty, s satisfies all requirements
            if (temp.isEmpty()) {
                if (shortestWord == null || s.length() < shortestWord.length()) {
                    shortestWord = s;
                }
            }
        }

        System.out.println("Shortest completing word: " + shortestWord);
    }

    public static void main(String[] args) {
        String licensePlate = "1s3 456";
        String[] words = {"looks","pest","stew","show"};
        shortest(licensePlate, words);
    }
}
