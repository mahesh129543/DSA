package extraLeetcode.ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minabsolutedifference {
    public static void minabsolutedifference(int[] arr) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);
        if(n<3){
            System.out.println("No solution");
        }
        int mindist=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            mindist = Math.min(mindist, arr[i + 1] - arr[i]);

        }
        System.out.println(mindist);
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]&&(arr[i+1]-arr[i]==mindist)){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }

        }
        System.out.println(list);

    }
    public static void main(String[] args) {
        int[] arr={3,8,-10,23,19,-4,-14,27};
        int[] arr1={40,11,26,27,-20};
        minabsolutedifference(arr);
        minabsolutedifference(arr1);
    }
}
