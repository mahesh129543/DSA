package bit_Manipulation;

public class commonoperationinbit {
    public static int getithbit(int n,int i){
        return (n>>i) & 1;

    }
    public static int getithbit1(int n,int i){
        int mask = (1<<i);
        int res=n&mask;

        if(res> 0){
            return 1;

        }
        else{
            return 0;
        }
    }
    public static int updateIthbit(int n,int i , int j){

        int mask = ~(1<<i);
        int res = n & mask;
        return res;

    }
    public static int clearLastIthbit(int n,int i){
        int res=(n>>i)<<i;
        //Another way to create the mask
        int ans=n&(-1<<i);
        System.out.println(ans);
        return res;

    }
    public static int clearbitInrange(int n,int i,int j){
        int a=-1<<(j+1);
        int b=(1<<i)-1;
        int ans=n&(a/b);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(getithbit(10,1));
        System.out.println(getithbit1(10,1));
        System.out.println(updateIthbit(13,2,0));
        System.out.println(clearLastIthbit(13,2));
        System.out.println(clearbitInrange(13,2,0));


    }
}
