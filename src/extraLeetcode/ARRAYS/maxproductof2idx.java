package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class maxproductof2idx {
    public static void maxProduct(int[] arr) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            max1=Math.max(max1,arr[i]);
        }
        System.out.println(max1);
//        Arrays.sort(arr);
//        int n=arr.length;
//        int n1=arr[n-1];
//        int n2=arr[n-2];
//        int ans=(n1-1)*(n2-1);
//        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[]  nums = {3,4,5,2};
        int[] nums1 = {1,5,4,5};
        maxProduct(nums);
//        maxProduct(nums1);
    }
}
