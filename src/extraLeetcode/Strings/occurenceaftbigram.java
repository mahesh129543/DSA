package extraLeetcode.Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class occurenceaftbigram {
    public static void occurenceaftbigram(String t,String f, String s) {
        String[] words = t.split(" ");
        System.out.println(Arrays.toString(words));
        List<String> wordList =new ArrayList<>();

        for (int i = 0; i < words.length-2; i++) {
            if (words[i].equals(f)&&words[i+1].equals(s)) {
                        wordList.add(words[i+2]);
            }
        }
        System.out.println(wordList);
        int k=0;
       String[] arr = new String[wordList.size()];
        for (int i = 0; i < wordList.size(); i++) {
            arr[i] = wordList.get(i);

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
     String   text = "alice is a good girl she is a good student", first = "a", second = "good";
     occurenceaftbigram(text, first, second);
    }
}
