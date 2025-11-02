package extraLeetcode.ARRAYS;

public class largesttrianglearea {
    public static void largestTriangleArea(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int x= 0;
        int y = 0;
        for (int i = 0; i < n; i++) {
            if( arr[i][0]>x){
                x = arr[i][0];
            }
            if(arr[i][m-1]>y){
                y = arr[i][m-1];
            }



        }
        System.out.println(x+" <- h and b ->"+y);
        double ans=(x*y);
        System.out.println(ans);
        double area=ans/2;
        System.out.println(area);

    }
    public static void main(String[] args) {
      int[][]  points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
      int[][] point1={{1,0},{0,0},{0,1}};
      int[][] point2={{0,0},{0,1},{1,0},{2,0}};
      int[][] point3={{4,6},{6,5},{3,1}};
      largestTriangleArea(points);
      largestTriangleArea(point1);
      largestTriangleArea(point2);
        System.out.println("new");
      largestTriangleArea(point3);
    }
}
