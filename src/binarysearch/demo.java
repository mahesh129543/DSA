package binarysearch;

public class demo {
    public static int binarysearch(int[] arr , int target) {
        int s=0;
        int e=arr.length-1;
        while(s <= e) {
            int mid = (s+e)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                e=mid-1;

            }
            else{
                s=mid+1;
            }
        }return -1;
    }
    public static int binarysearch2(int[] arr , int target,int s,int e) {
        if(s>e){
            return -1;
        }
        int mid=(e+s)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(arr[mid]>target){
            return binarysearch2(arr,target,s,mid-1);
        }
        else{
            return binarysearch2(arr,target,s,mid+1);
        }

    }
    public static int binarysearch3(int[] arr2 , int target2) {

        int s=0;
        int e=arr2.length-1;
        int ans=-1;
        while(s <= e) {
            int mid = (s+e)/2;
            if(arr2[mid]==target2){
                ans=mid;
                e=mid-1;
            }
            else if(arr2[mid]>target2){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }return ans;
    }
    public static int binarysearch4(int[] arr2 , int target2) {
        int s=0;
        int e=arr2.length-1;
        int ans=-1;
        while(s <= e) {
            int mid = (s+e)/2;
            if(arr2[mid]==target2){
                ans=mid;
                s=mid+1;
            }
            else if(arr2[mid]>target2){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,5,7,8,12,14,15,20,23,25,27,34,37};
        int target=5;
        System.out.println("this is the binary search basic algorithm:");
        System.out.println(binarysearch(arr, target));
        System.out.println("this is the recusive binary search:");
        System.out.println(binarysearch2(arr, target, 0, arr.length-1));
        int[] arr2={1,2,2,2,3,3,3,3,3,3,4,5,6,7,8,9};
        int target2=2;
        int first=binarysearch3(arr2, target2);
        int last=binarysearch4(arr2, target2);
        int freq=last-first+1;
        System.out.println("this is the first occurencce:"+first);
        System.out.println("this is the last occurence:"+last);
        System.out.println("this is the freq occurence:"+freq);

    }
}
