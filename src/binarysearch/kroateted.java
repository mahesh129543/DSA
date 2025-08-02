package binarysearch;

public class kroateted {
    public static int kroateted(int[] arr) {
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(mid<e&&arr[mid]>arr[mid+1]){
                return arr[mid+1];

            }
            else if(mid>s&&arr[mid]<arr[mid-1]){
                return arr[mid];
            }
            else if(arr[mid]<arr[mid+1]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println( kroateted(arr));
    }
}
