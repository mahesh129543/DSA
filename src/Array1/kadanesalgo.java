package Array1;

public class kadanesalgo {

    public static void subarraysumlar(int[] arr){
        int cs=0;
        int maxs=0;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;

            }
            maxs=Math.max(maxs,cs);
        }
        System.out.println("this is the maximum sum of subb- array sum:"+maxs);
    }
    public static void main(String[] args) {
        int[] arr={3,5,-10,2,6,4,-1,5,-3,7,-12,4};
        subarraysumlar(arr);

    }
}
