package extraLeetcode.ARRAYS;

public class doinghomeworkattime {
    public static void doinghomeworkattime(int[] arr1,int[] arr2,int t) {
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<=t&&arr2[i]>=t){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
       int[]  startTime = {1,2,3,3};
       int[] endTime = {3,2,7,8};
       int queryTime = 4;
       doinghomeworkattime(startTime,endTime,queryTime);
    }
}
