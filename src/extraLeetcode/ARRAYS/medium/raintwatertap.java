package extraLeetcode.ARRAYS.medium;

import java.util.Arrays;

public class raintwatertap {
    public static void raintwatertap(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        int sum=0;

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        System.out.println(Arrays.toString(left));
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);

        }
        System.out.println(Arrays.toString(right));
        for (int i = 0; i < n; i++) {
             sum= sum+Math.min(left[i], right[i])-arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[]  height = {4,2,0,3,2,5};
        raintwatertap(height);
    }
}
