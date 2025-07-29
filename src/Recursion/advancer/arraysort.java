package Recursion.advancer;

public class arraysort {
    public static boolean checkArraySort(int[] arr,int n) {
        if(n==0 ){
            return true;
        }if(n==1){
            return true;
        }
         if((arr[n-1]>arr[n-2])&&(checkArraySort(arr,n-1))){
             return false;
         }


       return true;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,8,9};
        System.out.println(checkArraySort(arr,arr.length));

    }
}
