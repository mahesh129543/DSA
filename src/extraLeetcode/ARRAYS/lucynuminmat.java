package extraLeetcode.ARRAYS;

import java.util.HashSet;

public class lucynuminmat {
    public static void luckynum(int[][] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        int n = arr.length;
        int m = arr[0].length;
        for(int i=0; i<arr.length; i++){
            int min=arr[i][0];
            for(int j=1; j<arr[i].length; j++){
                min=Math.min(min, arr[i][j]);
            }
            set.add(min);
        }
        System.out.println(set);
        for(int j=0; j<m; j++){
            int max=arr[0][j];
            for(int i=1; i<n; i++){
                max=Math.max(max, arr[i][j]);
            }
            if(set.contains(max)){
                System.out.println(max);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat={{3,7,8},{9,11,13},{15,16,17}};
        luckynum(mat);
    }
}
