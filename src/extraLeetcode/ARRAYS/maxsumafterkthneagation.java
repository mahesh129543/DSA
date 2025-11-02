package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class maxsumafterkthneagation {
    public static void maxsumafterkthneagation(int[] arr, int k) {
        Arrays.sort(arr);  // Step 1: sort array

        // Step 2: make negative numbers positive while k > 0
        for (int i = 0; i < arr.length && k > 0; i++) {
            if (arr[i] < 0) {
                arr[i] = -arr[i];
                k--;
            }
        }

        // Step 3: if k is odd, flip the smallest element
        Arrays.sort(arr);  // sort again to bring smallest number at index 0
        if (k % 2 == 1) {
            arr[0] = -arr[0];
        }

        // Step 4: find total sum
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        int[] arr={3,-1,0,2};
        int k = 3;
        int[] arr1={2,-3,-1,5,-4};
        int k1=2;
        maxsumafterkthneagation(arr, k);
        maxsumafterkthneagation(arr1, k1);
    }
}
