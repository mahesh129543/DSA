package extraLeetcode;

import java.util.HashMap;
import java.util.HashSet;

public class uniqemorecodeword {

    public static void uniqemorecodeword(String[] arr,String[] words) {
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        // 'a' in ASCII is 97
        for (int i = 0; i < arr.length; i++) {
            char alphabet = (char) ('a' + i);  // convert index to letter
            map.put(alphabet, arr[i]);
        }


        for (char key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        for(String word : words) {
            String ans="";
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
               ans=ans+ map.get(ch);


            }
            set.add(ans);
        }
        int res=set.size();
        System.out.println(res);

    }

    public static void main(String[] args) {
        String[] arr = {
                ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };
       String[]  words = {"gin","zen","gig","msg"};
       String[] words1 ={"a"};

        uniqemorecodeword(arr,words);
        uniqemorecodeword(arr,words1);
    }
}
