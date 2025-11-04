package extraLeetcode.ARRAYS;

public class spepositionbinarymat {

    public static void spepositionbinarymat(int[][] arr) {

        int n = arr.length;
        int m = arr[0].length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (arr[i][j] == 1) {

                    int rowOnes = 0;
                    int colOnes = 0;

                    // count 1's in the row i
                    for (int k = 0; k < m; k++) {
                        if (arr[i][k] == 1) rowOnes++;
                    }

                    // count 1's in the column j
                    for (int k = 0; k < n; k++) {
                        if (arr[k][j] == 1) colOnes++;
                    }

                    // check special position
                    if (rowOnes == 1 && colOnes == 1) {
                        cnt++;
                    }
                }
            }
        }

        System.out.println("Special positions = " + cnt);
    }

    public static void main(String[] args) {
        int[][] arr = { {1,0,0}, {0,0,1}, {1,0,0} };
        spepositionbinarymat(arr);
    }
}
