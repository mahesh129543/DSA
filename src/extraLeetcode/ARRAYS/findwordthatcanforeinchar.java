package extraLeetcode.ARRAYS;

import java.util.HashSet;

public class findwordthatcanforeinchar {

    public static void findwordthatcanforeinchar(String str, String[] s) {

        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            hs.add(str.toLowerCase().charAt(i));
        }

        System.out.println("Characters available: " + hs);
           int len=0;
        for (String word : s) {

            String w = word.toLowerCase();
            boolean canForm = true;

            for (int i = 0; i < w.length(); i++) {
                if (!hs.contains(w.charAt(i))) {
                    canForm = false;
                    break;
                }
            }

            if (canForm) {
                System.out.println(word );
                len=len+word.length();
            }

        }
        System.out.println(len);
    }

    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";

        findwordthatcanforeinchar(chars, words);
    }
}
