package bit_Manipulation;

public class generateno {
    public static int getno(int x,int y){
        System.out.println("Generate the number int geting x an y and the default no is the zero");
        int first_no=1<<x;
        int second_no=1<<y;
        System.out.println(first_no+" "+second_no);
        System.out.println(first_no | second_no);

        return (first_no+second_no);


    }
    static int getIthbit(int n,int i){
        System.out.println("find the i th bit in the binary number");
        int res=(n>>i)&1;
        System.out.println("geting bit is the:"+res);
        return res;
    }
    public static int getIthbit2(int n ,int i){
        System.out.println("find the i th bit in the binary number using seond approach is bitmasking:");
        int res=n&(1<<i);
        if(res>0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int setIthbit(int n ,int i){
        System.out.println("set  the ith bit is 1 in the binary number");
        int res=n|(1<<i);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getno(3,1));
        getIthbit(10,1);
       int x=getIthbit2(10,1);
        System.out.println("using masking:"+x);
        int y=setIthbit(10,2);
        System.out.println(" set the ith bit is using masking:"+y);

    }
}
