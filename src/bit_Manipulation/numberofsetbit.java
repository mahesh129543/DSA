package bit_Manipulation;

public class numberofsetbit {
    public static int noSetBit(int n) {
        System.out.println("number of the set bit like what is the '1' is present in the no:");
        int count = 0;
        while (n > 0) {
            int rem = n % 2;
            count = count + rem;
            n = n / 2;

        }return count;
    }
    public static int noSetBit2(int n) {
        int cnt=0;
        while (n > 0) {
            int lastbit=(n&1);
            cnt=cnt+lastbit;
            n=n>>1;

        }return cnt;
    }


    public static void main(String[] args) {
        System.out.println(noSetBit(5));
        System.out.println(noSetBit2(5));


    }
}
