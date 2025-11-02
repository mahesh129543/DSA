package extraLeetcode.ARRAYS;

public class matdiago {
    public static void diagonalsame(int[][] arr) {
        int m= arr.length;
        int n= arr[0].length;
        for(int j=0;j<n;j++){
            int x=0;
            int y=j;
            while(x<m && y>=0){
               if(arr[x][y]==arr[x+1][y+1]){
                   System.out.println("true");
               }
                x++;
                y--;
            }
            System.out.println();
        }
        for(int i=1;i<m;i++){
            int x=i;
            int y=n-1;
            while(x<m&&y>=0){
                if(arr[x][y]==arr[x][y-1]){
                    System.out.println("true");
                }
                x++;
                y--;

            }
            System.out.println();
        }





//        for (int i = 0; i < m - 1; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (arr[i][j] != arr[i + 1][j + 1]) {
//                    System.out.println("false");
//                    return; // no need to continue
//                }
//            }
//        }
//
//        System.out.println("true");
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 1, 2, 3},
                {9, 5, 1, 2}
        };
        diagonalsame(arr);
    }
}
