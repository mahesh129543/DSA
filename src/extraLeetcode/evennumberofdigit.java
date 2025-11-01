package extraLeetcode;

public class evennumberofdigit {
public static void evennumberofdigit(int[] arr) {
    int n = arr.length;
    int cntt=0;
    for (int i = 0; i < n; i++) {
        int num = arr[i];
        int cnt=0;
        while(num>0){
            cnt++;
            num/=10;

        }
        if(cnt%2==0){
            cntt++;

        }
    }
    System.out.println(cntt);
}
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
        int[] arr1={555,901,482,1771};
        evennumberofdigit(arr);
        evennumberofdigit(arr1);
    }
}
