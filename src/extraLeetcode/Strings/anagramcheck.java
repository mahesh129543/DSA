package extraLeetcode.Strings;

import java.util.Arrays;
import java.util.HashMap;

public class anagramcheck {
    public static void anagramCheck(String a, String b) {
        int[] arr = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'a']++;

        }
        for (int i = 0; i < b.length(); i++) {
            arr[b.charAt(i) - 'a']--;

        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                System.out.println("not anagram");
                break;
            }



        }
        System.out.println("anagram");
//        if(a.length() != b.length()){
//            System.out.println("not anagram");
//        }
//        HashMap<Character, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < a.length(); i++){
//            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
//        }
//        System.out.println(map);
//        for(int i = 0; i < b.length(); i++){
//            if(map.containsKey(b.charAt(i))){
//                map.put(b.charAt(i), map.getOrDefault(b.charAt(i), 0) - 1);
//                System.out.println(map);
//                if(map.get(b.charAt(i)) == 0){
//                    map.remove(b.charAt(i));
//                }
//            }
//
//
//        }
//        System.out.println(map.size());
//        if(map.size() == 0){
//            System.out.println("anagram");
//        }else{
//            System.out.println("not anagram");
//        }
//        char[] aChars = a.toCharArray();
//        char[] bChars = b.toCharArray();
//        Arrays.sort(aChars);
//        Arrays.sort(bChars);
//        String aString = new String(aChars);
//        String bString = new String(bChars);
//        if (aString.equals(bString)) {
//            System.out.println("Anagram");
//        }
//        else {
//            System.out.println("Not Anagram");
//        }
    }
    public static void main(String[] args) {
     String    s = "anagram", t = "nagaram";
     String    s2 = "car", t2 = "cat";
     anagramCheck(s, t);
     anagramCheck(s2, t2);
    }
}
