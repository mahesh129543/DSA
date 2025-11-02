package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class minvaluetogetaddingsum1413 {
    public static void minimumSum(int[] arr ) {
        int n = arr.length;
        int[] presum = new int[n];
        presum[0] = arr[0];
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            presum[i] = arr[i] + presum[i - 1];
            min = Math.min(min, presum[i]);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(presum));
        System.out.println(min);
        int startval=Math.max(1,1-min);
        System.out.println(startval);


    }
    public static void main(String[] args) {
        int[] arr={-3,2,-3,4,2};
        int[]  arr2={1,2};
        minimumSum(arr);
        minimumSum(arr2);
    }
}
