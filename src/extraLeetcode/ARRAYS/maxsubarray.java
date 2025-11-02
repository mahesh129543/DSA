package extraLeetcode.ARRAYS;

public class maxsubarray {
    public static void maxsubarray(int[] arr,int k){

        int i=0;
        int j=k-1;
        while(i<arr.length-k && j<arr.length){
            int max=Integer.MIN_VALUE;
            for(int l=i; l<=j; l++){
                max=max+arr[l];

            }
            i++;
            j++;
            int res=max/k;
            System.out.println(res);
        }

    }
    public static void main(String[] args) {
        int[] arr ={1,12,-5,-6,50,3};
        int k=4;
        maxsubarray(arr,k);
    }
}
