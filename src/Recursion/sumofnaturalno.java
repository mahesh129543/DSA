package Recursion;

public class sumofnaturalno {
    public static int sumoFnaturalno(int n) {
        if (n == 1) {

            return 1;
        }
        return n + sumoFnaturalno(n - 1);
    }
    public static void main(String[] args) {
        System.out.println( "sum of the first Natural number is:"+sumoFnaturalno(5));

    }
}
