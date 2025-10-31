package extraLeetcode;

import java.util.HashSet;

public class findtownjudge {
    public static void findtownjudge(int[][] arr, int n) {
        int m = arr.length;
        int r = arr[0].length;
        HashSet<Integer> set = new HashSet<>();

        // Step 1: Check if 'n' appears in every row
        for (int i = 0; i < m; i++) {
            boolean found = false;
            for (int j = 0; j < r; j++) {
                if (arr[i][j] == n) {
                    found = true;
                }
            }
            // If 'n' not found in this row
            if (!found) {
                System.out.println("-1 (because n not present in row " + (i + 1) + ")");
               return;

            }
        }

        // Step 2: If 'n' is present in every row, store other elements in HashSet
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < r; j++) {
                if (arr[i][j] != n) {
                    if (set.contains(arr[i][j])) {
                        System.out.println("-1 (duplicate found: " + arr[i][j] + ")");
                       return;
                    } else {
                        set.add(arr[i][j]);
                    }
                }
            }
        }

        // Step 3: If everything is fine, print n
        System.out.println(n);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3}, {2,3}, {3,1}};

        int n = 3;
        int[][] arr1={{1,2},{3,2}};
        int n1 = 2;
        findtownjudge(arr, n);
        findtownjudge(arr1, n1);
    }
}
