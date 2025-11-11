package extraLeetcode.ARRAYS.medium;

import java.util.Arrays;

public class SortColor {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j =0; j < n- i-1; j++) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
      int[]   nums = {2,0,2,1,1,0};
      sortColors(nums);
    }
}
