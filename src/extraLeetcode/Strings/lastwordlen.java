package extraLeetcode.Strings;

public class lastwordlen {
    public static void lastwordlen(String s) {

        String s1 = s.trim();
        System.out.println("Trimmed string: " + s1);

        int count = 0;
        int i = s1.length() - 1;

        while (i >= 0) {
            if (s1.charAt(i) == ' ') {
                break;
            }
            count++;
            i--;
        }

        System.out.println("Length of last word = " + count);
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon      ";
        lastwordlen(s);
    }
}
