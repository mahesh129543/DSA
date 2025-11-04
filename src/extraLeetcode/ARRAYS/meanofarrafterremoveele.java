package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class meanofarrafterremoveele {
    public static void meanofarrafterremoveele(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int remnum=(5*n)/100;
        System.out.println(remnum);
        double sum=0;
        for(int i=remnum;i<n-remnum;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        double mean=sum/(n-(remnum*2));
        System.out.println(mean);
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        int[] arr1={6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
        meanofarrafterremoveele(arr);
        meanofarrafterremoveele(arr1);
    }
}
