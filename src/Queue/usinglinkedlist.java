package Queue;

class Node{
    int data;
    Node next;
    Node(int d){
    data = d;
    next = null;
    }
}

public class usinglinkedlist {
    Node head;
    Node tail;

    void push(int d){
        if(head == null){
            head= tail= new Node(d);
        }else{
            tail.next = new Node(d);
            tail = tail.next;
        }
    }
    void pop(){
        if(head != null){
            head = head.next;
        }
        if(head == null){
            head = null;
        }

    }
    int getFirst(){
        if(head != null){
            return head.data;
        }
   return 0;
    }
    void printfun(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        usinglinkedlist obj = new usinglinkedlist();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.printfun();
        obj.pop();
        obj.printfun();
        System.out.println(obj.getFirst());

    }
}
