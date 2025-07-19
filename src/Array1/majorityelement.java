package Array1;

public class majorityelement {

    public static void majorityElement(int[] arr) {
        int n=arr.length;
        int count=0;
        int element=arr[0];
        int fre=1;
        for(int i=0;i<n;i++){
            if(fre==0){
                element=arr[i];
                fre=1;
            }else if(element==arr[i]){
                fre++;
            }
            else{
                fre--;

            }

        }
        System.out.println("element of the array which is the majarity:"+element);

        for(int i=0;i<n;i++){
            if(arr[i]==element){
                count++;
            }
        }
        System.out.println("count of the element"+count);
        if(count>n/2){
            System.out.println("The majority element is "+element);
        }
        else{
            System.out.println("no fount the majority element");
        }


    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,2,2,3,4,4,2,2,2};
        majorityElement(arr);

    }
}
