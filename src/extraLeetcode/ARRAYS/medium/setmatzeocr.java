package extraLeetcode.ARRAYS.medium;

import java.util.Arrays;

public class setmatzeocr {
    public static  void setmatzetoocr(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;


        boolean[] zeroRow = new boolean[n];
        boolean[] zeroCol = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(zeroRow));
        System.out.println(Arrays.toString(zeroCol));

        // Step 2: set rows to zero
        for (int i = 0; i < n; i++) {
            if (zeroRow[i]) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = 0;
                }
            }
        }

        // Step 3: set columns to zero
        for (int j = 0; j < m; j++) {
            if (zeroCol[j]) {
                for (int i = 0; i < n; i++) {
                    mat[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(mat));
    }

    public static void main(String[] args) {
      int[][]  matrix = {{1,1,1},{1,0,1},{1,1,1}};
      setmatzetoocr(matrix);
    }
}
