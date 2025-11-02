package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class sufflethearray {
    public static void sufflethearray(int[]  arr,int n) {
        int i=0;
        int j=n;
        int[] res=new int[n*2];
        int k=0;
        while(i<n&&j<arr.length) {
            res[k]=arr[i];
            res[k+1]=arr[j];
            k=k+2;
            i++;
            j++;


        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        sufflethearray(nums,n);
    }
}
