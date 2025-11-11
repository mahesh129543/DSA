package Queue;

public class buildingqueueofarray {
    int arr[];
    int front;
    int rear;
    int cs;
    int n;

    buildingqueueofarray(int defaultsize) {
        n=defaultsize;
        arr = new int[defaultsize];
        front = 0;
        rear = 0;
    }
    void push(int x) {
        if(isFull()) {
            System.out.println("Queue is full");
        }
        arr[rear] = x;
        rear = (rear + 1) % n;
        cs++;
    }
    void pop() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
        }
        front = (front + 1) % n;
        cs--;

    }
    boolean isEmpty() {
        return (cs==0);
    }
    boolean isFull() {
        return (cs==n);
    }
    int getfirst(){
        if(!isEmpty()){
            return arr[front];
        }else
        {
            System.out.println("error");
        }
        return 0;
    }


    public static void main(String[] args) {
        buildingqueueofarray ob = new buildingqueueofarray(5);
        ob.push(1);
        ob.push(2);
        ob.push(3);
        ob.push(4);

        ob.push(5);

        ob.pop();


        while(!ob.isEmpty()){
            System.out.println(ob.getfirst());
            ob.pop();
        }

    }
}
