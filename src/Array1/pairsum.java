package Array1;

public class pairsum {
    public static int pairsum(int[] arr, int b) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                if(arr[i]+arr[j]==b){
                    System.out.println(arr[i]+" "+arr[j]);


                }

            }

        }return arr[arr.length-1];



    }
    public static int pairsum1(int[] arr,int b) {
      int s=0;
      int e=arr.length-1;
      while(s<e){
          int goal=arr[s]+arr[e];
          if(goal>b){
              e--;

          }
          else if(goal<b){
              s++;
          }
          else{
              System.out.println(arr[s]+" "+arr[e]);
              s++;
              e--;
          }

      }return 0;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,6,10,12,15};
        int b=11;
        System.out.println(pairsum(arr,b));
        System.out.println(pairsum1(arr,b));


    }
}
