package Recursion;

public class Arrayissorted {
    public static boolean isSorted(int[] arr,int i) {
        System.out.println("checking the array is sort or not using the recursion function:");
        int n = arr.length;
        if(i==n-1){
            return true;
        }
        return arr[i]<arr[i+1]&&isSorted(arr,i+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,9,8};
        System.out.println(isSorted(arr,0));

    }
}
