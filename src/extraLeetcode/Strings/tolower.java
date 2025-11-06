package extraLeetcode.Strings;

public class tolower {
    public static void toLower(String str) {
//        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
          if (chars[i] >= 'A' && chars[i] <= 'Z') {
              chars[i] += 32;

          }

        }
        str = new String(chars);
        System.out.println(str.toString());

    }
    public static void main(String[] args) {

        String s=s = "Hello";
        toLower(s);
    }
}
