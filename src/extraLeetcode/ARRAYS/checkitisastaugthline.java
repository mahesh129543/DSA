package extraLeetcode.ARRAYS;

public class checkitisastaugthline {
    public static void checkitisastaugthline(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        int slop=(arr[1][1]-arr[0][1])/(arr[1][0]-arr[0][0]);
        System.out.println(slop);
        for (int i = 1; i < n-1; i++) {
            int x1=arr[i][0];
            int y1=arr[i][1];
            int x2=arr[i+1][0];
            int y2=arr[i+1][1];
            int slop1=(y2-y1)/(x2-x1);
            if(slop1!=slop){
                System.out.println("not straigth line");
                break;
            }

            System.out.println("straigth line");
        }

    }
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,8},{3,4},{4,5},{5,6},{6,7}};
        checkitisastaugthline(arr);
    }
}
