package extraLeetcode.ARRAYS;

public class distancevalueof2aarr {
    public static void distancebetween(int[] arr1, int[] arr2,int d) {
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
            int j=0;
            while(j<arr2.length){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    cnt++;
                    break;


                }
                j++;
            }
        }
        System.out.println(cnt);
        int ans=arr1.length-cnt;
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        distancebetween(arr1,arr2,d);
    }
}
