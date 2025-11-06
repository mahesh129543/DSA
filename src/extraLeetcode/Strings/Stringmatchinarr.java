package extraLeetcode.Strings;

import java.util.ArrayList;
import java.util.List;

public class Stringmatchinarr {
    public static void stringmatchinarr(String[] s) {
        int n = s.length;
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<String>();

        for(String word:s){
            String w = word;
            int i=0;
            while(i<n){
                if(!w.equals(s[i])){
                    if(s[i].length()>w.length()&& s[i].contains(w)){
                        list.add(w);
                    }
                }
                i++;

            }
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
       String[] words = {"mass","as","hero","superhero"};
       stringmatchinarr(words);
    }
}
