package extraLeetcode.ARRAYS;

import java.util.Arrays;
import java.util.HashSet;

public class trirdmaximum {
    public static int max(int nums[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            hs.add(i);
        }
        int[] arr = new int[hs.size()];
        int k = 0;
        for (int j : hs) {
            arr[k++] = j;

        }
        Arrays.sort(arr);
        if (arr.length < 3) {
            return arr[arr.length - 1];

        } else {
            return arr[arr.length - 3];
        }
    }
    public static void main(String[] args) {
        int[] nums={3,2,1,4,5,6,7,8,9,8};
        System.out.println(max(nums));
    }
}
