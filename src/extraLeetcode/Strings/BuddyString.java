package extraLeetcode.Strings;

public class BuddyString {
    public static void buddyString(String str,String goal) {
        char[] chars = str.toCharArray();
        int i = 0;

        while (i < chars.length) {
            int j=i+1;
            while (j < chars.length) {
                char a = chars[i];
                chars[i]=chars[j];
                chars[j]=a;
                String temp = new String(chars);
                if (temp.equals(new String(goal))) {
                    System.out.println("true");
                    return;
                }
                chars[j] = chars[i];
                chars[i] = a;
                j++;
            }
            i++;


        }
        System.out.println("false");

    }
    public static void main(String[] args) {
       String s = "ab", goal = "ba";
       String s1 = "ab", goal1 = "ab";
       buddyString(s,goal);
       buddyString(s1,goal1);
    }
}
