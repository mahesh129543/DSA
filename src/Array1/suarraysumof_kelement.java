package Array1;

public class suarraysumof_kelement {
    public static int subarraySum(int[] arr, int k) {
        System.out.println("basic approoach like bruate force:");
        int largest = Integer.MIN_VALUE;
        int n = arr.length-1;
        for(int i=0;i<=n-k;i++){
            int j=i+k-1;
            int sum=0;
            for(int l=i;l<=j;l++){
                sum+=arr[l];

            }
            if(sum>largest){
                largest=sum;


            }
        }return largest;

    }
    public static int subarraySum2(int[] arr, int k) {
        System.out.println(" approoach 2 like prefix sum :");

        int n = arr.length;
        int[] ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i]=ps[i-1]+arr[i];
            if(ps[i]<0){
                ps[i]=0;
            }
            System.out.print(ps[i]+" ,");

        }System.out.println();
        int largest = Integer.MIN_VALUE;

       int sum=0;
        for(int i=1;i<n-k;i++){
            int j=i+k-1;
            sum=ps[j]-ps[i-1];

        }
        if(sum>largest){
            largest=sum;
        }
        return largest;
    }
    public static int subarraySum3(int[] arr, int k) {
        System.out.println(" approoach 3 like sliding window :");
        int n = arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int ans=sum;
        for(int i=1;i<n-k;i++){
            sum=sum+arr[k+i-1]-arr[i-1];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-3,4,-2,5,3,-2,8,2,-1,4};
        int k=3;
         int res=subarraySum(arr, k);
         System.out.println("sum of the largest sub array:"+res);
         int res2=subarraySum2(arr, k);
         System.out.println("sum of the largest sub array using prefix sum:"+res2);
         int res3=subarraySum3(arr, k);
         System.out.println("sum of the largest sub array using sliding window:"+res3);

    }
}
