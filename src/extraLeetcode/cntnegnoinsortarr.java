package extraLeetcode;

public class cntnegnoinsortarr {
    public static void cntnegativeno(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                if(arr[i][j]>=0){
                    cnt=cnt+Math.abs(j-(n-2));
                    break;

                }


            }
        }
        System.out.println(cnt);

    }
    public static void main(String[] args) {
        int[][] arr={{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        cntnegativeno(arr);
    }
}
