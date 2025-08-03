package twopointer;

public class checksubseqarraypresent {
    public static int checkpresentornot(int[] arr,int[] arr2){
        for (int i=0;i<arr2.length;i++){
            int s=0;
            int e=arr.length-1;
            while(s<=e){
                int mid=(e+s)/2;
                if(arr[mid]==arr2[i]){
                    System.out.println("yes");
                    break;

                }else if(arr[mid]<arr2[i]){
                    s=mid+1;

                }else{
                    e=mid-1;
                }
            }

        }return -1;
    }
    public static boolean checkpresentornot2(int[] arr,int[] arr2){

        int i=0;
        int j=0;

        while(i<arr.length&&j<arr2.length){
            if(arr2[j]!=arr[i]){
                i++;
            }
            else{
                i++;
                j++;
            }
        }
        if(i==arr.length){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr ={1,3,5,7,10,14};
        int[] arr2 ={3,10,14};
        System.out.println(checkpresentornot(arr,arr2));
        System.out.println(checkpresentornot2(arr,arr2));
    }
}
