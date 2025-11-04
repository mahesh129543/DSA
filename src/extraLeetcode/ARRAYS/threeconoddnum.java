package extraLeetcode.ARRAYS;

public class threeconoddnum {
    public static void threeconoddnum(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] % 2 != 0) {
                cnt++;
                if(cnt==3){
                    System.out.println("true");
                    return ;
                }
            }else{
                cnt=0;
            }

        }
        System.out.println("false");
    }
    public static void main(String[] args) {
        int[] arr={1,2,34,3,4,5,7,23,12};
        int[] arr1={2,6,4,1};
        threeconoddnum(arr);
        threeconoddnum(arr1);

    }
}
