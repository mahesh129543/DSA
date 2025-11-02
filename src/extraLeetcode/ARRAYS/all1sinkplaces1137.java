package extraLeetcode.ARRAYS;

public class all1sinkplaces1137 {
    public static void all1sinkplaces1137(int[] arr,int k) {
       int preidx=-1;
       for(int i=0;i<arr.length;i++) {
           if(arr[i]==1) {
               if(preidx!=-1) {
                   int zeros=i-preidx-1;
                   if(zeros<k) {
                       System.out.println("false");
                       return;

                   }
               }
               preidx=i;

           }
       }
        System.out.println("true");
    }

public static void main(String[] args) {
    int[] nums = {1,0,1,0,0,1};
    int k = 2;
    all1sinkplaces1137(nums,k);
}
}
