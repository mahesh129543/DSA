package twopointer;

public class sumoftwono {
    static void sum(int[] arr,int target) {
        int i=0;
        int j=arr.length-1;
        while(i<j) {
            if(arr[i]+arr[j]==target) {
                i++;
                j--;
            }else if(arr[i]+arr[j]<target) {
                i++;
            }
            else{
                j--;
            }

        } System.out.println(arr[i]+" "+arr[j]);
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,8,9,12,13,15,17,23,25};
        int target=13;
        sum(arr,target);
    }
}
