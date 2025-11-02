package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class kidwithextracandies1431 {
    public static void kidwithextarcandy(int[] arr,int e){
        int n = arr.length;
        boolean[] res = new boolean[n];
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println(max);
        for(int i=0;i<n;i++){
            if((arr[i]+e)>=max){
                res[i]=true;

            }else{
                res[i]=false;
            }
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        int[] arrcandies = {2,3,5,1,3};
    int extraCandies = 3;
    kidwithextarcandy(arrcandies,extraCandies);
    }
}
