package extraLeetcode.Strings;

import java.util.HashMap;

public class romentointeger {

    public static void romentoInteger(String str) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {


            if (i < str.length() - 1) {
                String two = str.substring(i, i + 2);
                if (map.containsKey(two)) {
                    sum += map.get(two);
                    i++;
                    continue;
                }
            }

            String one = String.valueOf(str.charAt(i));
            sum += map.get(one);
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        String s = "III";
        String s1 = "MCMXCIV";
        romentoInteger(s);
        romentoInteger(s1);
    }
}
