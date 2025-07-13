package Array1;

public class rainwaterlevel {

    public static int waterLevel(int[] arr, int n) {
        int totalWater = 0;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];


        leftMax[0] = arr[0];
        for ( int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
            System.out.print(leftMax[i]+" ,");
        }
        System.out.println();


        rightMax[n - 1] = arr[n - 1];
        for ( int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
            System.out.print(rightMax[i]+" ,");

        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int waterAtI = Math.min(leftMax[i], rightMax[i]) ;
            System.out.print(waterAtI+" ,");
           totalWater= totalWater + waterAtI-arr[i];
        }
        System.out.println();

        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};

        int n = arr.length;
        int res= waterLevel(arr, n);
        System.out.println("total water in betwwen the buildings: " + res);
    }
}
