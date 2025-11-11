package extraLeetcode.ARRAYS.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeintervals {
    public static void merge(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int i=0;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        while(i<n-1){
            if(arr[i][0]>arr[i+1][0]){
                int temp = arr[i][0];
                arr[i][0] = arr[i+1][0];
                arr[i+1][0] = temp;
            }
            if(arr[i][1]>arr[i+1][1]){
                int temp = arr[i][1];
                arr[i][1] = arr[i+1][1];
                arr[i+1][1] = temp;

            }
            i++;
        }
        System.out.println(Arrays.deepToString(arr));
        List<Integer> l=new ArrayList<>();
        int j=0;
        while(j<n-1){
            if(arr[j][1]>=arr[j+1][0]){
                l.add(arr[j][0]);
                l.add(arr[j+1][1]);
                list.add(l);
                j=j+2;
            }else{
                l.add(arr[j][0]);
                l.add(arr[j][1]);
                list.add(l);
            }
            j++;
        }
        System.out.println(list);
    }
    public static void main(String[] args) {
      int[][]  intervals = {{1,3},{2,6},{8,10},{15,18}};
       int[][]  intervals1 = {{4,7},{1,4}};
      merge(intervals);
      merge(intervals1);
    }
}
