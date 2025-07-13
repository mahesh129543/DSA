package Array1;

public class eqilibriumindex {
    public  static int eqilibriumIndex(int[] arr, int n){
        int[] ps=new int[n];
        ps[0]=arr[0];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        int cnt=0;

        for(int i=0;i<n;i++){

           int left_sum=(i==0)?0:ps[i-1];

            int right_sum = ps[n - 1] - ps[i];

            if(left_sum == right_sum){

                cnt++;
                System.out.println("equilibrium index: "+i);
            }
        }return cnt;


    }
    public static void main(String[] args) {
        int[] arr={-7,1,5,2,-4,3,0};
        int n=arr.length;
        int res=eqilibriumIndex(arr,n);
        System.out.println(res);

    }
}
