package binarysearch;

public class squareroot {
    public static int searchQuareroot(int n) {
        int s=0;
        int e=n;
        int ans=-1;
        while(s<=e) {
            int mid=(e+s)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid>n){
                ans=mid-1;
                e=mid-1;
            }else{
                s=mid+1;
            }

        }return ans;


    }
    public static float decimal(int n,int p) {
        float ans=searchQuareroot(n);
        float inc= 0.1F;
        for(int i=0;i<=p;i++) {
            while(ans*ans<=n){
                ans+=inc;

            }
            ans=ans-inc;
            inc=inc/10;

        }
        return ans;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(searchQuareroot(n));
        System.out.println(decimal(n,3));
    }
}
