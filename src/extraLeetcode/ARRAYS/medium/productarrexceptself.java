package extraLeetcode.ARRAYS.medium;

import java.util.Arrays;

public class productarrexceptself{
    public static void product(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        output[0] = 1;
        for(int i = 1; i < n; i++){
            output[i] = output[i-1]*arr[i-1];

        }
        System.out.println(Arrays.toString(output));
        int right=1;
        for(int i = n-1; i >= 0; i--){
            output[i] = right*output[i];
            right*=arr[i];
        }
        System.out.println(Arrays.toString(output));

    }
    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        product(nums);
    }
}
