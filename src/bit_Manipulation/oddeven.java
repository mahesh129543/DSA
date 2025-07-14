package bit_Manipulation;

public class oddeven {
    public static int oddeven(int n) {
        if((n&1)==1){
            System.out.println("bo is the odd");
        }
        else{
            System.out.println("bo is not the even");
        }return 0;
    }
    public static int exclusiveOroperater(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++){
            res=res^arr[i];

        }return res;

    }
    public static void main(String[] args) {
        oddeven(5);
        int[] arr={4,4,5,5,6,7,8,6,8};
        int x=exclusiveOroperater(arr);
        System.out.println("unique number from the array:"+x);



    }
}
