package extraLeetcode.Strings;

public class numofsegmentinstring {
    public static void numofsegmentinstring(String s) {
        String[] segments = s.split(" ");
        System.out.println(segments.length);


    }
    public static void main(String[] args) {
        String s="Hello, my name is John";
        String s1="         ";
        numofsegmentinstring(s);
        numofsegmentinstring(s1);
    }
}
