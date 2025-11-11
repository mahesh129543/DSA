package extraLeetcode.ARRAYS.medium;

public class Search2dmat {
    public static boolean search2dmat(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0, right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midValue = mat[mid / cols][mid % cols];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;


    }
    public static void main(String[] args) {
       int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 30;
        System.out.println( search2dmat(matrix,target));
    }
}
