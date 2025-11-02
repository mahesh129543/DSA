package extraLeetcode.ARRAYS;

import java.util.Arrays;

public class kweakestrow {
    public static void kweakestrow(int[][]arr ,int k) {
        int n = arr.length;
        int m = arr[0].length;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    cnt++;
                }else{
                    break;
                }
                res[i]=cnt;
            }
        }
        int[] temp = res.clone();
        int[] res2 = new int[k];
        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(temp));
        for(int i=0;i<k;i++){
            for(int j=0;j<temp.length;j++){
                if(res[i]==temp[j]){
                    res2[i]=j;
                    temp[j]=-1;
                    break;

                }

            }
        }
        System.out.println(Arrays.toString(res2));

    }
    public static void main(String[] args) {
        int[][] mat =
                {{1,1,0,0,0},
                        {1,1,1,1,0},
                        {1,0,0,0,0},
                        {1,1,0,0,0},
                        {1,1,1,1,1}};
      int  k = 3;
      kweakestrow(mat,k);
    }
}
