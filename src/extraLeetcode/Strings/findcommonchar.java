package extraLeetcode.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findcommonchar {
    public static void findCommonChar(String[] s) {
        int[] arr = new int[26];
        List<Character> list = new ArrayList<Character>();
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            for (int j = 0; j < str.length(); j++) {
                arr[str.charAt(j) - 'a']++;
            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < 26; i++) {
            if(arr[i]%3 == 0){
                char ch = (char)('a'+i);
                list.add(ch);
            }
        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        findCommonChar(words);
    }
}
