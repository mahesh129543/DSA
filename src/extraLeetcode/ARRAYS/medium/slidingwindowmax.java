package extraLeetcode.ARRAYS.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class slidingwindowmax {
    public static void slidingWindowMax(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        int j = i + k - 1;

        while (j < n) {
            int max = Integer.MIN_VALUE;
            for (int l = i; l <= j; l++) {
                max = Math.max(max, nums[l]);
            }
            list.add(max);
            i++;
            j++;
        }

        int[] arr = new int[list.size()];
        for (int m = 0; m < list.size(); m++) {
            arr[m] = list.get(m);
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void slidingwindowmax(int[] arr, int k) {
        List<Integer> list = new ArrayList<Integer>();
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        list.add(sum);

        for (int i = k; i < n; i++) {
            sum +=arr[i]-arr[i-k];
            list.add(sum);


        }
        System.out.println(list);
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        int[] arr={1};
        int k1=1;
        slidingwindowmax(nums, k);
        slidingWindowMax(nums,k);
        slidingWindowMax(arr,1);

    }
}
