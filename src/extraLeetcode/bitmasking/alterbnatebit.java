package extraLeetcode.bitmasking;

public class alterbnatebit {
    public static void alternatebit(int n) {
        int last = n & 1;     // take last bit
        n >>= 1;

        while (n > 0) {
            int curr = n & 1;
            if (curr == last) {
                System.out.println("false");
                return;
            }
            last = curr;
            n >>= 1;
        }

        System.out.println("true");
    }
    public static void main(String[] args) {
        int n=5;
        alternatebit(n);
    }
}
