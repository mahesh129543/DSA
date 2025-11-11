package extraLeetcode.ARRAYS.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxsubarrsum {
    public static void maxsubarrsum(int[] arr){
        int n = arr.length;
        int csum = 0;
        int sidx=0;
        int eidx=0;
        int lagestsum=Integer.MIN_VALUE;
        List<Integer> l = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            csum += arr[i];
            if(csum<0){
                csum = 0;
                sidx = i;

            }
            if(csum>lagestsum){
                lagestsum = csum;
                eidx = i;
            }


        }
        System.out.println(lagestsum);
        System.out.println(sidx);
        System.out.println(eidx);
        int[] res=new int[eidx-sidx];
        if(sidx>0){
            sidx = sidx+1;
        }


        for(int i=sidx;i<=eidx;i++){
            l.add(arr[i]);

        }
        System.out.println(l);
    }
    public static void main(String[] args) {
      int[]   nums = {-2,1,-3,4,-1,2,1,-5,4};
      int[] nums1 = {5,4,-1,7,8};
      maxsubarrsum(nums);
      maxsubarrsum(nums1);
    }
}
