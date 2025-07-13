package Array1;

public class subarray {
    public static int subArray(int[] arr){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                int sum=0;
                for (int k = i; k <= j; k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                    if (sum>largest){
                        largest=sum;

                    }
                }

                System.out.println();

            }
        }
        System.out.println("largest sum of the array :"+largest);
     return 0;
    }
    public static  int subArray2(int[] arr,int n){
        int largest=Integer.MIN_VALUE;
        int[] csum=new int[n];
        csum[0]=arr[0];
        for(int i=1;i<n;i++){
            csum[i]=csum[i-1]+arr[i];
            if(csum[i]<0){
                csum[i]=0;

            }
            else if(csum[i]>largest){
                largest=csum[i];

            }



        }
        System.out.println("largest sum of the array :"+largest);

        return 0;

    }
    public static int startindexSubarraysum(int[] arr){

        for(int j=2;j<arr.length;j++){
            int sum=0;

            for(int k=j;k<=j;k++){
                sum+=arr[k];
            }System.out.println("give starting subarray sum:"+sum);

        }
        return 0;

    }
    public  static int threeelementsubarraysum(int[] arr){

        for(int i=0;i<arr.length-2;i++){
            int sum=0;
            for(int k=i;k<=i+2;k++){
                sum+=arr[k];
            }      System.out.println("three element suarray sum:"+sum);
        }

        return 0;
    }
    public static int noisPresentinsubarray(int[] newarr){
        int cnt=0;
        for(int i=0;i<=3;i++){

            for(int j=3;j< newarr.length;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(newarr[k]+" ");

                }
                cnt=cnt+1;


                System.out.println();


            }



        }
        System.out.println("count of the index present int he sub array is the :"+cnt);
        return 0 ;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        subArray(arr);
        subArray2(arr,n);
        startindexSubarraysum(arr);
        threeelementsubarraysum(arr);
        int[] newarr={3,-2,4,-1,2,6};
         noisPresentinsubarray(newarr);



    }
}
