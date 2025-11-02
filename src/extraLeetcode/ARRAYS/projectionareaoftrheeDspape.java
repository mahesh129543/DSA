package extraLeetcode.ARRAYS;

public class projectionareaoftrheeDspape {
    public static void projectionareaoftrheeDspape(int[][] arr) {
        int n = arr.length;

        int topview=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ;j < n; j++) {
                if(arr[i][j]!=0){
                    topview++;
                }
            }
        }
        System.out.println("top view :"+topview);
        int leftview=0;
        int max=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < n; j++) {
                 max=Math.max(arr[i][j],max);
            }
            leftview=leftview+max;
        }
        System.out.println("left view :"+leftview);
        int rightview = 0;
        for (int i = 0; i < n; i++) {
            int max1 = 0; // reset for each column
            for (int j = 0; j < n; j++) {
                max1 = Math.max(arr[j][i], max1);
            }
            rightview += max1;
        }
        System.out.println("Right view: " + rightview);
        int ans=topview+leftview+rightview;
        System.out.println("total answer of the problem :"+ans);
    }
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4}};
        int[][] arr1={{1,0},{0,2}};
        int[][] arr2={{1,4},{1,1}};
        projectionareaoftrheeDspape(arr);
        System.out.println("new");
        projectionareaoftrheeDspape(arr1);
        projectionareaoftrheeDspape(arr2);
    }
}
