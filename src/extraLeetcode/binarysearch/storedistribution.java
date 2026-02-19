package extraLeetcode.binarysearch;

public class storedistribution {
    public static void stroredistribution(int[] arr, int n) {
        int n1 = arr.length;
        int sum=0;
        for (int i = 0; i < n1; i++) {
            sum+=arr[i];

        }
        int ans=sum/n;
        int rem=sum%n;
        if(rem!=0){
            System.out.println(ans+1);
            return;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int n = 6;
        int[] quantities = {11,6};
        int n1=1;
        int[] quantities1 = {100000};
                stroredistribution(quantities, n);

                stroredistribution(quantities1, n1);
    }
}
