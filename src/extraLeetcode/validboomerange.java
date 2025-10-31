package extraLeetcode;

public class validboomerange {
    public static boolean validboomeranges(int[][] points) {
        int n = points.length;
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if (points[i][0] == points[i][1]) {
                cnt++;

            }
        }
        if(n==cnt){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,1},{2,3},{3,2}};
        int[][] arr1={{0,0},{2,1},{2,1}};
        System.out.println(validboomeranges(arr));
        System.out.println(validboomeranges(arr1));
    }
}
