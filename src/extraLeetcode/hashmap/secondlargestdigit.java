package extraLeetcode.hashmap;

import java.util.HashMap;

public class secondlargestdigit {
    public static void secondlargestdigit(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(!(c>='a'&& c<='z')){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

        }
        System.out.println(map);
        for(char c : map.keySet()){
            if(map.get(c)>0){}
        }

    }
    public static void main(String[] args) {
      String  s = "dfa12321afd";
      secondlargestdigit(s);
    }
}
