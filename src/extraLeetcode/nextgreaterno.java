package extraLeetcode;

import java.util.Arrays;

public class nextgreaterno {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int i = 0;
        int j = 0;

        while (i < nums1.length) {
            // Find nums1[i] in nums2
            while (j < nums2.length && nums1[i] != nums2[j]) {
                j++;
            }

            // Now j points to nums1[i] in nums2
            int nextGreater = -1;
            for (int k = j + 1; k < nums2.length; k++) {
                if (nums2[k] > nums1[i]) {
                    nextGreater = nums2[k];
                    break;
                }
            }

            res[i] = nextGreater;

            // Move to next element in nums1
            i++;
            j = 0; // reset j to start for next search
        }

        return res;
    }

    public static void main(String[] args) {
        int[] n1 = {4, 1, 2};
        int[] n2 = {1, 3, 4, 2};

        System.out.println(Arrays.toString(nextGreaterElement(n1, n2)));
    }
}
