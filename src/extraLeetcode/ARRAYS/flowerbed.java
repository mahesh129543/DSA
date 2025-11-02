package extraLeetcode.ARRAYS;

public class flowerbed {
    public static void flowwer(int[] arr, int r){
        int n = arr.length;
        int i=1;
        int cnt=0;
        while(i<n-1){
            if(arr[i]==0) {
                if (arr[i - 1] == 0&& arr[i+1]==0){
                    cnt=cnt+1;
                }

            }
            i++;

        }
        if(cnt>=r){
            System.out.println("true");

        }else {
            System.out.println("false");
        }

    }
    public static void main(String[] args) {
        int[] arr={1,0,0,0,0,1};

        flowwer(arr,1);

    }
}
