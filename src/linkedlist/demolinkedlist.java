package linkedlist;
class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}

public class demolinkedlist {
    static Node createLinkedList(int n){
        Node head = new Node(1);
        Node tail = head;
        for(int i=2; i<=n; i++){
            tail.next = new Node(i);
            tail = tail.next;
        }
        return head;
    }
    static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
        System.out.println();
    }
    static int lengthofll(Node head){
        Node temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;

        }return length;
    }
    static Node inserthead(Node head, int data){
        //in this case the head parameter is the loacal variable it can not be
        //be the change so the return the n;
        Node n=new Node(data);
        n.next=head;
        return n;

    }

    static Node insertAtpos(Node head, int data, int pos){
        if(pos==0){
            return inserthead(head,data);
        }
        if(pos>lengthofll(head)){
            return head;
        }
        Node temp=head;
        for(int i=1;i<=pos-1;i++){
            temp=temp.next;

        }
        Node n=new Node(data);//creating the new obj
        n.next=temp.next;
        temp.next=n;
        return head;

    }


    public static void main(String[] args) {
       Node linkedlist= createLinkedList(9);
        printLinkedList(linkedlist);
        System.out.println("length of the linkedlist is:"+lengthofll(linkedlist));
        linkedlist=inserthead(linkedlist,300);//updating the head here
        printLinkedList(linkedlist);
        linkedlist=insertAtpos(linkedlist,900,3);
        printLinkedList(linkedlist);
        //and printing the update linklist
//        Node tail = new Node(1);
//        Node head = tail;
//        tail.next = new Node(2);
//        tail=tail.next;
//        tail.next = new Node(3);
//        tail=tail.next;
    }
}
