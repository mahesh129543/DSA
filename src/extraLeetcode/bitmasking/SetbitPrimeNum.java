package extraLeetcode.bitmasking;

public class SetbitPrimeNum {
    public static void setbitPrimeNum(int l,int r) {
        int ans1 = 0;

        for (int i = l; i <= r; i++) {
            int cnt = 0;
            int temp = i;   // 🔥 use temp variable

            while (temp > 0) {
                cnt += (temp & 1);
                temp >>= 1;
            }

            if (isPrime(cnt)) {
                ans1++;
            }
        }

        System.out.println(ans1);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        int l=6;
        int r=10;
        setbitPrimeNum(l,r);
    }
}
