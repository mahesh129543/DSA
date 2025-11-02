package extraLeetcode.ARRAYS;

public class kthmissingposinum {
    public static void kthmissingposinum(int[] arr, int k) {

        int n = arr.length;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k){
                s=mid+1;
            }else{
                e=mid-1;
            }

        }
        System.out.println(s+k);





//        int j = 0;
//        int cnt = 0;
//        int i = 1;
//
//        while (cnt < k) {
//
//            if (j < arr.length && arr[j] == i) {
//                j++;
//            } else {
//                cnt++;
//                if (cnt == k) {
//                    System.out.println(i);
//                    return;
//                }
//            }
//            i++;
//        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        int[] arr1 = {1,2,3,4};
        int k1 = 2;
        kthmissingposinum(arr, k);
        kthmissingposinum(arr1, k1);
    }
}
