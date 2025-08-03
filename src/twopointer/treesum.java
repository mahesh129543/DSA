package twopointer;

public class treesum {
    static void treesum(int[] arr,int target) {
        int cnt=0;
        for(int i=0;i<arr.length-2;i++){
            int j=i+1;
            int k=arr.length-1;

            while(j<k) {
                if (arr[j] + arr[k] > target - arr[i]) {
                    k--;
                } else {
                    cnt = cnt + (k - j);
                    j++;
                }
            }


        }System.out.println(cnt);

    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,5,7,11};
        int target=8;
        treesum(arr,target);
    }
}
