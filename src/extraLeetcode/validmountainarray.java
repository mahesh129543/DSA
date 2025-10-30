package extraLeetcode;

public class validmountainarray {
    public static void validMountainArray(int[] arr) {
        int n = arr.length;
        if(n<3){
            System.out.println("Invalid mountain array");
        }
        int idx=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                idx=i+1;

            }
        }
        System.out.println("Index of mountain array is "+idx);
        int idx1=0;
        for(int i=n-1;i>1;i--){
            if(arr[i]<arr[i-1]){
                idx1=i-1;

            }
        }
        System.out.println("Index of mountain array is "+idx1);
        if(idx==idx1){
            System.out.println("Valid mountain array");
        }else {
            System.out.println("Invalid mountain array");
        }
    }
    public static void main(String[] args) {
        int[] arr= {0,1,2,3,5,7,4,3,2,0};
        validMountainArray(arr);
    }
}
