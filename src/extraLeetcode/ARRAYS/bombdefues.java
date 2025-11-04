package extraLeetcode.ARRAYS;

public class bombdefues {
    public static void bombdefues(int[] arr,int k) {
        int n = arr.length;
        int totalsum=0;
        for(int i=0;i<n;i++) {
            totalsum+=arr[i];
        }
        System.out.println(totalsum);
        for(int i=0;i<n;i++) {

        }
    }
    public static void main(String[] args) {
        int[] arr={ 5,7,1,4};
        int k = 3;
        bombdefues(arr,k);
    }
}
