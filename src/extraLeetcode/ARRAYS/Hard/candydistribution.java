package extraLeetcode.ARRAYS.Hard;

import java.util.Arrays;

public class candydistribution {
    public static void candydistribution(int[] arr) {
        int n = arr.length;
        int[]  left= new int[n];
        left[0] = 1;
        
        for(int i=1;i<n;i++){
            if(arr[i-1]>=arr[i]){
                left[i] = 1;
            }
            else{
                left[i] = left[i-1]+1;
            }

        }
        System.out.println(Arrays.toString(left));
        for(int i=n-2;i>=0;i--){
            if(arr[i]<=arr[i+1]){
                left[i] = Math.max(left[i],1);
            }
            else{
                left[i]= Math.max(left[i],(left[i+1]+1));
            }
        }
        System.out.println(Arrays.toString(left));
        int ans=0;
        for(int i=0;i<n;i++){
            ans +=left[i];
        }
        System.out.println(ans);


    }
    public static void main(String[] args) {
        int[] arr={1,0,2};
        int[] arr2={0,2,4,3,2,1,1,3,5,6,4,0,0};
        int[] arr3={1,2,2};
        candydistribution(arr);
        candydistribution(arr2);
        candydistribution(arr3);
    }
}
