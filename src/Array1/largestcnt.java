package Array1;

public class largestcnt {
    public static int largestCnt(int[] arr) {
        int cnt=0;
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[i]>arr[j]) {
                    cnt++;
                    break;
                }

            }


        }return cnt;

    }
    public static int largestCnt1(int[] arr) {
        int largest=Integer.MIN_VALUE;
        int cnt=0;
        for(int i=0; i<arr.length-1; i++) {
            if(arr[i]>largest) {
                largest=arr[i];
                cnt=1;

            }
            else if(arr[i]==largest) {
                cnt=cnt+1;

            }

        }return cnt;

    }
    public static void main(String[] args) {
        int[] arr={-3,4,2,5,6,3,2,3,42,5,6};
        System.out.println(largestCnt(arr));
        System.out.println(largestCnt1(arr));


    }
}
