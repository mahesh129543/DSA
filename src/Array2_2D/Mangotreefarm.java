package Array2_2D;

public class Mangotreefarm {

    public static int mangofarmCut(int[][] arr, int m) {
        int maxMangos = 0;

        for (int x = 0; x < m - 1; x++) {
            for (int y = 0; y < m - 1; y++) {

                int sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;


                for (int i = 0; i <= x; i++) {
                    for (int j = 0; j <= y; j++) {
                        sum1 =sum1 + arr[i][j];
                    }
                }


                for (int i = 0; i <= x; i++) {
                    for (int j = y + 1; j < m; j++) {
                        sum2 =sum2 + arr[i][j];
                    }
                }


                for (int i = x + 1; i < m; i++) {
                    for (int j = 0; j <= y; j++) {
                        sum3 =sum3 + arr[i][j];
                    }
                }


                for (int i = x + 1; i < m; i++) {
                    for (int j = y + 1; j < m; j++) {
                        sum4 =sum4 + arr[i][j];
                    }
                }
                int mango1=Math.min(sum1, sum2);
                int mango2=Math.min(sum3, sum4);

                int minMango = Math.min(mango1, mango2);


                if (minMango > maxMangos) {
                    maxMangos = minMango;
                }
            }
        }

        return maxMangos;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {2, 0, 0, 4},
                {2, 0, 1, 0},
                {6, 0, 0, 1},
                {0, 3, 0, 4}
        };

        int m = arr.length;
        int res = mangofarmCut(arr, m);
        System.out.println("Maximum mangoes do you have::: " + res);
    }
}
