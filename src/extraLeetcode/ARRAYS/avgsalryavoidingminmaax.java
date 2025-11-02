package extraLeetcode.ARRAYS;

public class avgsalryavoidingminmaax {
    public static void avgsalryavoidingminmaax(int[] arr) {
        int n = arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double sum=0;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println(min + " " + max);
        for (int i = 0; i < n; i++) {
            if(arr[i]!=min&&arr[i]!=max){
                sum+=arr[i];

            }
        }
        System.out.println(sum);
        double avg=sum/(n-2);
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int[] arr = {4000,3000,1000,2000};
        avgsalryavoidingminmaax(arr);
    }
}
