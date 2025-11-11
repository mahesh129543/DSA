package extraLeetcode.ARRAYS.medium;

import java.util.Arrays;

public class duplicateelement {
    public static void duplicateelement(int[] arr1){
        int n = arr1.length;
        int max = 0;

// Step 1: Find the maximum element in arr1
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr1[i]);
        }
        System.out.println(max);

// Step 2: Create frequency array
        int[] arr2 = new int[max + 1];
        for (int i = 0; i < n; i++) {
            arr2[arr1[i] - 1]++;
        }

// Step 3: Print frequency array
        System.out.println(Arrays.toString(arr2));


    }
    public static void duplication(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);


            if (arr[val - 1] < 0) {
                System.out.println("Duplicate element: " + val);
                return;
            }


            arr[val - 1] = -arr[val - 1];
        }

    }
    public static void main(String[] args) {
       int[] nums = {3,2,1,3,4};
       duplication(nums);
       duplicateelement(nums);
    }
}
