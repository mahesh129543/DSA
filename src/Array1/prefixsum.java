package Array1;

import java.util.Arrays;

public class prefixsum {

    public static int[] prefixSum(int[] arr, int n) {
        int[] presum = new int[n];
        presum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            presum[i] = presum[i - 1] + arr[i];
            System.out.println("Prefix sum at index " + i + ": " + presum[i]);
        }

        return presum; // Return total sum or any specific value
    }
    public static int prefixSum2(int[] res, int l,int r) {
        if(l==0){
            return res[r];
        }else{
            return res[r]-res[l-1];
        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] res = prefixSum(arr, n);
        System.out.println(Arrays.toString(res));
        int sum = prefixSum2(res,1,3);
        System.out.println(sum);

    }
}
