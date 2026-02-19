package advancearray;

import java.util.Arrays;

public class roatetarray {

    public static void roateaarr(int num[], int k) {

        int n = num.length;
//        k = k % n;
        int k1=k;

        while (k1 > 0) {

            int last = num[n - 1];


            for (int i = n - 1; i > 0; i--) {
                num[i] = num[i - 1];
            }

            num[0] = last;

            k1--;
        }

        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        roateaarr(arr, 3);
    }
}
