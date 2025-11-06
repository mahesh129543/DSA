package extraLeetcode.Strings;

import java.util.Arrays;

public class Goatlatin {
    public static void goatlatin(String s) {
        String[] words = s.trim().split(" ");
        System.out.println(Arrays.toString(words));
        String vowel="aeiouAEIOU";
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char[] chars = word.toCharArray();
           if (vowel.contains(String.valueOf(chars[0]))) {
               word=word+"ma";
           }else{
               word=word.substring(1)+word.charAt(0)+"ma";
           }
           for (int j = 0; j <=i; j++) {
               word+="a";
           }
            res.append(word);
            if (i != words.length - 1) res.append(" ");
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
       String sentence = "I speak Goat Latin";
       goatlatin(sentence);
    }
}
