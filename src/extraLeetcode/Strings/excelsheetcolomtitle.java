package extraLeetcode.Strings;

public class excelsheetcolomtitle {
    public static void excelsheetcolomtitle(int n) {

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            n--; // VERY IMPORTANT
            char c = (char) ('A' + (n % 26));
            sb.append(c);
            n = n / 26;
        }

        System.out.println(sb.reverse().toString());
//       int fir=n/26;
//       char ch=(char)('A'+fir-1);
//        System.out.println(ch);
//        sb.append(ch);
//        int sec=n%26;
//        char ch2=(char)('A'+sec-1);
//        System.out.println(ch2);
//        sb.append(ch2);
//        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        int n=28;
        int n1=704;
        excelsheetcolomtitle(n);
        excelsheetcolomtitle(n1);
        System.out.println('A'-0);

    }
}
