package extraLeetcode.Strings;

public class base7 {
    public static void base7(int n) {
        StringBuilder sb = new StringBuilder();
        if(n<0){
            n=-n;


        }
        System.out.println(n);
        while (n > 0) {

            int r = n % 7;
            sb.append(r);
            n /= 7;
        }


        System.out.println(sb.reverse().toString());
    }
    public static void main(String[] args) {
        int n=100;
        int n1=-7;
        base7(n);

        base7(n1);

    }
}
