package extraLeetcode.Strings;

public class decrypstringtoint {
    public static void decrypt(String s) {
        StringBuilder decrypted = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            // Check for pattern like "10#"
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int num = Integer.parseInt(s.substring(i, i + 2));
                decrypted.append((char) ('a' + num - 1));
                i += 3; // skip the two digits and '#'
            } else {
                int num = s.charAt(i) - '0';
                decrypted.append((char) ('a' + num - 1));
                i++;
            }
        }

        System.out.println(decrypted.toString());
    }
    public static void main(String[] args) {
       String s = "10#11#12";
       decrypt(s);
    }
}
